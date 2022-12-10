package pl.javastart.task;

public class Truck extends Car {
    static final double EXTRA_FUEL_TRUCK = 0.8;

    private double load;

    public Truck(String name, double fuelTank, double fuelPer100Km, boolean airCondition, double load) {
        super(name, fuelTank, fuelPer100Km, airCondition);
        this.load = load;
    }

    @Override
    String info() {
        System.out.println();
        return "Nazwa: " + getName()
                + ",\nPojemność baku: " + getFuelTank()
                + ",\nSpalanie na 100km: " + (fuelWithAirConditionOn(EXTRA_FUEL_CAR) + loadAbove100kg())
                + ",\nZasięg:" + range()
                + ",\nWłączona klimatyzacja: " + airCondition
                + ",\nWaga załadunku: " + load;
    }

    @Override
    double range() {
        return getFuelTank() / (loadAbove100kg() + fuelWithAirConditionOn(EXTRA_FUEL_CAR));
    }

    @Override
    double fuelWithAirConditionOn(double number) {
        return super.fuelWithAirConditionOn(number);
    }

    @Override
    void turnOnAirCondition() {
        super.turnOnAirCondition();
    }

    double loadAbove100kg() {
        if (getLoad() >= 100) {
            int bonusFuel = (int) (load / 100);
            return bonusFuel * 0.5;
        }
        return 0;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }
}
