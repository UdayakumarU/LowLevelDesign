package com.erudayu.LLD.StructuralDesignPattern.media;

public class Audio implements Media{

    private final String fileName;

    public Audio(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing an audio file " + fileName);
    }
}
