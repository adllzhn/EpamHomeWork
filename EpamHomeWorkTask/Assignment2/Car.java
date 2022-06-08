package Assignment2;

public class Car {
    private int wheels;
    private String color;
    private double weight;
    private int power;

    public Car(int wheels, String color, double weight, int power) {
        this.wheels = wheels;
        this.color = color;
        this.weight = weight;
        this.power = power;
    }

    public Car() {
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
