from langchain_ollama import ChatOllama
import streamlit as st
from langchain_core.prompts import PromptTemplate

llm = ChatOllama(model="mistral-nemo")
# llm=ChatOllama(model="deepseek-r1:7b")

prompt_template = PromptTemplate(
    input_variables=["country","no_of_paragraphs","language"],
    template="""You are an expert in traditional cuisines.
    You provide information about a specific dish from a specific country.
    Avoid giving information about fictional places. If the country is fictional
    or non-existent answer: I don't know.
    Answer the question: What is the traditional cuisine of {country}?
    Answer in {no_of_paragraphs} short paragraphs in {language}
    """
)

st.title("Cuisine Info")

country = st.text_input("Enter the country:")
no_of_paragraphs = st.number_input("Enter the number of paragraphs",min_value=1,max_value=5)
language = st.text_input("Enter the language:")

if country:
    response = llm.invoke(prompt_template.format(country=country,
                                                 no_of_paragraphs=no_of_paragraphs,
                                                 language=language
                                                 ))
    st.write(response.content)

# To run prompt-template-demo use the following command:
# streamlit run 2-prompt-templates/prompt-template-demo.py