import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element{
    String url;
    List<Element> content;

    public Image(String url){
        this.url = url;
        this.content = new ArrayList<>();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
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

    public void print(){
        System.out.println("Image with name: " + this.url);
        for(Element e : content){
            e.print();
        }
    }
}
