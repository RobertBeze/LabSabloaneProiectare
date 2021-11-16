public class CounterPersonal implements Visitor<Personal>{
    int angajat;
    int director;
    int manager;

    public CounterPersonal(){
        this.angajat = 0;
        this.director = 0;
        this.manager = 0;
    }

    public void stats(){
        int suma = this.angajat + this.director + this.manager;
        System.out.println("Numar angajati " + this.angajat);
        System.out.println("Numar manageri " + this.manager);
        System.out.println("Numar directori " + this.director);
        System.out.println("Numar total personal " + suma);
    }

    public void reset_stats(){
        this.angajat = 0;
        this.director = 0;
        this.manager = 0;
    }

    @Override
    public Personal visitFirma(Firma f) {
        Visitee v;
        for(Personal p : f.personal){
            v = (Visitee) p;
            v.accept(this);
        }
        return null;
    }

    @Override
    public Personal visitAngajat(Angajat a) {
        this.angajat ++;
        return null;
    }

    @Override
    public Personal visitDirector(Director d) {
        this.director ++;
        return null;
    }

    @Override
    public Personal visitManager(Manager m) {
        this.manager ++;
        return null;
    }
}
