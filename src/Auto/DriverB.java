package Auto;

public class DriverB<T extends Car> extends Driver {
    public DriverB(String name, Boolean driversLicense, Integer experience) {
        super(name, driversLicense, experience);
    }

    @Override
    String start() {
        return "Автомобиль поехал";
    }

    @Override
    String stop() {
        return "Автомобиль остановился";
    }

    @Override
    String refuel() {
        return "Автомобиль заправлен бензином";
    }


    public String getCarMessage(T car) {
        return "Пилот " + getName() + " на болиде " + car.getBrand() + " " + car.getModel() + " будет участвовать в гонке";
    }
}
