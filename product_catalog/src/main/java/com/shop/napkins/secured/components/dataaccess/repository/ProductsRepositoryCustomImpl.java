package com.shop.napkins.secured.components.dataaccess.repository;

import com.mongodb.client.result.DeleteResult;
import com.shop.napkins.secured.components.dataaccess.entity.OfferingInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class ProductsRepositoryCustomImpl implements ProductsRepositoryCustom {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public ProductsRepositoryCustomImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    public DeleteResult deleteAllByIds(List<UUID> ids) {
        Query removeQuery = new Query();
        removeQuery.addCriteria(Criteria.where("id").in(ids));
        return mongoTemplate.remove(removeQuery, OfferingInstance.class);
    }

}
