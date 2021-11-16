public class SalariuProxy {
    String functie;
    double lei;
    Salariu salariuReal = null;
    double limita;

    public SalariuProxy(String functie, double lei, double limita){
        this.functie = functie;
        this.lei = lei;
        this.limita = limita;
    }

    public void load_real_sal(){
        this.salariuReal = new Salariu(this.functie, this.lei, this.limita);
    }

    public String print(){
        load_real_sal();
        return " salariu " + salariuReal.lei + " lei pentru functia de " + salariuReal.functie;
    }
}
