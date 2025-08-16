package com.erudayu.LLD.BehavioralDesignPattern.statergy;

public class UppercaseStratergy implements TextFormattingStratergy{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
