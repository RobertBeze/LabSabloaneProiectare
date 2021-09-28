import java.util.ArrayList;
import java.util.List;

public class Book {
    String titlu;
    List<String> paragraf;
    List<String> imagini;
    List<String> tabele;

    public Book(String titlu){
        this.titlu = titlu;
        this.paragraf = new ArrayList<>();
        this.imagini = new ArrayList<>();
        this.tabele = new ArrayList<>();
    }

    public void createNewParagraph(String text){
        this.paragraf.add(text);
    }

    public void createNewImage(String img){
        this.imagini.add(img);
    }

    public void createNewTable(String table){
        this.tabele.add(table);
    }

    public void print(){
        System.out.format("Titlul este %s \n",titlu);

        System.out.println("Paragrafele sunt: ");
        for(String i : this.paragraf)
            System.out.println(i);

        System.out.println("Imaginile sunt: ");
        for(String i : this.imagini)
            System.out.println(i);

        System.out.println("Tabelele sunt: ");
        for(String i : this.tabele)
            System.out.println(i);
    }
}
