package com.erudayu.LLD.SOLID;

import java.util.List;

public class Library {
    private List<LibraryItem> libraryItems;

    public double getTotalPrice(){
        double totalPrice = 0;
        /*
        * Here the Parent LibraryItem can be replaced with any of its child items
        * ie Book, CD, DVD etc. and it introduces no side effects since every child class
        * implements the method getPrice() for sure.
        * Hence it follows (L) Liskov's substitution principle
        * */
        for(LibraryItem item : libraryItems){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    /*
    * Here the delayedItems is passed as LateFeeCalculateable an abstraction rather individual concrete class
    * Hence this follows (D) Dependency Inversion principle
    * */
    public double getLateFee(List<LateFeeCalculateable> delayedItems, int days){
        double lateFee = 0;

        for(LateFeeCalculateable item: delayedItems){
            lateFee += item.calculateLateFee(days);
        }

        return lateFee;
    }

}
