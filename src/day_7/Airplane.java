package day_7;

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

    public String getProducer() {
        return producer;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if(airplane1.getLength()>airplane2.getLength()){
            System.out.println("airplane1 longer");
        }else {
            System.out.println("airplane2 longer");
        }
    }
}
