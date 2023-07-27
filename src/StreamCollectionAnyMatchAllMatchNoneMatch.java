import java.util.ArrayList;
import java.util.List;

public class StreamCollectionAnyMatchAllMatchNoneMatch {
    public static void main(String[] args) {

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

        boolean anyMatch = names.stream()
                .anyMatch(s -> s.contains("a"));  // Jeden element musi spełniac warunek

        System.out.println(anyMatch);

        boolean allMatch = names.stream()
                .allMatch(s -> s.length() > 2);   // Wszystkie elementy musza spełniać ten warunek

        System.out.println(allMatch);

        boolean noneMatch = names.stream()        // Zaden z elementów nie może spełniac tego warunku
                .noneMatch(s -> s.endsWith("ski"));

        System.out.println(noneMatch);

    }
}
