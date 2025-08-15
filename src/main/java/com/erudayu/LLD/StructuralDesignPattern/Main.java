package com.erudayu.LLD.StructuralDesignPattern;

import com.erudayu.LLD.StructuralDesignPattern.decorators.CompressMediaDecorator;
import com.erudayu.LLD.StructuralDesignPattern.decorators.HQMediaDecorator;
import com.erudayu.LLD.StructuralDesignPattern.media.*;

public class Main {
    public static void main(String[] args) {
        Media vid = new CompressMediaDecorator(new Video("video.mp4"));
        Media aud = new HQMediaDecorator(new Audio("audio.mp4") );
        Media img = new ImageAdapter( new Image("picture.jpg"));

        MediaCollection allMedia = new MediaCollection();

        allMedia.addMedia(vid);
        allMedia.addMedia(aud);
        allMedia.addMedia(img);

        allMedia.play();
    }
}
