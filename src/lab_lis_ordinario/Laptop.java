package lab_lis_ordinario;

public class Laptop extends Computer implements PortableDevice{

    private int batteryCapacity;
    private double weight;

    public Laptop(String model, String manufacturer, String operatingSystem, int batteryCapacity, double weight) {
        super(model, manufacturer, operatingSystem);
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }


    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String gelModel() {
        return getModel();
    }

    @Override
    public String getComputerType() {
        return "Computadora portatil";
    }

    @Override
    public int calculatePortabilityScore() {
        return (int) (weight);
    }

    @Override
    public String toString(){
        return getModel() + "\t" + getManufacturer() + "\t" + getOperatingSystem() + "\t" + getComputerType();
    }
}
