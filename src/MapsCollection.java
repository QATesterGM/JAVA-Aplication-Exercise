import model.Bug;
import model.BugReporter;

import java.util.*;

public class MapsCollection {

    public static void main(String[] arggs) {

        //MAPA - ZBIOR KLUCZ + WAROTSC

        Map<Integer, String> names = new HashMap<>(); // w mapach klucz zawsze musi być unikalny

        names.put(1,"Lukasz1");
        names.put(10,"Lukasz10");
        names.put(20,"Lukasz20");
        names.put(0,"Lukasz0");
        names.put(5,"Lukasz5");
        names.put(20,"Lukasz202222"); //nadpisz wartosc w takim samym kluczu, wedlug kolejnosci


        System.out.println(names);


        Map<Integer, String> sortedNames = new TreeMap<>(names); //daje nam posortowane dane rosnąco

        System.out.println(sortedNames);


        for(Map.Entry<Integer, String> entryNazwa: names.entrySet()){
            System.out.println(entryNazwa.getKey() + " " + entryNazwa.getValue());  //wyswietlanie kluczy i wartosci z mapy
        }

        //Wazne!!!!
        // 1. Mapa przechowuje klucz i wartossc
        // 2. Możemy uzywac kilku implementacji mapy, najczescieh hash mapa jednak nie
        // gwarantuje nam zwracania w kolejnosci w akiej je dodajemy(treeMap) jesli chcemy uporzadkowane rosnąco


        //TODO Cwiczenie
        //1. utworz liste bugów
        //2. z listy bugow wyciagnij tylko unikalne bugi
        //3. Posortuj unikalne bugi po polu bug description

        System.out.println("---LIST---");

        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Bug 2", new BugReporter("Lukaasz", "Gajda", "gumisiowy89@o2.pl"),1));
        bugs.add(new Bug("Bug 1", new BugReporter("Marta", "Matysiuk", "mailo2@o2.pl"),1));
        bugs.add(new Bug("Bug 3", new BugReporter("Robert", "Kowalski", "jakisinnymail@o2.pl"),1));
        bugs.add(new Bug("Bug 3", new BugReporter("Robert", "Kowalski", "jakisinnymail@o2.pl"),1));
        bugs.add(new Bug("Bug 4", new BugReporter("Mateusz", "Mysiadło", "costamcostam@o2.pl"),1));

        for(Bug bug: bugs){
            System.out.println(bug.getBugDescription());
        }

        System.out.println("---UNIQUE---SET---LIST---");

        Set<Bug> bugsSet = new HashSet<>(bugs);

        for(Bug bug: bugsSet){
            System.out.println(bug.getBugDescription());
        }

        Set<Bug> bugsTreeSet = new TreeSet<>(bugsSet);

        System.out.println("---SORTED---LIST---");

        for(Bug bug: bugsTreeSet){
            System.out.println(bug.getBugDescription());
        }

    }
}
