package Assignment2;

public class TeslaModelS extends Tesla{
    private String sedan;
    private String steeringWheel;
    private String tireMichelinPilotSport4;

    public TeslaModelS(int wheels, String color, double weight, int power, String electroEngine, String autopilot, String sensoryTransmission, String supportGame, String sedan, String steeringWheel, String tireMichelinPilotSport4) {
        super(wheels, color, weight, power, electroEngine, autopilot, sensoryTransmission, supportGame);
        this.sedan = sedan;
        this.steeringWheel = steeringWheel;
        this.tireMichelinPilotSport4 = tireMichelinPilotSport4;
    }

    public TeslaModelS(String electroEngine, String autopilot, String sensoryTransmission, String supportGame, String sedan, String steeringWheel, String tireMichelinPilotSport4) {
        super(electroEngine, autopilot, sensoryTransmission, supportGame);
        this.sedan = sedan;
        this.steeringWheel = steeringWheel;
        this.tireMichelinPilotSport4 = tireMichelinPilotSport4;
    }

    public String getSedan() {
        return sedan;
    }

    public void setSedan(String sedan) {
        this.sedan = sedan;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getTireMichelinPilotSport4() {
        return tireMichelinPilotSport4;
    }

    public void setTireMichelinPilotSport4(String tireMichelinPilotSport4) {
        this.tireMichelinPilotSport4 = tireMichelinPilotSport4;
    }
}
