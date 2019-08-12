package com.example.server.server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api")
public class APIEndpoint {
  private static final Logger log = LoggerFactory.getLogger(APIEndpoint.class);

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<String> get(@RequestParam String name) {
    log.info("/api GET invoked. Name = {}", name);
    return new ResponseEntity<>("Hello " + name, HttpStatus.OK);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<?> post(HttpServletRequest request) throws IOException {
    final String json = convertToString(request.getInputStream());

    log.info("/api POST invoked. JSON = {}", json);
    return new ResponseEntity<Object>(null, HttpStatus.OK);
  }

  private String convertToString(InputStream inputStream) throws IOException{
    StringBuilder textBuilder = new StringBuilder();
    try (Reader reader = new BufferedReader(new InputStreamReader
            (inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
      int c = 0;
      while ((c = reader.read()) != -1) {
        textBuilder.append((char) c);
      }
    }
    return  textBuilder.toString();
  }
}
