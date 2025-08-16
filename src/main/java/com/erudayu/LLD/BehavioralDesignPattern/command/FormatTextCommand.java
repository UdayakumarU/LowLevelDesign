package com.erudayu.LLD.BehavioralDesignPattern.command;

import com.erudayu.LLD.BehavioralDesignPattern.producer.TextEditor;
import com.erudayu.LLD.BehavioralDesignPattern.statergy.TextFormattingStratergy;

public class FormatTextCommand implements TextEditorCommand{

    private TextFormattingStratergy stratergy;
    private String formatText;
    private TextEditor textEditor;

    public FormatTextCommand(TextEditor textEditor, TextFormattingStratergy stratergy, String formatText) {
        this.textEditor = textEditor;
        this.stratergy = stratergy;
        this.formatText = formatText;
    }

    @Override
    public void execute(){
        textEditor.setText(stratergy.format(formatText));
    }
}
