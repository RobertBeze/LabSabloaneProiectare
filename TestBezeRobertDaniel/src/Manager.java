public class Manager implements Personal, Visitee{
    String functie;
    String nume;
    SalariuProxy salariu = null;

    public Manager(String functie, String nume){
        this.functie = functie;
        this.nume = nume;
    }

    public void set_salariu(SalariuProxy salariu){
        this.salariu = salariu;
    }

    @Override
    public void print() {
        System.out.println("Manager: " + this.nume + " -> functia: " + this.functie);
    }

    @Override
    public void print_salariu(){
        String sal = salariu.print();
        System.out.println("Manager: " + this.nume + " -> functia: " + this.functie + " ->" + sal);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitManager(this);
    }
}
