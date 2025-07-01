import http.server, socketserver, threading, json, webbrowser, secrets

PORT = 8765
STATE = secrets.token_urlsafe(16)

class Handler(http.server.BaseHTTPRequestHandler):
    def do_OPTIONS(self):
        # Respond to preflight CORS requests
        self.send_response(200)
        self.send_header("Access-Control-Allow-Origin", "*")
        self.send_header("Access-Control-Allow-Methods", "POST, OPTIONS")
        self.send_header("Access-Control-Allow-Headers", "Content-Type")
        self.end_headers()

    def do_POST(self):
        # Add CORS header
        self.send_response(200)
        self.send_header("Access-Control-Allow-Origin", "*")
        self.end_headers()

        content_length = int(self.headers['Content-Length'])
        post_data = self.rfile.read(content_length)
        token = json.loads(post_data.decode('utf-8'))['token']
        # Save token for your CLI to use later
        with open('/tmp/ses_token', 'w') as f:
            f.write(token)
        self.wfile.write(b'Login successful. You may close this window.')
        # Shut down the server after login
        threading.Thread(target=server.shutdown).start()

    def log_message(self, format, *args):
        return  # Silence HTTP server logs

if __name__ == '__main__':
    server = socketserver.TCPServer(("", PORT), Handler)
    url = f"https://ses-drive.io/cli-login?state={STATE}"
    print(f"Opening browser for Google login (if it does not open, visit this URL manually):\n{url}")
    webbrowser.open(url)
    print("Waiting for Google login in browser...")
    server.serve_forever()
    print("Login complete. Check the received cookie run: `ses cookie`")
