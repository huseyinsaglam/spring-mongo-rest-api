package com.example.springmongorestapi.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.HashMap;

@Document
@Getter
@Setter
public class Kullanici {

    @Id
    private Long id;
    private String name;
    private String surname;
    private HashMap skills;
}
