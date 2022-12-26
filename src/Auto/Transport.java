package Auto;

import validate.ValidateUtils;

public abstract class Transport {
    private  String brand;
    private  String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = validateBrand(brand);
        this.model = validateModel(model);
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    abstract void startToMove();

    abstract void finish();

    public abstract void printType();


    public static String validateBrand(String value) {
        return ValidateUtils.validateString(value, "Некорректное значение");
    }

    public static String validateModel(String value) {
        return ValidateUtils.validateString(value, "Некорректное значение");
    }

    public static double validateEngineVolume(double value) {
        return value <= 0 ? 1.5 : value;
    }


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
