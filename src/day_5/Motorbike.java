package day_5;

public class Motorbike {
    private int yearOfFoundation;
    private String color;
    private String model;

    public Motorbike(int yearOfFoundation, String color, String model) {
        this.yearOfFoundation = yearOfFoundation;
        this.color = color;
        this.model = model;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
