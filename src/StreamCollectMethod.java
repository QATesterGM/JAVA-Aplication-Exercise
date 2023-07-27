import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectMethod {
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

        List<String> fNames = names.stream()
                .filter(s -> s.startsWith("To"))
                .collect(Collectors.toList());    // Tworzy kolekcje z pasującymi elemenatami

        System.out.println(fNames);

    }
}
