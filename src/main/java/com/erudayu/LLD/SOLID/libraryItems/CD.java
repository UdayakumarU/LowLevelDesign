package com.erudayu.LLD.SOLID.libraryItems;

import com.erudayu.LLD.SOLID.LibraryItem;

public class CD implements LibraryItem {

    private String id;
    private String title;
    private double price;

    public CD(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double calculateLateFee(int days) {
        return 15 * days;
    }
}
