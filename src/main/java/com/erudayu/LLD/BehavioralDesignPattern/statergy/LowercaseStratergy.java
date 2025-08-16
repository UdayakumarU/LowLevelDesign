package com.erudayu.LLD.BehavioralDesignPattern.statergy;

public class LowercaseStratergy implements TextFormattingStratergy {
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
