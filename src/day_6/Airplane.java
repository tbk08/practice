package day_6;

public class Airplane {
    private String producer;
    private int yearOfFoundation;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int yearOfFoundation, int length, int weight) {
        this.producer = producer;
        this.yearOfFoundation = yearOfFoundation;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.println(producer);
        System.out.println(yearOfFoundation);
        System.out.println(length);
        System.out.println(weight);
        System.out.println(fuel);
    }

    public void fillUp(int amountOfFuel) {
        this.fuel = amountOfFuel;
    }

    public int getFuel() {
        return fuel;
    }
}
