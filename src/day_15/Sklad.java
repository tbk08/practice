package day_15;

public class Sklad {
    private String model;
    private int size;
    private int count;

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    public Sklad(String model, int size, int count) {
        this.model = model;
        this.size = size;
        this.count = count;
    }

    @Override
    public String toString() {
        return model + ", " + size + ", " + count;
    }
}
