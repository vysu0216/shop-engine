package com.shop.napkins.secured.components.dataaccess.repository;

import com.mongodb.client.result.DeleteResult;
import com.shop.napkins.secured.components.dataaccess.entity.OfferingInstance;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Component
public interface ProductsRepositoryCustom {
    public DeleteResult deleteAllByIds(List<UUID> ids);
}
