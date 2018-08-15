package com.lancefallon.restapidemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController(value = "/api/helloworld")
public class Controller {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> helloWorldGet() {
        StringBuilder sb = new StringBuilder("This is the response body...");
        sb.append("And now I am appending something else.");
        Map<String, String> response = new HashMap<>();
        response.put("body", sb.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/helloworld/premium", method = RequestMethod.GET)
    public ResponseEntity<Map<String, String>> helloWorldGetPremium() throws Exception {
        throw new Exception("/api/helloworld/premium is in development.");
    }

}
