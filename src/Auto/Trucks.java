package Auto;

public class Trucks extends Transport implements Competing {
    private double pitStopTime;
    private Integer maxSpeed;
    private double bestLapTime;
    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model,
                  double engineVolume, double pitStopTime,
                  Integer maxSpeed, double bestLapTime, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.loadCapacity = loadCapacity;
    }

    @Override
    void startToMove() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void finish() {
        System.out.println("Грузовик остановился");

    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            System.out.println("Грузоподъемность авто - " + loadCapacity.getMax());
        }
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void getPitStop() {
        System.out.println("Pit-stop длился " + pitStopTime);
    }

    public void getBestLapTime() {
        System.out.println("Лучшее время круга " + bestLapTime);
    }

    public void getMaxSpeed() {
        System.out.println("Максимальная скорость " + maxSpeed);
    }

    public String toString() {
        return getBrand() + " " + getModel() + ", " + getEngineVolume() + ", время пит-стопа - " + pitStopTime + " мин, "
                + maxSpeed + " км/ч, лучшее время круга - " + bestLapTime + " минуты. Грузоподъмность от "
                +loadCapacity.getMin() + " тонн";
    }
}
