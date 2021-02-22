package strategy;

public class Dog implements Comparable{
    private int weight, height;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
