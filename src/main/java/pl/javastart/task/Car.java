package pl.javastart.task;

public class Car extends Vehicle {
    static final double EXTRA_FUEL_CAR = 0.8;

    boolean airCondition;

    public Car(String name, double fuelTank, double fuelPer100Km, boolean airCondition) {
        super(name, fuelTank, fuelPer100Km);
        this.airCondition = airCondition;
    }

    double range() {
        return getFuelTank() / fuelWithAirConditionOn(EXTRA_FUEL_CAR);
    }

    String info() {
        return "Nazwa: " + getName()
                + ",\nPojemność baku: " + getFuelTank()
                + ",\nSpalanie na 100km: " + fuelWithAirConditionOn(EXTRA_FUEL_CAR)
                + ",\nZasięg:" + range()
                + ",\nWłączona klimatyzacja: " + airCondition;
    }

    double fuelWithAirConditionOn(double number) {
        if (airCondition) {
            return getFuelPer100Km() + number;
        } else {
            return getFuelPer100Km();
        }
    }

    void turnOnAirCondition() {
        System.out.println();
        System.out.println("-----Właczenie klimatyzacji-----");
        setAirCondition(true);
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }
}
