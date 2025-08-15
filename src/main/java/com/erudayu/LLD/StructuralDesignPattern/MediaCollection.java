package com.erudayu.LLD.StructuralDesignPattern;

import com.erudayu.LLD.StructuralDesignPattern.media.Media;

import java.util.ArrayList;
import java.util.List;

/*
* Composite design pattern
* */
public class MediaCollection implements Media {

    private List<Media> mediaList;

    public MediaCollection(){
        this.mediaList = new ArrayList<>();
    }

    @Override
    public void play() {
        for(Media media : mediaList){
            media.play();
        }
    }

    public void addMedia(Media media){
         mediaList.add(media);
    }
}
