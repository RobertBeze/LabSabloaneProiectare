package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> img;
    private List<Paragraph> prg;
    private List<Table> tbl;

    public SubChapter(String name) {
        this.name = name;
        this.img = new ArrayList<Image>();
        this.prg = new ArrayList<Paragraph>();
        this.tbl = new ArrayList<Table>();
    }

    public void createNewParagraph(String txt){
        Paragraph paragraf = new Paragraph(txt);
        this.prg.add(paragraf);
    }

    public void createNewImage(String txt){
        Image imagine = new Image(txt);
        this.img.add(imagine);
    }

    public void createNewTable(String txt){
        Table t = new Table(txt);
        this.tbl.add(t);
    }

    public void print(){
        System.out.println("Subchapter: " + this.name);
        for(Paragraph p : prg){
            p.print();
        }

        for(Image i : img){
            i.print();
        }

        for(Table t : tbl){
            t.print();
        }
    }
}
