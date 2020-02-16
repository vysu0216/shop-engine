package com.shop.napkins.secured.components.controller;

import com.shop.napkins.secured.components.dataaccess.entity.Kisa;
import com.shop.napkins.secured.components.service.CommonWebApplicationService;
import com.shop.napkins.secured.components.service.TestService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/welcome-normal")
public class SecuredController2 {
    @Autowired
    CommonWebApplicationService commonWebApplicationService;

    @Autowired
    TestService2 testService2;

    @RequestMapping(path = "/welcome"/*, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE*/)
        //@ResponseBody
    ResponseEntity<Kisa> welcomeController() {
        return new ResponseEntity("SSECURED", HttpStatus.OK);
    }

}
