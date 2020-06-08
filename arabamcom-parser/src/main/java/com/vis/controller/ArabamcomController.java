package com.vis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author yahya
 */
@RestController
@RequestMapping("arabamcom")
public class ArabamcomController {

    @RequestMapping
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("arabamcom : " + ThreadLocalRandom.current().nextInt(0, 9999999));
    }

}
