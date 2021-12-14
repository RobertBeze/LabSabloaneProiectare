package ro.uvt.models;

import ro.uvt.services.ImageLoaderFactory;
import ro.uvt.services.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class Image implements Element, Picture, Visitee {
    String urll;
    List<Element> content;
    PictureContent picc;
    Dimension dimm;
    ImageLoaderFactory img = new ImageLoaderFactory();
    ImageLoader trueimg;
    Visitor visitor = null;

    public Image(String txt){
        this.urll = txt;
        this.dimm = new Dimension(1024);
        this.picc = new PictureContent(txt);
        this.content = new ArrayList<>();
        try {
            this.trueimg = img.create(urll);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void add(Element e){
        content.add(e);
    }

    public void remove(Element e){
        content.remove(get(e));
    }

    public int get(Element e){
        return content.indexOf(e);
    }

    public void print() {
        //System.out.println("models.Image with name: " + this.urll);
        System.out.println(trueimg.load(urll));
        for (Element e : content) {
            e.print();
        }
    }

    public String url(){
        return this.urll;
    }

    public Dimension dim(){
        return this.dimm;
    }

    public PictureContent content(){
        return this.picc;
    }

    public void accept(Visitor visitor) {
        this.visitor = visitor;
        visitor.visitImage(this);
    }
}
