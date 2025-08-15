package com.erudayu.LLD.StructuralDesignPattern.media;

public class Image {
    private final String fileName;

    public Image(String fileName){
        this.fileName = fileName;
    }

    public void display(){
        System.out.println("Displaying a image file "+ fileName);
    }

}
