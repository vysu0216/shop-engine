package com.shop.napkins.secured.components.dataaccess.entity;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Kisa {
    String name;
    String says;
    Food eat;
}