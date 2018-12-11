package carDoorWindowWheel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Car {
    private Date date;
    private String type;
    private int topSpeed;
    private float hundredSpeed;
    private int amountPas;
    private int pasInCar;
    private int newSpeed;

    private List<CarDoorWindow> carDoorWindows = new ArrayList<>(Arrays.asList(
            new CarDoorWindow(), new CarDoorWindow(), new CarDoorWindow(), new CarDoorWindow()));
    private  List<CarWheel> carWheels = new ArrayList<>(Arrays.asList(
            new CarWheel(), new CarWheel(), new CarWheel(), new CarWheel()));

    private List<Passanger> passangers = new ArrayList<>();

    Car(Date date) {
        this.date = date;
    }

    Car(Date date, String type, int topSpeed, float hundredSpeed, int amountPas, int pasInCar, int newSpeed) {
        this(date);
        this.type = type;
        this.topSpeed = topSpeed;
        this.hundredSpeed = hundredSpeed;
        this.amountPas = amountPas;
        this.pasInCar = pasInCar;
        this.newSpeed = newSpeed;
    }

    public void changeSpeed(int newSpeed) {
        if (pasInCar <= 0 || carWheels.size() < 4) this.newSpeed = 0;
        else this.newSpeed = newSpeed;
    }

    public void pasIn(Passanger passanger) {
        passangers.add(passanger);
    }

    public void pasOut(int index) {
        passangers.remove(index);
    }

    public void allPasOut() {
        passangers.removeAll(passangers);
    }

    public CarDoorWindow getDoor(int index) {
        return carDoorWindows.get(index);
    }

    public CarWheel getWheel(int index) {
        return carWheels.get(index);
    }

    public void removeAllWheel() {
        carWheels.removeAll(carWheels);

    }

    public void addWheel(int index) {
        for (int i = 0; i < index; i++) {
            carWheels.add(new CarWheel());
        }
    }

    public float calculateSpeed() {
        if(passangers.size() <= 0) System.out.println("ERROR!");

        float minTireStatus = carWheels.get(0).getTireStatus();
        for (CarWheel carWheel : carWheels) {
            if(carWheel.getTireStatus() < minTireStatus) {
                minTireStatus = carWheel.getTireStatus();
            }
        }
        return topSpeed * minTireStatus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", topSpeed=" + topSpeed +
                ", hundredSpeed=" + hundredSpeed +
                ", amountPas=" + amountPas +
                ", pasInCar=" + pasInCar +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public float getHundredSpeed() {
        return hundredSpeed;
    }

    public int getAmountPas() {
        return amountPas;
    }

    public int getPasInCar() {
        return pasInCar;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setHundredSpeed(float hundredSpeed) {
        this.hundredSpeed = hundredSpeed;
    }

    public void setAmountPas(int amountPas) {
        this.amountPas = amountPas;
    }

    public void setPasInCar(int pasInCar) {
        this.pasInCar = pasInCar;
    }
}
