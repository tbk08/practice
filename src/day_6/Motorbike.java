package day_6;

public class Motorbike {
    private int yearOfFoundation;
    private String color;
    private String model;

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return year - this.yearOfFoundation;
    }

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
