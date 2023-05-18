package lesson006;

public class Dog extends Animals {
    private String name;
    public static int dogCounter = 0;

    public Dog(String name) {
        this.name = name;
        ++dogCounter;
        ++animalsCounter;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.printf("%s can't run that far%n", name);
        } else {
            System.out.printf("%s ran %s meters", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.printf("%s can't swim that far%n", name);
        } else {
            System.out.printf("%s swim %s meters%n", name, distance);
        }
    }
}
