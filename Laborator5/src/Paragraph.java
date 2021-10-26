import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
    String text;
    List<Element> content;
    AlignStrategy align = null;

    public Paragraph(String s){
        this.text = s;
        this.content = new ArrayList<>();
    }

    public void setAlignStrategy(AlignStrategy x){
        this.align = x;
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

    public void print(){
        if(align!=null) {
            align.render(text, new Context());
        }
        else{
            System.out.println("Paragraph: "+ this.text);
        }
        for(Element e : content){
            e.print();
        }
    }
}
