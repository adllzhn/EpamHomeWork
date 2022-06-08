package Assignment2;

public class MBSLS extends MB{
    private String seagullWings;
    private String sportTransmission;
    private String bucketSeats;

    public MBSLS(int wheels, String color, double weight, int power, String internalCombustionEngine, String automaticTransmission, double capacity, String seagullWings, String sportTransmission, String bucketSeats) {
        super(wheels, color, weight, power, internalCombustionEngine, automaticTransmission, capacity);
        this.seagullWings = seagullWings;
        this.sportTransmission = sportTransmission;
        this.bucketSeats = bucketSeats;
    }

    public MBSLS(String internalCombustionEngine, String automaticTransmission, double capacity, String seagullWings, String sportTransmission, String bucketSeats) {
        super(internalCombustionEngine, automaticTransmission, capacity);
        this.seagullWings = seagullWings;
        this.sportTransmission = sportTransmission;
        this.bucketSeats = bucketSeats;
    }

    public String getSeagullWings() {
        return seagullWings;
    }

    public void setSeagullWings(String seagullWings) {
        this.seagullWings = seagullWings;
    }

    public String getSportTransmission() {
        return sportTransmission;
    }

    public void setSportTransmission(String sportTransmission) {
        this.sportTransmission = sportTransmission;
    }

    public String getBucketSeats() {
        return bucketSeats;
    }

    public void setBucketSeats(String bucketSeats) {
        this.bucketSeats = bucketSeats;
    }
}
