package pattern;

public class CopeProducer implements AudiFactoryProducer {
    @Override
    public AudiFactory makeAudiModel() {
        return new Cope();
    }
}
