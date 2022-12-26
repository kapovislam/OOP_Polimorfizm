package Auto;


public class Bus extends Transport implements Competing {
    private double pitStopTime;
    private Integer maxSpeed;
    private double bestLapTime;
    private BusCapacity size;


    public Bus(String brand, String model, double engineVolume, double pitStopTime, Integer maxSpeed, double bestLapTime, BusCapacity size) {
        super(brand, model, engineVolume);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.size = size;
    }

    @Override
    void startToMove() {
        System.out.println("Автобус начал движение!");
    }

    @Override
    void finish() {
        System.out.println("Автобуст остановился!");
    }

    @Override
    public void printType() {
        if (size == null) {
            System.out.println("Данных по авто недостаточно!");
        } else {
            System.out.println("Вместимость автобуса от " +size.getMin() + " до "+size.getMax());
        }
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

    public BusCapacity getSize() {
        return size;
    }

    public String toString() {
        return getBrand()+ " "+ getModel() + ", "+getEngineVolume()+ ", время пит-стопа - "+ pitStopTime+ " секунды, "
                +maxSpeed+ " км/ч, лучшее время круга - " + bestLapTime + " минуты. Вместимость автобуса от "
                +size.getMin() + " до " +size.getMax();
    }
}
