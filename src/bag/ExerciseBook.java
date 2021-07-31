package bag;

import java.util.ArrayList;

public class ExerciseBook extends Book {

    private String homework = "";

    private static ArrayList<String> exerciseBookProfessions = new ArrayList<String>();

    public ExerciseBook(String profession, int pagesNum, int weight) {
            super(profession, pagesNum, weight);
            if(!exerciseBookProfessions.contains(profession)) {
                exerciseBookProfessions.add(profession);
            }
            else {
                System.out.println("Book can hold only one Exercise book for each profession.");
            }
    }

    @Override
    public void printWeight() {
        System.out.println("The weight of the " + profession + "exercise book is " + weight + " kg.");
    }

    public void doHomework() {
        homework = "";
    }

    public void setHomework() {
       if(homework == "") {
           homework = "homework to do";
       }
       else {
           System.out.println("Can't set homework because homework already exists.");
       }
    }
}
