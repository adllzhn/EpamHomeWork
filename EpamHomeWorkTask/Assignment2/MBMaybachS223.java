package Assignment2;

public class MBMaybachS223 extends MB{
    private String backlight;
    private String capitansSetas;
    private String aromatizationOfTheCabin;
    private String adaptiveCruiseControl;
    private String rearWheelSwivel;

    public MBMaybachS223(int wheels, String color, double weight, int power, String internalCombustionEngine, String automaticTransmission, double capacity, String backlight, String capitansSetas, String aromatizationOfTheCabin, String adaptiveCruiseControl, String rearWheelSwivel) {
        super(wheels, color, weight, power, internalCombustionEngine, automaticTransmission, capacity);
        this.backlight = backlight;
        this.capitansSetas = capitansSetas;
        this.aromatizationOfTheCabin = aromatizationOfTheCabin;
        this.adaptiveCruiseControl = adaptiveCruiseControl;
        this.rearWheelSwivel = rearWheelSwivel;
    }

    public MBMaybachS223(String internalCombustionEngine, String automaticTransmission, double capacity, String backlight, String capitansSetas, String aromatizationOfTheCabin, String adaptiveCruiseControl, String rearWheelSwivel) {
        super(internalCombustionEngine, automaticTransmission, capacity);
        this.backlight = backlight;
        this.capitansSetas = capitansSetas;
        this.aromatizationOfTheCabin = aromatizationOfTheCabin;
        this.adaptiveCruiseControl = adaptiveCruiseControl;
        this.rearWheelSwivel = rearWheelSwivel;
    }

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    public String getCapitansSetas() {
        return capitansSetas;
    }

    public void setCapitansSetas(String capitansSetas) {
        this.capitansSetas = capitansSetas;
    }

    public String getAromatizationOfTheCabin() {
        return aromatizationOfTheCabin;
    }

    public void setAromatizationOfTheCabin(String aromatizationOfTheCabin) {
        this.aromatizationOfTheCabin = aromatizationOfTheCabin;
    }

    public String getAdaptiveCruiseControl() {
        return adaptiveCruiseControl;
    }

    public void setAdaptiveCruiseControl(String adaptiveCruiseControl) {
        this.adaptiveCruiseControl = adaptiveCruiseControl;
    }

    public String getRearWheelSwivel() {
        return rearWheelSwivel;
    }

    public void setRearWheelSwivel(String rearWheelSwivel) {
        this.rearWheelSwivel = rearWheelSwivel;
    }
}
