# Server that requires X.509 auth

Based on this blog: https://blog.codecentric.de/en/2018/08/x-509-client-certificates-with-spring-security/

## Pass Phrases for checked in files:
server, client, changeit

## Example GET
curl -ik --cert client.crt --key clientprivate.key "https://localhost:8443/api?name=mike"

## Example POST
curl -ik --cert client.crt --key clientprivate.key -X POST -H "Content-Type: application/json" -d '{"greeting": "Hello there"}' "https://localhost:8443/api/"

