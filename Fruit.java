package Lesson3_JC;

public class Fruit {
    private float weight; // вес одного фрукта
    private int count; // количество фруктов

    public Fruit (float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
