package strategy;

public class Cat {
    private int height, weight;
    Cat(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
