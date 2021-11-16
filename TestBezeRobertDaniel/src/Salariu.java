import java.util.concurrent.TimeUnit;

public class Salariu {
    String functie;
    double lei;

    public Salariu(String functie, double lei, double limita){
        this.functie = functie;
        this.lei = lei;
        if (lei < limita) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
