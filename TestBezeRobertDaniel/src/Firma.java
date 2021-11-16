import java.util.ArrayList;
import java.util.List;

public class Firma implements Visitee {
    String nume;
    List<Personal> personal;

    public Firma(String nume){
        this.nume = nume;
        this.personal = new ArrayList<>();
    }

    public void add_personal(Personal p){
        this.personal.add(p);
    }

    public void print(){
        System.out.println("Firma: " + this.nume);
        System.out.println("Angajatii:");
        for(Personal p : this.personal){
            p.print();
        }
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitFirma(this);
    }
}
