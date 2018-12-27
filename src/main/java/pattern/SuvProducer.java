package pattern;

public class SuvProducer implements AudiProducer {
    @Override
    public Audi makeAudiModel() {
        return new Suv();
    }
}
