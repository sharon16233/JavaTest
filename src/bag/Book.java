package bag;

import java.util.ArrayList;

public class Book extends Item {

    protected String profession;
    protected int pagesNum;
    protected static ArrayList<String> bookProfessions = new ArrayList<String>();

    public Book(String profession, int pagesNum, int weight) {
        if(!bookProfessions.contains(profession)) {
            this.profession = profession;
            this.pagesNum = pagesNum;
            this.weight = weight;
            bookProfessions.add(profession);
        }
        else {
            System.out.println("Profession is already exists, but you might add an exercise book to this profession.");
        }
    }

    @Override
    public void printWeight() {
        System.out.println("The weight of the " + profession + "book is " + weight + " kg.");
    }

}
