package day_5;

public class TaskN {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setModel("BMW");
        car.setYearOfFoundation(1999);
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYearOfFoundation());

        Motorbike motorbike = new Motorbike(1996, "Green", "Kawasaki");
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getYearOfFoundation());
    }
}
