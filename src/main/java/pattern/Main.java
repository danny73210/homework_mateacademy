package pattern;

public class Main {
    public static void main(String[] args) {
        AudiProducer copeProducer = new CopeProducer();
        AudiProducer suvProducer = new SuvProducer();

        System.out.println(copeProducer.makeAudiModel().getAudiModel());
        System.out.println(suvProducer.makeAudiModel().getAudiModel());
    }
}
