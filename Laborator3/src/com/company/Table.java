package com.company;

public class Table {
    private String title;

    public Table(String txt){
        this.title = txt;
    }

    public void print(){
        System.out.println("Table with title: " + title);
    }
}
