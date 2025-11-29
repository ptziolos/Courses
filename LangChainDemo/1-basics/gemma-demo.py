from langchain_ollama import ChatOllama

# Initialize the LLM
llm = ChatOllama(model="gemma:2b")

# Ask a question
question = input("Enter the question: ")
response = llm.invoke(question)

# Print the answer
print(response.content)

