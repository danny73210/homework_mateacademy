package carDoorWindowWheel;

public class CarDoorWindow {
    boolean door;
    boolean window;

    CarDoorWindow() {
        this.door = false;
        this.window = false;
    }

    CarDoorWindow(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public void openDoor() {
        door = true;
    }

    public void closeDoor() {
        door = false;
    }

    public void openWindow() {
        window = true;
    }

    public void closeWindow() {
        window = false;
    }

    public void doorOpenClose() {
        door = door ? false : true;
    }

    public void windowOpenClose() {
        window = window ? false : true;
    }

    @Override
    public String toString() {
        return "CarDoorWindow{" +
                "door=" + door +
                ", window=" + window +
                '}';
    }
}
