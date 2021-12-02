package Lesson3_JC;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

        ArrayList<T> fruits = new ArrayList<>();
        private double weightF = 0.0;

        public <T> Box(float weightF) {
                this.weightF = weightF;
        }

        public void addF(T fruit) {
                fruits.add(fruit);
        }

        public double getWeight() {
                return fruits.size() * weightF;

        }

        public boolean compare(Box<?> box){
                return Math.abs(getWeight() - box.getWeight()) < 0.00001;
        }

        public void addFruits(Box<T> box) {
                System.out.println("Начальное количество фруктов в первой коробке: " + fruits.size());
                System.out.println("Начальное количество фруктов во второй коробке: " + box.fruits.size());
                fruits.addAll(box.fruits);
                box.fruits.clear();
                box.fruits.trimToSize();
                System.out.println("Конечное количество фруктов в первой коробке: " + fruits.size());
                System.out.println("Конечное количество фруктов во второй коробке: " + box.fruits.size());
        }
}
