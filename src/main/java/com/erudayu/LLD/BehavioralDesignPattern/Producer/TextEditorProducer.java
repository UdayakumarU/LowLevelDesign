package com.erudayu.LLD.BehavioralDesignPattern.Producer;

import com.erudayu.LLD.BehavioralDesignPattern.Observer.TextEditorObserver;

public interface TextEditorProducer {

    //Register observer
    void RegisterObserver(TextEditorObserver observer);

    //Remove observer
    void RemoveObserver(TextEditorObserver observer);

    //Notify observer
    void notifyObserver();
}
