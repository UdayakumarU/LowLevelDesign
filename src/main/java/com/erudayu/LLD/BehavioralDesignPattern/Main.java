package com.erudayu.LLD.BehavioralDesignPattern;

import com.erudayu.LLD.BehavioralDesignPattern.observer.TextConsoleObserver;
import com.erudayu.LLD.BehavioralDesignPattern.observer.TextEditorObserver;
import com.erudayu.LLD.BehavioralDesignPattern.producer.TextEditor;
import com.erudayu.LLD.BehavioralDesignPattern.command.FormatTextCommand;
import com.erudayu.LLD.BehavioralDesignPattern.command.TextEditorCommand;
import com.erudayu.LLD.BehavioralDesignPattern.statergy.TextFormattingStratergy;
import com.erudayu.LLD.BehavioralDesignPattern.statergy.UppercaseStratergy;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        TextEditorObserver console = new TextConsoleObserver();
        textEditor.RegisterObserver(console);

        TextFormattingStratergy uppercase = new UppercaseStratergy();

        TextEditorCommand command = new FormatTextCommand(textEditor, uppercase, "Hello world");
        command.execute();

        textEditor.notifyObserver();
    }
}
