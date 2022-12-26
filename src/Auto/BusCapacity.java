package Auto;

public enum BusCapacity {
    X_SMALL(1, 10),
    SMALL(11, 39),
    AVERAGE(40, 59),
    BIG(60, 99),
    EXTRA_LARGE(100, 120);

    private int min;
    private int max;

    BusCapacity(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    BusCapacity() {

    }

    public static BusCapacity getValue(int value) {
        for (BusCapacity i : BusCapacity.values()) {
            if (value >= i.getMin() && value <= i.getMax()) {
                System.out.println(i);
                return i;
            }
        }
        return null;
    }
}
