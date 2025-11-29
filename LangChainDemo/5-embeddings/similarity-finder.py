import numpy as np
from langchain_ollama import OllamaEmbeddings

llm=OllamaEmbeddings(model="llama3.2:latest")

text1 = input("Enter the text1")
text2 = input("Enter the text2")
response1 = llm.embed_query(text1)
response2 = llm.embed_query(text2)

similarity_score = np.dot(response1,response2)

print(similarity_score*100,'%')