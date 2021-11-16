import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double LIMITA = 6400; //aici se seteaza limita de salariu

        List<Firma> firmaList = new ArrayList<>();

        Firma f = new Firma("Constructii S.R.L.");

        SalariuProxy sal_angajat = new SalariuProxy("angajat", 1200, LIMITA);
        SalariuProxy sal_manager = new SalariuProxy("manager", 2500, LIMITA);
        SalariuProxy sal_director = new SalariuProxy("director", 4500, LIMITA);
        Angajat ionel = new Angajat("angajat", "Ionel");
        Manager minel = new Manager("manager", "Minel");
        Angajat ana = new Angajat("angajat", "Ana");
        Angajat ionut = new Angajat("angajat", "Ionut");
        Director gigel = new Director("director", "Gigel");
        f.add_personal(gigel);
        f.add_personal(ionut);
        f.add_personal(ana);
        f.add_personal(ionel);
        f.add_personal(minel);
        long startTime = System.currentTimeMillis();
        ionel.set_salariu(sal_angajat);
        minel.set_salariu(sal_manager);
        ana.set_salariu(sal_angajat);
        ionut.set_salariu(sal_angajat);
        gigel.set_salariu(sal_director);
        long endTime = System.currentTimeMillis();

        System.out.println("Timp pentru a seta salariile " +(endTime - startTime) );

        firmaList.add(f);
        for(Firma firma : firmaList){
            firma.print();
        }

        CounterPersonal counter = new CounterPersonal();
        f.accept(counter);
        counter.stats();

        long startTime1 = System.currentTimeMillis();
        for(Personal p : f.personal){
            p.print_salariu();
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Timp pentru a afisa salariile " +(endTime1 - startTime1) );
    }
}
