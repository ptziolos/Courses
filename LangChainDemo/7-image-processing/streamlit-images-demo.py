from langchain_ollama import ChatOllama
from langchain_core.prompts import ChatPromptTemplate
import base64
import streamlit as st

def encode_image(image_file):
    return base64.b64encode(image_file.read()).decode()

llm = ChatOllama(model="gemma3:4b")

with open("7-image-processing/airport-terminal-journey.jpeg", "rb") as f:
    image = encode_image(f)

prompt = ChatPromptTemplate.from_messages(
    [
        ("system", "You are a helpful assistant that can describe images."),
        (
            "human",
            [
                {"type": "text", "text": "{input}"},
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

uploaded_file = st.file_uploader("Upload your image",type=["jpg", "jpeg", "png"])
question = st.text_input("Enter a question")

if question:
    if uploaded_file:
        image=encode_image(uploaded_file)
    response = chain.invoke({"input": question,"image":image})
    st.write(response.content)

# To run streamlit-images-demo use the following command:
# streamlit run 7-image-processing/streamlit-images-demo.py