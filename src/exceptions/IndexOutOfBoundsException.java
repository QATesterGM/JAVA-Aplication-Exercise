package exceptions;

import model.Bug;
import model.BugReporter;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {

        Bug bug = new Bug("HHHHHH", new BugReporter("Lukasz", "Gajda", "gmail89@gmail.com"), 1);
        System.out.println(bug.getBugDescription());


        List<String> names = new ArrayList<>();
        names.add("Lukasz");  // poleci nam wyjatek IndexOutOfBoundsException bo nasze imie na liscie znajduje sie na indeksie nr 0
        // wychodzenia poza granice naszej listy bedzie rzucac wlasnie tym wyjatkiem - IndexOutOfBoundsException

        System.out.println(names.get(1));
    }
}
