package pattern;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        AudiFactory suv = factory.audiFactory("Suv");
        AudiFactory cope = factory.audiFactory("Cope");
        suv.create();
        cope.create();
    }
}
