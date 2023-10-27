package Model;

public class Truck {
    private int maxWeight;
    private int weight;
    private int time;

    public Truck() {
        this.maxWeight = 10000;
    }

    public Truck(int weight, int time) {
        this.weight = weight;
        this.time = time;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void input() {
        setWeight(maxWeight);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
