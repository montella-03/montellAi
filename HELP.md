docker exec -it ollama ollama pull llama3
docker run -d --name ollama -p 11434:11434 ollama/ollama
docker exec -it ollama ollama run llama3.2:latest



# Follow above steps to run the container for ollama and llama model.

run the application, you can change the tools in the util to test for diff data sets.
