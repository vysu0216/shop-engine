package com.shop.napkins.components.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class BaseCharacteristic extends BaseEntity{
    String type;
    List values;
    List localizedValues;
}
