package carDoorWindowWheel;

public class CarWheel {
    private float tire;

    CarWheel() {
        this.tire = 1.0f;
    }
    CarWheel(float tire) {
        this.tire = tire;
    }

    public void changeTire() {
        tire = 1.0f;
    }

    public void wipeTire(float wipe) {
        if(tire >= 0.0f && tire <= 1.0f) tire -= wipe;
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
