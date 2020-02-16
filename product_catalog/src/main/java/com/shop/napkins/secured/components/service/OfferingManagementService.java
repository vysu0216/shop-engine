package com.shop.napkins.secured.components.service;

import com.shop.napkins.secured.components.dataaccess.entity.OfferingInstance;
import com.shop.napkins.secured.components.dataaccess.repository.ProductsRepository;

import com.shop.napkins.secured.components.dataaccess.repository.ProductsRepositoryCustom;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OfferingManagementService {

    private Logger LOGGER = Logger.getLogger(OfferingManagementService.class);

    @Autowired
    private ProductsRepository productsRepository;

   /* @Autowired
    private ProductsRepositoryCustom productsRepositoryCustom;*/

    public List<OfferingInstance> getAllOfferingInstances() {
        OfferingInstance offeringInstance = new OfferingInstance();
        return productsRepository.findAll();
    }

    public Optional<OfferingInstance> getAllOfferingInstances(UUID id) {
        return productsRepository.findById(id);
    }

    public List<OfferingInstance> createOfferingInstances(List<OfferingInstance> offeringInstances) {
        productsRepository.saveAll(offeringInstances);
        return offeringInstances;
    }

    public void removeOfferingInstances(List<String> offerIds) {
        LOGGER.debug("OFFERS TO REMOVE: " + offerIds);
        List<UUID> offersUuids = offerIds.stream().map(UUID::fromString).collect(Collectors.toList());
        LOGGER.info("OFFERS TO REMOVE: " + offersUuids);
        productsRepository.deleteAllByIds(offersUuids);
    }

    public void removeOfferingInstance(String offerId) {
        LOGGER.debug("OFFERS TO REMOVE: " + offerId);
        productsRepository.deleteById(UUID.fromString(offerId));
    }
}
