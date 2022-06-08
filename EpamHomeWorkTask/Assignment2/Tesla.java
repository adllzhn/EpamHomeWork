package Assignment2;

public class Tesla extends Car{
    private String electroEngine;
    private String autopilot;
    private String sensoryTransmission;
    private String supportGame;

    public Tesla(int wheels, String color, double weight, int power, String electroEngine, String autopilot, String sensoryTransmission, String supportGame) {
        super(wheels, color, weight, power);
        this.electroEngine = electroEngine;
        this.autopilot = autopilot;
        this.sensoryTransmission = sensoryTransmission;
        this.supportGame = supportGame;
    }

    public Tesla(String electroEngine, String autopilot, String sensoryTransmission, String supportGame) {
        this.electroEngine = electroEngine;
        this.autopilot = autopilot;
        this.sensoryTransmission = sensoryTransmission;
        this.supportGame = supportGame;
    }

    public String getElectroEngine() {
        return electroEngine;
    }

    public void setElectroEngine(String electroEngine) {
        this.electroEngine = electroEngine;
    }

    public String getAutopilot() {
        return autopilot;
    }

    public void setAutopilot(String autopilot) {
        this.autopilot = autopilot;
    }

    public String getSensoryTransmission() {
        return sensoryTransmission;
    }

    public void setSensoryTransmission(String sensoryTransmission) {
        this.sensoryTransmission = sensoryTransmission;
    }

    public String getSupportGame() {
        return supportGame;
    }

    public void setSupportGame(String supportGame) {
        this.supportGame = supportGame;
    }
}
