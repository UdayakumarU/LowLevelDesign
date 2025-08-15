package com.erudayu.LLD.StructuralDesignPattern.decorators;

import com.erudayu.LLD.StructuralDesignPattern.media.Media;

public class CompressMediaDecorator extends MediaDecorator{

    public CompressMediaDecorator(Media mediaDecorator){
        super(mediaDecorator);
    }

    @Override
    public void play(){
        super.play();
        System.out.println("\t - compressed the file size for quickload");
    }

}
