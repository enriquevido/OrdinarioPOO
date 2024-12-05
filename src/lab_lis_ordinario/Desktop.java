package lab_lis_ordinario;

public class Desktop extends Computer{

    private double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, double caseHeight) {
        super(model, manufacturer, operatingSystem);
        this.caseHeight = caseHeight;
    }

    public double getCaseHeight() {
        return caseHeight;
    }

    public void setCaseHeight(double caseHeight) {
        this.caseHeight = caseHeight;
    }

    @Override
    public String getComputerType() {
        return "Computadora de escritorio";
    }

    @Override
    public int calculatePortabilityScore() {
        return 5 + ((int) (caseHeight/20));
    }

    @Override
    public String toString(){
        return getModel() + "\t" + getManufacturer() + "\t" + getOperatingSystem() + "\t" + getComputerType();
    }
}
