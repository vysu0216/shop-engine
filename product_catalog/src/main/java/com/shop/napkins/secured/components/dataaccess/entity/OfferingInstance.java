package com.shop.napkins.secured.components.dataaccess.entity;


import com.shop.napkins.components.entity.BaseCharacteristic;
import com.shop.napkins.components.entity.BaseEntity;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "offering_instances")
public class OfferingInstance extends BaseEntity {
    private PriceModel priceModel;
    private ProductLine productLine;
    private UUID customerId;
    private List<BaseCharacteristic> characteristics;
    private List<Discount> discounts;
}