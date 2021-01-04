package com.komet.conf.kometconf.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "api")
@RestController
public class Example {

    @GetMapping(path = "/example")
    public ResponseEntity<String> example() {
        return ResponseEntity.ok().body("KOMET - CONF");
    }
}
