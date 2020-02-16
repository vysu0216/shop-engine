package com.shop.napkins.normal.components.controller;

import com.shop.napkins.secured.components.dataaccess.entity.Fish;
import com.shop.napkins.secured.components.dataaccess.entity.Food;
import com.shop.napkins.secured.components.dataaccess.entity.Kisa;
import com.shop.napkins.secured.components.service.CommonWebApplicationService;
import com.shop.napkins.secured.components.service.TestService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NormalController {
    @Autowired
    CommonWebApplicationService commonWebApplicationService;

    @Autowired
    TestService2 testService2;

    @RequestMapping(path = "/welcome"/*, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE*/)
        //@ResponseBody
    ResponseEntity<Kisa> welcomeController() {
        Food fish = new Fish("Seledka", testService2.test(), "Ocean");
        Kisa kisa = new Kisa("Julia", commonWebApplicationService.test(), fish);

        return new ResponseEntity<>(kisa, HttpStatus.OK);
    }

}
