FROM python:3.11-slim

# Set the working directory
WORKDIR /app

# Copy the requirements file
COPY app/requirements.txt .

RUN apt-get update && apt-get install -y \
    tesseract-ocr \
    libtesseract-dev \
    libleptonica-dev \
    poppler-utils \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

# Install virtualenv (optional, if needed)
RUN pip install --no-cache-dir virtualenv

# Create a virtual environment
RUN python -m venv /env

# Install dependencies inside the virtual environment
RUN /env/bin/pip install --no-cache-dir -r requirements.txt

# Copy the rest of your application
COPY . .

# Set the virtual environment's bin directory in PATH
ENV PATH="/env/bin:$PATH"

# Expose the port
EXPOSE 8000

# Command to run FastAPI using uvicorn
CMD ["uvicorn", "app.main:app", "--host", "0.0.0.0", "--port", "8000", "--reload"]
