package com.shop.napkins.secured.components.dataaccess.entity;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fish implements Food {
    String name;
    String taste;
    String lives;

}
