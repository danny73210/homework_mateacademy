package pattern;

public class Suv implements AudiFactory {
    @Override
    public void create() {
        System.out.println("Create Audi-SUV model");
    }
}
