package com.shop.napkins.secured.components.dataaccess.repository;

import com.shop.napkins.secured.components.dataaccess.entity.OfferingInstance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductsRepository extends MongoRepository<OfferingInstance, UUID>, ProductsRepositoryCustom {
}
