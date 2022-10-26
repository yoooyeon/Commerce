package com.yooyeon.commerce.domain.user.entity;

import com.yooyeon.commerce.domain.common.BaseTimeEntity;
import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address extends BaseTimeEntity {

    private String city;
    private String street;
    private String zipcode;

    protected Address(){}

    public Address(String city, String street, String zipcode){
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}