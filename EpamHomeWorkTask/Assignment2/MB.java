package Assignment2;

public class MB extends Car{
    private String internalCombustionEngine;
    private String automaticTransmission;
    private double capacity;

    public MB(int wheels, String color, double weight, int power, String internalCombustionEngine, String automaticTransmission, double capacity) {
        super(wheels, color, weight, power);
        this.internalCombustionEngine = internalCombustionEngine;
        this.automaticTransmission = automaticTransmission;
        this.capacity = capacity;
    }

    public MB(String internalCombustionEngine, String automaticTransmission, double capacity) {
        this.internalCombustionEngine = internalCombustionEngine;
        this.automaticTransmission = automaticTransmission;
        this.capacity = capacity;
    }

    public String getInternalCombustionEngine() {
        return internalCombustionEngine;
    }

    public void setInternalCombustionEngine(String internalCombustionEngine) {
        this.internalCombustionEngine = internalCombustionEngine;
    }

    public String getAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(String automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
