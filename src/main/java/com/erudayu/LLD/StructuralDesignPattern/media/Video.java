package com.erudayu.LLD.StructuralDesignPattern.media;

public class Video implements Media{

    private final String fileName;

    public Video(String fileName){
        this.fileName =  fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing a video file " + fileName);
    }
}
