package com.shop.napkins.components.entity;

import java.util.Date;
import java.util.UUID;
import lombok.*;
import org.springframework.data.annotation.Id;

@ToString
@Data
public class BaseEntity {
    @Id
    UUID id;
    String name;
    String localizedName;
    Date creationDate;
    Date modificationDate;
    public BaseEntity() {
        setId(UUID.randomUUID());
    }
}
