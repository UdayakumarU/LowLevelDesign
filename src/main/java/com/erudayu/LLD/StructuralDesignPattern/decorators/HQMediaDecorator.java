package com.erudayu.LLD.StructuralDesignPattern.decorators;

import com.erudayu.LLD.StructuralDesignPattern.media.Media;

public class HQMediaDecorator extends MediaDecorator{

    public HQMediaDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }

    @Override
    public void play(){
        super.play();
        System.out.println("\t - with enhanced the quality");
    }
}
