import java.util.ArrayList;
import java.util.List;

public class StreamCollection {

    public static void main(String[] args) {

        // STREAMY - STRUMIENIE WARTOSCI

        // ["Bartek", "Antek", "Tomek", "Filip", "Romek", " Franek", " Artur", "Feliks"] -> stream
        // wyszukaj imiona zaczynajace się na F -> stream ["Filip", "Franek", "Feliks"]
        // wyszukaj imiona, które zawierają literę k -> stream ["Franek", "Feliks"]
        // wyszukaj imiona, które kończą sie na literę s -> stream ["Feliks"]
        // wyświetl wszystkie elementy

        // METODY POSREDNIE - ZWRACAJA NOWE STREAMY
        // filter - filtrowanie elementów
        // map - przekształcenie elementów

        // METODY TERMINALNE - SĄ WYKONYWANE JAKO OSTATNIE - ZWRACAJA WARTOSC, POZWALAJĄ ZEBRA WARTOSCI DO KOLEKCJI
        // forEach - wyswietlenie elementow
        // min | max | sum
        // anyMatch | allMatch | nonMatch
        // count
        // collect - zbieranie elementów

        List<String> names = new ArrayList<>();
        names.add("Bartek");
        names.add("Antek");
        names.add("Tomek");
        names.add("Tom");
        names.add("Filip");
        names.add("Romek");
        names.add("Max");
        names.add("Franek");
        names.add("Artur");
        names.add("Feliks");

        names.stream()
                .filter(str -> str.startsWith("F"))
                .filter(str -> str.contains("k"))
                .filter(str -> str.endsWith("s"))
                .forEach(str -> System.out.println(str));  // jeżeli chcemy cos wyfiltrowac używamy metody 'filter'

        names.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));  // jezeli chcemy przeksztalcic wszystkie elementy bedziemy uzywac metody 'map'

        names.stream()
                .filter(str -> str.length() <= 3)
                .map(str -> "Short name : " + str)
                .forEach(str -> System.out.println(str));  // możemy łączyć ze sobą metody filter i map

        long count = names.stream()
                .filter(str -> str.length() <= 3)
                .count();

        System.out.println(count);


    }
}
