package bag;

public class Sandwich extends Item {

    private String spread;


    public Sandwich(int weight, String spread) {
        this.weight = weight;
        this.spread = spread;
    }

    @Override
    public void printWeight() {
        System.out.println("The weight of this sandwich is " + weight + " kg.");
    }
}
