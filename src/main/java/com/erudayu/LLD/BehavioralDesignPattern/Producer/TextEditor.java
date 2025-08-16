package com.erudayu.LLD.BehavioralDesignPattern.Producer;

import com.erudayu.LLD.BehavioralDesignPattern.Observer.TextEditorObserver;

import java.util.LinkedList;
import java.util.List;

public class TextEditor implements TextEditorProducer{
    private final List<TextEditorObserver> observers;
    private String currentText;

    public TextEditor(){
        observers = new LinkedList<>();
        currentText = "";
    }

    @Override
    public void RegisterObserver(TextEditorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void RemoveObserver(TextEditorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(TextEditorObserver observer: observers){
            observer.update(this.currentText);
        }
    }

    public void setText(String text){
        this.currentText = text;
    }
}
