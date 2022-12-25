package Auto;

public class Car extends Transport implements Competing{
    private double pitStopTime;
    private Integer maxSpeed;
    private double bestLapTime;

    public Car(String brand, String model, double engineVolume, double pitStopTime, Integer maxSpeed, double bestLapTime) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    @Override
    void startToMove() {
        System.out.println("Автомобиль поехал");
    }

    @Override
    void finish() {
        System.out.println("Автомобиль остановился");
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

    @Override
    public String toString() {
        return getBrand()+ " "+ getModel() + ", "+getEngineVolume()+ ", время пит-стопа - "+ pitStopTime+ " секунды, "
                +maxSpeed+ " км/ч, лучшее время круга - " + bestLapTime + " минуты";
    }
}