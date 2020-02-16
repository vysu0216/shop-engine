package com.shop.napkins.secured.components.dataaccess.entity;

import com.shop.napkins.components.entity.BaseCharacteristic;
import com.shop.napkins.components.entity.BaseEntity;

import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PriceModel extends BaseEntity {
    BaseCharacteristic priceAffectingCharacteristic;
    BigDecimal price;
}
