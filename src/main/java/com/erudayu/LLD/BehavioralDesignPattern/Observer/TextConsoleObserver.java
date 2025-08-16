package com.erudayu.LLD.BehavioralDesignPattern.Observer;

public class TextConsoleObserver implements TextEditorObserver {

    @Override
    public void update(String text) {
        System.out.println("printing it on Console : " + text);
    }
}
