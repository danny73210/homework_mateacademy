package pattern;

public class Main {
    public static void main(String[] args) {
        CopeProducer copeProducer = new CopeProducer();
        SuvProducer suvProducer = new SuvProducer();

        copeProducer.makeAudiModel();
        suvProducer.makeAudiModel();
    }
}
