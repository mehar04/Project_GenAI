# 📱 ImageIQ — AI-powered Image Understanding App

An Android app built with Jetpack Compose, TensorFlow Lite, and MediaPipe Generative AI (Gemma 3 1B IT CPU) to classify cat/dog images, generate captions, and produce natural-language descriptions completely on-device, without requiring an internet connection.

🚀 Features

✅ 1. Image Classification (Cats vs Dogs)

  ● Uses a TensorFlow Lite image classifier model.

  ● Classifies each image as Cat or Dog.

  Shows both:

    ● Expected label 
    
    ● Model-predicted label

✅ 2. Image Captioning

  A custom CNN + LSTM TFLite pipeline generates textual captions.

  Example:
  “Cat laying on a bed with a blanket.”

✅ 3. On-Device LLM Description (Gemma 3 1B IT CPU using MediaPipe LiteRT)

  ● A fully offline, on-device LLM.

  ● Model used: Gemma3-1B-IT_multi-prefill-seq_q8_ekv2048.task

  ● Generates a 1–2 sentence description from the caption.

  ● Uses MediaPipe GenAI APIs:

    ● LlmInference
    
    ● LlmInferenceSession
    
  ● No network calls → fast, private, secure.

✅ 4. Random Image Dataset Loader

  ● Provides a random cat or dog image on each click.

  ● Images fetched from free online APIs.

✅ 5. Clean Jetpack Compose UI

  ● Modern Material 3 UI.

  ● Display sections:

    ● Classified label
    
    ● Original image
    
    ● Generated caption
    
    ● LLM-generated description

🧠 Architecture

  MVVM + Hilt Dependency Injection

    ● MainViewModel handles all classification + caption + LLM logic.
    
    ● Repository layer fetches random images.
    
    ● ImageClassifier, ImageCaptioner, and LlmDescriptor are injected using Hilt.

🛠 Requirements

  ● Android Studio Ladybug (or newer)

  ● Android SDK 29+

  ● A device with NNAPI or CPU capable of running 1B-parameter LLM

  ● Minimum 2GB RAM recommended

🔧 Tech Stack

  ● Kotlin

  ● Jetpack Compose

  ● MediaPipe GenAI (LlmInference)

  ● TFLite (Image Classification + Captioning)

  ● Hilt Dependency Injection

  ● WorkManager

  ● Coil (Image Loading)

💡 What Makes This App Unique?

🧠 Runs an LLM fully on-device

    ● No internet required
    
    ● No API cost
    
    ● Privacy-preserving
    
    ● Uses 1B parameter Gemma model (quantized)

🌁 Deep Vision + Language Pipeline

    ● First: Vision CNN
    
    ● Second: Caption LSTM
    
    ● Third: Natural language LLM response
    
  A complete multimodal pipeline — on your phone.

🧩 Lightweight and fully offline

  Zero network calls after initial model download.
