package pl.javastart.task;

public class Vehicle {
    private String name;
    private double fuelTank;
    private double fuelPer100Km;

    public Vehicle(String name, double fuelTank, double fuelPer100Km) {
        this.name = name;
        this.fuelTank = fuelTank;
        this.fuelPer100Km = fuelPer100Km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public double getFuelPer100Km() {
        return fuelPer100Km;
    }

    public void setFuelPer100Km(double fuelPer100Km) {
        this.fuelPer100Km = fuelPer100Km;
    }
}
