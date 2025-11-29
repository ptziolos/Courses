from langchain_ollama import ChatOllama
from langchain_core.prompts import ChatPromptTemplate
import base64
import streamlit as st
from datetime import date

def encode_image(image_file):
    return base64.b64encode(image_file.read()).decode()

llm = ChatOllama(model="gemma3:4b")

prompt = ChatPromptTemplate.from_messages(
    [
        ("system", "You are a helpful assistant that can verify identification documents."),
        (
            "human",
            [
                {"type": "text", "text": "Verify the identification details."},
                {"type": "text", "text": "Name: {user_name}"},
                {"type": "text", "text": "DOB: {user_dob}"},
                {
                    "type": "image_url",
                    "image_url": {
                        "url": f"data:image/jpeg;base64,""{image}",
                        "detail": "low",
                    },
                },
            ],
        ),
    ]
)

chain = prompt | llm

st.title("KYC Verification Application")
st.write("Upload your identification document:")
uploaded_file = st.file_uploader("Choose an image...", type=["jpg", "jpeg", "png"])

user_name = st.text_input("Enter your name")
user_dob = st.date_input("Enter your date of birth", min_value=date(1950, 1, 1), max_value=date.today())

if uploaded_file is not None and user_name and user_dob:
    st.image(uploaded_file, caption="Uploaded Document", use_column_width=True)
    st.write("Processing your document...")
    image = encode_image(uploaded_file)
    response = chain.invoke({"user_name": user_name, "user_dob": user_dob, "image": image})
    st.write(response.content)

# To run kyc-verification use the following command:
# streamlit run 7-image-processing/kyc-verification.py