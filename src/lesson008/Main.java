package lesson008;

public class Main {

    public static void main(String[] args) {

        MyCollection myArr = new MyCollection();

        myArr.add(0, "Hello");
        myArr.add(1, ",");
        myArr.add(2, " ");
        myArr.add(3, "World");
        myArr.add(4, "!!!");


        for (int i = 0; i < myArr.size(); i++) {
            String item = myArr.get(i);
            System.out.println(item);
        }

        System.out.println();
        String element = myArr.get(3);
        System.out.println(element);

        myArr.delete(2);
        myArr.delete("!!!");

        for (int i = 0; i < myArr.size(); i++) {
            String item = myArr.get(i);
            System.out.print(item + ", ");
        }

    }
}

