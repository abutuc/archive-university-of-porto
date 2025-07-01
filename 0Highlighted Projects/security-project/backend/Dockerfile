FROM maven:3.9.9-eclipse-temurin-21-alpine

WORKDIR /app

# Install Python3, pip, and venv
RUN apk add --no-cache python3 py3-pip py3-virtualenv

# Set up a virtual environment for Semgrep
RUN python3 -m venv /venv \
    && /venv/bin/pip install --no-cache-dir semgrep \
    && /venv/bin/semgrep --version

# Ensure the venv bin path is accessible
ENV PATH="/venv/bin:$PATH"

COPY . /app

CMD ["mvn", "clean", "compile"]