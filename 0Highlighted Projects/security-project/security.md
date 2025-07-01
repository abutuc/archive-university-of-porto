# Implemented Security Features

## Frontend

- [x] Only accept safe files (no .sh or .bat etc.)
- [x] Google Authentication (OAuth2)
- [x] Secure Cookies (HttpOnly, Secure, SameSite)
- [x] Content Security Policy (CSP)
- [x] X-Content-Type-Options
- [x] X-Frame-Options
- [x] X-XSS-Protection
- [x] Referrer Policy
- [x] Cross-Origin Resource Sharing (CORS) (only allow trusted domains)
- [x] CSRF Protection
- [x] Rate Limiting
(see the nginx configuration)

## Backend

- [x] Static Analysis (SonarCloud)
- [ ] Logging (SLF4J or Logback or other)
- [x] OWASP Vulnerability Detection and Reporting 
- [x] Authentication & Authorization (use JWT)
- [x] Role-based access control (RBAC)
- [x] Secure Serialization (Quarkus supports secure JSON serialization (e.g., via Jackson) so you can control which fields are exposed over the wire.)
- [ ] Secrets/File Management (integrate Quarkus with external secrets engines (like HashiCorp Vault) to securely manage sensitive configuration values.)
- [ ] Observability of Security Events (with CDI observers, you can listen to authentication or authorization events to perform additional logging or trigger alerts)

## Database

- [x] Encrypt Sensitive Data (AED) (x -> MinIO)

## Other

- [x] Reverse Proxy (Nginx or Traefik) (to handle SSL termination, load balancing, and other security features)
- [x] We have to show that our application is not vulnerable to SQL Injection, CSRF, ...

- [x] Certificate for the domain and use HTTPS.
