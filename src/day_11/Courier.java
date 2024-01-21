package day_11;

public class Courier implements Worker {
    private int salary;

    private Warehouse courier;

    public Courier(Warehouse courier) {
        this.courier = courier;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        courier.setBalance(courier.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (courier.getBalance() > 1_000_000) {
            salary *= 2;
        }
    }
}
