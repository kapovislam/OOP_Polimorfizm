package Auto;

public class DriverD<T extends Bus> extends Driver {
    public DriverD(String name, Boolean driversLicense, Integer experience) {
        super(name, driversLicense, experience);
    }

    @Override
    String start() {
        return "Автобус поехал";
    }

    @Override
    String stop() {
        return "Автобус остановился";
    }

    @Override
    String refuel() {
        return "Автобус заправлен бензином";
    }


    public String getBusMessage(T bus) {
        return "Пилот " + getName() + " на автобусе " + bus.getBrand() + " " + bus.getModel() + " будет участвовать в гонке";
    }
}
