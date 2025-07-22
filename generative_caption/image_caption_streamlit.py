from transformers import VisionEncoderDecoderModel, ViTImageProcessor, AutoTokenizer
import torch
from PIL import Image
import streamlit as st

model = VisionEncoderDecoderModel.from_pretrained("model/vit-gpt2-image-captioning")
feature_extractor = ViTImageProcessor.from_pretrained("model/vit-gpt2-image-captioning")
tokenizer = AutoTokenizer.from_pretrained("model/vit-gpt2-image-captioning")

device = torch.device("cuda" if torch.cuda.is_available() else "cpu")
model.to(device)

max_length = 16
num_beams = 1
gen_kwargs = {"max_length": max_length, "num_beams": num_beams}
def predict_step(image_paths):
  images = []
  for image_path in image_paths:
    i_image = Image.open(image_path)
    if i_image.mode != "RGB":
      i_image = i_image.convert(mode="RGB")

    images.append(i_image)

  pixel_values = feature_extractor(images=images, return_tensors="pt").pixel_values
  pixel_values = pixel_values.to(device)

  output_ids = model.generate(pixel_values, **gen_kwargs)

  preds = tokenizer.batch_decode(output_ids, skip_special_tokens=True)
  preds = [pred.strip() for pred in preds]
  return preds

# create ui 
st.title("Image Captioning with ViT-GPT2")
st.write("Upload an image to generate a caption.")
st.sidebar.header("About")
st.sidebar.text("This app uses a pre-trained ViT-GPT2 model to generate captions for images. The model is fine-tuned on the COCO dataset.")
uploaded_file = st.file_uploader("Choose an image...", type=["jpg", "jpeg", "png"])
if uploaded_file is not None:
    image = Image.open(uploaded_file)
    if image.mode != "RGB":
        image = image.convert(mode="RGB")
    
    st.image(image, caption='Uploaded Image.', use_column_width=True)
    st.write("")
    st.write("Generating Caption...")

    # Predict
    with torch.no_grad():
        preds = predict_step([uploaded_file])
        st.write("Caption: " ,preds[0])
# print(predict_step(['Day 4/image.png']))
