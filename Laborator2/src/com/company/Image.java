package com.company;

public class Image {
    private String imageName;

    public Image(String name){
        this.imageName = name;
    }

    public void print(){
        System.out.println("Imagine with name: " + this.imageName);
    }
}
