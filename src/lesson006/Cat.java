package lesson006;

public class Cat extends Animals {
    private String name;
    public static int catCounter = 0;

    public Cat(String name) {
        this.name = name;
        catCounter++;
        ++animalsCounter;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.printf("%s can't run that far%n", name);
        } else {
            System.out.printf("%s ran %s meters%n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim");
    }


}
