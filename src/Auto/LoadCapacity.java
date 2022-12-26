package Auto;

public enum LoadCapacity {
    N1(0.1, 3.5),
    N2(3.6, 12),
    N3(12.1, Integer.MAX_VALUE);
    private double min;
    private double max;

    LoadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    LoadCapacity() {
    }

    public static LoadCapacity getValue(double value) {
        for (LoadCapacity i : LoadCapacity.values()) {
            if (value >= i.getMin() && value <= i.getMax()) {
                System.out.println(i);
                return i;
            }
        }
        return null;
    }
}
