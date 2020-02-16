package com.shop.napkins.secured.components.controller;

import com.shop.napkins.secured.components.dataaccess.entity.OfferingInstance;
import com.shop.napkins.secured.components.service.OfferingManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/product-management")
public class ProductManagement {

    @Autowired
    private OfferingManagementService offeringManagementService;

    @GetMapping(path = "/all")
    @ResponseBody
    ResponseEntity<List<OfferingInstance>> getAllOfferings() {
        return new ResponseEntity<>(offeringManagementService.getAllOfferingInstances(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<OfferingInstance> getAllOfferingsById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(offeringManagementService.getAllOfferingInstances(id).get(), HttpStatus.OK);
    }

    @PostMapping(path = "/create-new-offerings")
    @ResponseBody
    ResponseEntity<List<OfferingInstance>> createOfferings(@RequestBody List<OfferingInstance> offeringInstances) {
        return new ResponseEntity<>(offeringManagementService.createOfferingInstances(offeringInstances), HttpStatus.OK);
    }

    @RequestMapping(value="/remove-offerings-by-id", method = RequestMethod.DELETE)
    ResponseEntity echoDelete(@RequestBody List offerIds) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping(path = "/remove-offerings-by-id")
    @ResponseBody
    ResponseEntity removeOfferingsById(@RequestBody List<String> offerIds) {
        offeringManagementService.removeOfferingInstances(offerIds);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/remove-offering-by-id/{id}")
    public ResponseEntity deleteOfferingById(@PathVariable String id) {
        offeringManagementService.removeOfferingInstance(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
