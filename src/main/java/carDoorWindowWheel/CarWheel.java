package carDoorWindowWheel;

public class CarWheel {
    private float tire;
    private final float MAX_CONDITION_OF_TIRE = 1.0f;
    private final float MIN_CONDITION_OF_TIRE = 0.0f;


    CarWheel() {
        this.tire = MAX_CONDITION_OF_TIRE;
    }
    CarWheel(float tire) {
        if (tire > MAX_CONDITION_OF_TIRE || tire < MIN_CONDITION_OF_TIRE) {
            throw new IllegalArgumentException("tire condition must be from 0.0 to 1.0");
        }
        this.tire = tire;
    }

    public void changeTire() {
        tire = MAX_CONDITION_OF_TIRE;
    }

    public void wipeTire(float wipe) {
        if(tire >= MIN_CONDITION_OF_TIRE && tire <= MAX_CONDITION_OF_TIRE) tire -= wipe;
        else System.out.println("ERROR!");
    }

    public float getTireStatus() {
        return tire;
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "tire=" + tire +
                '}';
    }
}
