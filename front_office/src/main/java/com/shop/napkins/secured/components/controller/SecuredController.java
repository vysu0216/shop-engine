package com.shop.napkins.secured.components.controller;

import com.shop.napkins.secured.components.service.TestService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/secured/welcome-secured")
public class SecuredController {

    @Autowired
    TestService2 testService2;

    @RequestMapping(path = "/welcome")
    ResponseEntity<String> welcomeController() {
        return new ResponseEntity<>(testService2.test(), HttpStatus.OK);
    }

}
