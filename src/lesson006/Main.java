package lesson006;

public class Main {
    public static void main(String[] args) {

        Cat catFelix = new Cat("Felix");
        catFelix.run(150);

        Cat catSimba = new Cat("Simba");
        catSimba.run(100);

        Cat catGarfield = new Cat("Garfield");
        catGarfield.swim(10);

        Dog dogMilo = new Dog("Milo");
        dogMilo.run(100);

        Dog dogMax = new Dog("Max");
        dogMax.run(1000);

        Dog dogRocky = new Dog("Rocky");
        dogRocky.swim(5);

        System.out.println("Total cats " + Cat.catCounter);
        System.out.println("Total dogs " + Dog.dogCounter);
        System.out.println("Total animals " + (Cat.animalsCounter));

    }
}
