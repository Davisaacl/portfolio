import google.generativeai as genai
# add streamlit import
import streamlit as st

st.title("Google Gemini API Example")
# Set up the Google Generative AI API
st.sidebar.title("Google Gemini API Configuration")
st.sidebar.write("This app demonstrates how to use the Llama 2 model to generate text content.")
# Add configurations for the model parameters like temperature, max output tokens, etc. via range sliders.
st.sidebar.subheader("API Configuration")
temperature = st.sidebar.slider("Temperature", 0.0, 1.0, 0.5)
max_output_tokens = st.sidebar.slider("Max Output Tokens", 1, 1014, 256)
top_p = st.sidebar.slider("Top p", 0.0, 1.0, 0.9)

st.subheader("Response from Gemini API:")  

# Set up API key
genai.configure(api_key="Gemini API key")

# Load Gemini model (free version = gemini-2.0-flash)
model = genai.GenerativeModel(model_name="gemini-2.0-flash",
generation_config={
    "temperature": temperature,
    "max_output_tokens": max_output_tokens,
    "top_p": top_p
})
# Create a text input for the prompt
prompt=st.text_input("Enter your prompt")
# Add button to generate content
if st.button("Generate Content"):
    # Generate content using the model
    with st.spinner("Generating response..."):
        response = model.generate_content(prompt)
        # Display the response
        st.write(response.text)