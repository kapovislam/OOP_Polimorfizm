import Auto.*;

public class Main {
    public static void main(String[] args) {

        Car mercedes = new Car("Мерседес", "SLS AMG", 5.5, 3.6, 317, 1.45, BodyType.COUPE);
        Car ferrari = new Car("Ferrari", "812 Superfast", 6.5, 3.4, 317, 1.45, BodyType.SEDAN);
        Car BMW = new Car("BMW", "M4", 3, 4.4, 250, 1.55, BodyType.HATCHBACK);
        Car audi = new Car("Audi", "RS6 Avant", 5, 4.1, 280, 1.52, BodyType.CROSSOVER);
        Trucks renault = new Trucks("Renault", "Magnum", 12.8, 30.26, 160, 3.55, LoadCapacity.N1);
        Trucks камаз = new Trucks("КамАЗ", "4326-9", 13.2, 20.15, 170, 2.55, LoadCapacity.N2);
        Trucks toyota = new Trucks("Toyota", "Hilux Dakar", 12.8, 25.15, 165, 2.45, LoadCapacity.N3);
        Bus Mercedes = new Bus("Mercedes-Ben", "Sprinter", 3.5, 15.12, 220, 2.25, BusCapacity.SMALL);
        Bus MAN = new Bus("MAN", "Lion’s", 3.2, 15.42, 200, 2.45, BusCapacity.BIG);
        Bus МАЗ = new Bus("МАЗ", "МАЗ-232", 2.2, 16.42, 190, 2.55, BusCapacity.X_SMALL);
        System.out.println(mercedes);
        System.out.println(ferrari);
        System.out.println(BMW);
        System.out.println(audi);
        System.out.println(renault);
        System.out.println(камаз);
        System.out.println(toyota);
        System.out.println(Mercedes);
        System.out.println(MAN);
        System.out.println(МАЗ);
        System.out.println();
        DriverB driver = new DriverB<>("Иванов", true, 5);
//        driver.getCarMessage(BMW);
        System.out.println(driver.getCarMessage(BMW));
        printInfo(renault);
    }


    public static void printInfo(Transport transport) {
        transport.printType();
    }
}