FROM debian:bullseye-slim

RUN apt-get update && \
    apt-get install -y curl jq python3 python3-pip python3-venv file && \
    rm -rf /var/lib/apt/lists/*

# Copy your script into the container and make it executable
COPY cli.sh /usr/local/bin/ses
RUN chmod +x /usr/local/bin/ses

COPY google_login.py /
COPY test.txt /

# Add alias for all shells (bash, sh)
RUN echo "alias ses='/usr/local/bin/ses'" >> /etc/bash.bashrc

CMD ["/bin/bash"]
