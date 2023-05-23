import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListVsLinkedListDifference {

    public static void main(String[] args) {

        //KOLEKCJA - ZBIOR ELEMENTOW TEGO SAMEGO TYPU -> ELEMENT1, ELEMENT2, ELEMENT3

        //ArrayList
        // [ELEMENT1, ELEMENT2, ELEMENT3]
        // [   0         1          2   ]

        // LindekList
        // [ELEMENT1 <-> ELEMENT2 <-> ELEMENT3 <-> ELEMENT4]

        List<String> names1 = new ArrayList<>();
        List<String> names2 = new LinkedList<>();

        names1.add("Łukasz");
        names2.add("Marta");


        // SET - ZBIÓR UNIKALNYCH ELEMENTÓW

        Set<String> names = new HashSet<>();
        names.add("Łukasz");
        names.add("Mateusz");
        names.add("Marta");
        names.add("Jacek");
        names.add("Bartek");
        names.add("Łukasz");  //SET zawsze przetrzymuje tylko unikalne elementy, dublikaty ignorowane

        // SET nie daje gwarancji kolejnosci zwracanych obiektów, nie zadziala get po indeksie

        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }

        //TODO sortowanie SETA

        Set<String> sortedNames = new TreeSet<>(names); //Można wrzucić jako parametr inną kolekcje w celu posortowania, zwraca zawsze unikalne elementy

        for (String nameSort: sortedNames){
            System.out.println(nameSort);
        }

    }
}
