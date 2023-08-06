package exceptions;

import model.Bug;
import model.BugReporter;

public class NullPointerExceptionExplain {

    public static void main(String[] args) {

        Bug bug = new Bug("HHHHHH", new BugReporter("Lukasz", "Gajda", "gmail89@gmail.com"), 1);
        System.out.println(bug.getBugDescription());

//        bug = null;
//        try {
//            System.out.println(bug.getBugDescription());  // po zmianie referencji do obiektu na nulla zwraca nam wyjate NullPointerException
//        } catch (NullPointerException ex) {
//            System.out.println("Poleciał null pointer");
//        }

        bug = null;
        System.out.println(bug.getBugDescription());

    }
}
