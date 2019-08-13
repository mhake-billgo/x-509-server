package com.example.server.server.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * This is a mock of an API that PIE exposes for UnCheck Returns
 */
@RestController
public class UnCheckWebService {
  private static final Logger log = LoggerFactory.getLogger(UnCheckWebService.class);

  @PostMapping("/uncheck/payment/return")
  public ResponseEntity<?> post(@RequestBody ReportedReturnRequestDto returnRequestDto) throws IOException {

    log.info("/payment/return invoked with:" + returnRequestDto);
    return new ResponseEntity<Object>(null, HttpStatus.OK);
  }

  @GetMapping("/uncheck/healthcheck")
  public ResponseEntity<?> all() {
    log.info("/uncheck/healthcheck invoked");
    return new ResponseEntity<Object>(null, HttpStatus.OK);
  }
}
