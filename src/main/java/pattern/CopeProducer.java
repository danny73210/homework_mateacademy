package pattern;

public class CopeProducer implements AudiProducer {
    @Override
    public Audi makeAudiModel() {
        return new Cope();
    }
}
