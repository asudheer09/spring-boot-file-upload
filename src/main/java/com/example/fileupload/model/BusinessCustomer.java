package com.example.fileupload.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BusinessCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Lob
    private byte[] photo;
}
