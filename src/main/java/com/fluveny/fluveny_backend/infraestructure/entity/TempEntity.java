package com.fluveny.fluveny_backend.infraestructure.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection="temp")
public class TempEntity {
    @Id
    String id;
    String name;
}
