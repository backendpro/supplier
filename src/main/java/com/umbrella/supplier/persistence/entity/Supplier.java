package com.umbrella.supplier.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier {

    private Long id;

    private String fantasyName;

    private String formalName;

    private String document;

    private String stateDocumentId;

    private Address address;

    private Contact contact;


}
