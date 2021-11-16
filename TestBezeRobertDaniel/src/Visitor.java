public interface Visitor<T>{
    public T visitFirma(Firma f);
    public T visitAngajat(Angajat a);
    public T visitDirector(Director d);
    public T visitManager(Manager m);
}
