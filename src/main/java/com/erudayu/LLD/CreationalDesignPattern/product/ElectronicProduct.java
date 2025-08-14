package com.erudayu.LLD.CreationalDesignPattern.product;

public class ElectronicProduct implements Product{
    @Override
    public String displayInfo() {
        return "This is an electronic product";
    }
}
