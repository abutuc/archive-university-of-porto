FROM python:3
COPY requirements.txt ./
RUN pip install -r requirements.txt
ADD . /
EXPOSE 5000
CMD ["python3", "-u", "main.py"]