import asyncio
import streamlit as st

from langchain_ollama import ChatOllama
from langchain_mcp_adapters.client import MultiServerMCPClient
from langchain.agents import create_agent


client = MultiServerMCPClient({
    "tools": {
        "command": "python",
        "args": ["10-model-context-protocol/mcp-server-stdio.py"],
        "transport": "stdio"
    }
})

tools = asyncio.run(client.get_tools())

llm = ChatOllama(model="llama3.2")
agent = create_agent(llm, tools)

st.title("AI Agent (MCP Version)")
task = st.text_input("Assign me a task")

if task:
    response = asyncio.run(agent.ainvoke({"messages": task}))
    st.write(response)
    final_output = response["messages"][-1].content
    st.write(final_output)

# To run mcp-client-stdio use the following command:
# streamlit run 10-model-context-protocol/mcp-client-stdio.py
# !!! The mcp-server-stdio must not be running


# Questions
#
# Wikipedia-only trigger
#
# (Factual, timeless, not time-sensitive)
# 	1.	Who discovered penicillin?
# 	2.	When did World War II end?
# 	3.	What is the capital city of Japan?
# 	4.	Give me the chemical formula of water.
# 	5.	Who is the author of “Pride and Prejudice”?
#
# DDG-only trigger
#
# (Time-sensitive, news-related, recent events)
# 	1.	What’s the latest news about the James Webb Space Telescope?
# 	2.	What are today’s top headlines in technology?
# 	3.	Show me recent stock market updates for Tesla.
# 	4.	What’s trending on social media this week?
# 	5.	Any breaking news about the Olympics 2025?
#
# Likely both tools trigger
#
# (Has both factual & potentially current aspects)
# 	1.	Tell me about the current Prime Minister of India.
# 	2.	What is SpaceX working on now?
# 	3.	Give me details about the FIFA World Cup along with the latest match results.
# 	4.	Who is Taylor Swift and what is her latest album?
# 	5.	Tell me about the iPhone 16 and its latest launch updates.