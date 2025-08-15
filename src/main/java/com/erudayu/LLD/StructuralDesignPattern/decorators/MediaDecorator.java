package com.erudayu.LLD.StructuralDesignPattern.decorators;

import com.erudayu.LLD.StructuralDesignPattern.media.Media;

public abstract class MediaDecorator implements Media {
    Media decoratedMedia;

    public MediaDecorator(Media decoratedMedia){
        this.decoratedMedia = decoratedMedia;
    }

    @Override
    public void play(){
        this.decoratedMedia.play();
    }

}
