package com.erudayu.LLD.StructuralDesignPattern.media;

public class ImageAdapter implements Media{
    private final Image image;

    public ImageAdapter(Image image){
        this.image = image;
    }

    @Override
    public void play() {
        this.image.display();
    }
}
