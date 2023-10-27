package Model;

public class TransferStation {

    private int weight;

    public TransferStation() {

    }

    public TransferStation(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TransferStation [weight=" + weight + "]";
    }

}
