from langchain_community.document_loaders import PyPDFLoader
from langchain_community.document_loaders import Docx2txtLoader
from langchain_text_splitters import RecursiveCharacterTextSplitter
from langchain_chroma import Chroma
from langchain_core.prompts import ChatPromptTemplate
from langchain_classic.chains import create_retrieval_chain
from langchain_classic.chains.combine_documents import create_stuff_documents_chain
from langchain_ollama import OllamaEmbeddings
from langchain_ollama import ChatOllama

embeddings = OllamaEmbeddings(model="llama3.2")
llm = ChatOllama(model="llama3.2")

document = PyPDFLoader("academic-research-data.pdf").load()
text_splitter= RecursiveCharacterTextSplitter(chunk_size=1000,
                                              chunk_overlap=200)
chunks=text_splitter.split_documents(document)
vector_store=Chroma.from_documents(chunks,embeddings)
retriever = vector_store.as_retriever()

prompt_template = ChatPromptTemplate.from_messages(
[
    ("system","""You are an assistant for answering questions.
    Use the provided context to respond.If the answer 
    isn't clear, acknowledge that you don't know. 
    Limit your response to three concise sentences.
    {context}
    
    """),
    ("human", "{input}")
]
)

qa_chain = create_stuff_documents_chain(llm,prompt_template)
rag_chain = create_retrieval_chain(retriever,qa_chain)

print("Chat with Document")
question=input("Your Question")

if question:
    response = rag_chain.invoke({"input":question})
    print(response['answer'])


'''
Sample Questions

1. What are the key findings from recent studies on the impact of climate change on coral reefs?

2. How has ocean warming affected fish populations according to recent research?

3. What adaptations have marine species developed in response to climate change?

4. What are the predicted consequences of ocean acidification on marine food webs?

5. What strategies have been suggested for marine conservation in response to climate change?

'''