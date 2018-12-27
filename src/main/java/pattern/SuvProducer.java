package pattern;

public class SuvProducer implements AudiFactoryProducer {
    @Override
    public AudiFactory makeAudiModel() {
        return new Suv();
    }
}
