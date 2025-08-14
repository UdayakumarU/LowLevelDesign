package com.erudayu.LLD.CreationalDesignPattern.order;

import com.erudayu.LLD.CreationalDesignPattern.product.Product;

import java.util.List;

public class Order {
    String orderId;
    List<Product> products;
    Status status;

    Order(OrderBuilder orderBuilder){
        this.orderId = orderBuilder.orderId;
        this.products = orderBuilder.products;
        this.status = orderBuilder.status;
    }

    @Override
    public String toString(){
        return String.format("%s : %d items were %s ",orderId, products.size(), status);
    }


    public static class OrderBuilder{
        String orderId;
        List<Product> products;
        Status status;

        public OrderBuilder(String orderId){
            this.orderId = orderId;
        }

        public OrderBuilder setProducts(List<Product> products) {
            this.products = products;
            return this;
        }

        public OrderBuilder setStatus(Status status){
            this.status = status;
            return this;
        }

        public Order build(){
            return new Order(this);
        }

    }
}
