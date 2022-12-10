package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Truck("Scania", 560, 24.8, false, 1113);
        cars[1] = new Truck("MAN", 510, 21.2, false, 470);

        System.out.println(cars[0].info());
        cars[0].turnOnAirCondition();
        System.out.println(cars[0].info());

        System.out.println(cars[1].info());
        cars[1].turnOnAirCondition();
        System.out.println(cars[1].info());

    }
}
