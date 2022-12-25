package Auto;

public class Bus extends Transport implements Competing {
    private double pitStopTime;
    private Integer maxSpeed;
    private double bestLapTime;


    public Bus(String brand, String model, double engineVolume, double pitStopTime, Integer maxSpeed, double bestLapTime) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    @Override
    void startToMove() {
        System.out.println("Автобус начал движение!");
    }

    @Override
    void finish() {
        System.out.println("Автобуст остановился!");
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
        return getBrand()+ " "+ getModel() + ", "+getEngineVolume()+ ", время пит-стопа - "+ pitStopTime+ " секунды, "
                +maxSpeed+ " км/ч, лучшее время круга - " + bestLapTime + " минуты";
    }
}
