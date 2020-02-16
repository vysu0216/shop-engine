package com.shop.napkins.common.components.controller;

import com.shop.napkins.common.components.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/common/product-category")
public class Products {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping(path = "/{productCategoryName}")
    ResponseEntity<String> getProductCategoryByName(@PathVariable("productCategoryName") String productCategoryName) {
        return new ResponseEntity<>(productCategoryService.getCategoryName(productCategoryName), HttpStatus.OK);
    }

}
