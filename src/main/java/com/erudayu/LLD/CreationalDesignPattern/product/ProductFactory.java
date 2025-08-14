package com.erudayu.LLD.CreationalDesignPattern.product;

public class ProductFactory {
    public Product getProduct(ProductCategory type) {
        switch(type){
            case ProductCategory.ELECTRONICS -> {
                return new ElectronicProduct();
            }
            case ProductCategory.CLOTHING -> {
                return new ClothingProduct();
            }
            default -> {
                throw new IllegalArgumentException("Product type not found : " + type );
            }
        }
    }
}
