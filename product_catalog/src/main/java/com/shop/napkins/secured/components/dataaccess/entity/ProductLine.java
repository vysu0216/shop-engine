package com.shop.napkins.secured.components.dataaccess.entity;

import com.shop.napkins.components.entity.BaseEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "product_line")
public class ProductLine extends BaseEntity {

}