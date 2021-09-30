package com.umbrella.supplier.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

    private Long id;

    private String email;

    private Long phoneNumber;

    private Long cellPhone;

    private Long sacNumber;


}
