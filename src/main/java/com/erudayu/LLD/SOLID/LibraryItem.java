package com.erudayu.LLD.SOLID;

/*
* This interface follows (S) Single responsibility principle
* because it has only one reason to change ie libraryItems
*
* Also, it follows (O) open closed principle
* because this interface never going to be modified when there is a requirement of adding new library items let say Magazine,
* rather it provides the capability to extend it by implementing this interfaces.
*
* Initially this interface contains a method called calculateLateFee()
* which could not necessary to placed in the same interface, and it makes to look fatty
* lets segregate that function under a different interface and to keep them more tidy and thin.
* By this modification we are following (I) Interface segregation principle.
* */
public interface LibraryItem extends LateFeeCalculateable {
    String getId();
    String getTitle();
    double getPrice();
}
