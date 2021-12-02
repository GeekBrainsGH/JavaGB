package Lesson3_JC;

public class Main {
    public static void main(String[] args) {
       Box<Apple> boxApple1 = new Box(1f);
       Box<Orange> boxOrange = new Box(1.5f);
       Box<Apple> boxApple2 = new Box(1f);

        for (int i = 0; i < 3; i++) {
            boxApple1.addF(new Apple());
            boxApple2.addF(new Apple());
            boxOrange.addF(new Orange());
        }

        boxApple1.addF(new Apple());
        boxApple1.addF(new Apple());
        boxApple1.addF(new Apple());

        boxApple2.addF(new Apple());


        System.out.println("Вес первой коробки с яблоками " + boxApple1.getWeight());
        System.out.println("Вес коробки с апельсинами " + boxOrange.getWeight());
        System.out.println("Разница " + boxApple1.compare(boxOrange));
        System.out.println();
        boxApple1.addFruits(boxApple2);
    }
}
