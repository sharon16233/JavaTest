package bag;

import java.util.ArrayList;

public class SchoolBag {

    private int maxWeight;
    private static int currentWeight;
    private static ArrayList<Item> items;

    public SchoolBag(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
        currentWeight = 0;
    }

    public void copySchoolBag(SchoolBag bag) {
        bag.maxWeight = this.maxWeight;
    }

    public static int getCurrentWeight() {
        return currentWeight;
    }



}
