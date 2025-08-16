package com.erudayu.LLD.BehavioralDesignPattern.producer;

import com.erudayu.LLD.BehavioralDesignPattern.observer.TextEditorObserver;

public interface TextEditorProducer {

    //Register observer
    void RegisterObserver(TextEditorObserver observer);

    //Remove observer
    void RemoveObserver(TextEditorObserver observer);

    //Notify observer
    void notifyObserver();
}
