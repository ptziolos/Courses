from langchain_ollama import ChatOllama
from langchain_core.prompts import ChatPromptTemplate
import base64

def encode_image(image_path):
    with open(image_path, "rb") as image_file:
        return base64.b64encode(image_file.read()).decode()

llm = ChatOllama(model="llama3.2-vision:11b")
# llm = ChatOllama(model="gemma3:4b")
image = encode_image("airport-terminal-journey.jpeg")
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
                        "url": f"data:image/jpeg;base64,{image}",
                        "detail": "low",
                    },
                },
            ],
        ),
    ]
)

chain = prompt | llm

response = chain.invoke({"input": "Explain"})
print(response.content)