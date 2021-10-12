package com.company;

public class Paragraph {
    private String text;

    public Paragraph(String txt){
        this.text = txt;
    }

    public void print(){
        System.out.println("Paragraph: " + this.text);
    }
}
