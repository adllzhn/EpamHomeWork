package Assignment2;

public class TeslaSemi extends Tesla{
    private String truckBody;
    private String restPlace;
    private String trailer;

    public TeslaSemi(int wheels, String color, double weight, int power, String electroEngine, String autopilot, String sensoryTransmission, String supportGame, String truckBody, String restPlace, String trailer) {
        super(wheels, color, weight, power, electroEngine, autopilot, sensoryTransmission, supportGame);
        this.truckBody = truckBody;
        this.restPlace = restPlace;
        this.trailer = trailer;
    }

    public TeslaSemi(String electroEngine, String autopilot, String sensoryTransmission, String supportGame, String truckBody, String restPlace, String trailer) {
        super(electroEngine, autopilot, sensoryTransmission, supportGame);
        this.truckBody = truckBody;
        this.restPlace = restPlace;
        this.trailer = trailer;
    }

    public String getTruckBody() {
        return truckBody;
    }

    public void setTruckBody(String truckBody) {
        this.truckBody = truckBody;
    }

    public String getRestPlace() {
        return restPlace;
    }

    public void setRestPlace(String restPlace) {
        this.restPlace = restPlace;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
