package day_11;

public class Picker implements Worker {
    private int salary;
    private Warehouse picker;

    public Picker(Warehouse picker) {
        this.picker = picker;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        picker.setCountOrder(picker.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (picker.getCountOrder() > 1500) {
            salary *= 3;
        }
    }
}
