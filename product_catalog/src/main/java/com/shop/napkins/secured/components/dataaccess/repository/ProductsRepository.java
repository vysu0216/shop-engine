package com.shop.napkins.secured.components.dataaccess.repository;

import com.mongodb.client.result.DeleteResult;
import com.shop.napkins.secured.components.dataaccess.entity.OfferingInstance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductsRepository extends MongoRepository<OfferingInstance, UUID>, ProductsRepositoryCustom {
}
