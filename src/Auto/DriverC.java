package Auto;

public class DriverC<T extends Trucks> extends Driver {
    public DriverC(String name, Boolean driversLicense, Integer experience) {
        super(name, driversLicense, experience);
    }

    @Override
    String start() {
        return "Грузовик поехал";
    }

    @Override
    String stop() {
        return "Грузовик остановился";
    }

    @Override
    String refuel() {
        return "Грузовик заправлен дизельным топливом";
    }


    public String getTrucksMessage(T trucks) {
        return "Пилот " + getName() + " на грузовике " + trucks.getBrand() + " " + trucks.getModel() + " будет участвовать в гонке";
    }
}
