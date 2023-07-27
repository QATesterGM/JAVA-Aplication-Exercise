import model.User;

import java.util.ArrayList;
import java.util.List;

public class StramOrElseGet {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        //users.add(new User("Łukasz", "Gajda", "gumisiowy89@o2.pl", 34));
        users.add(new User("Cecylia", "Nawrot", "Sesi96@o2.pl", 27));
        users.add(new User("Jacek", "Zydlewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 18));
        users.add(new User("Mateusz", "Malewski", "maloni87@o2.pl", 35));
        users.add(new User("Kasia", "Biały", "bialy83@o2.pl", 28));
        users.add(new User("Tomek", "Czarny", "tomeki87@o2.pl", 90));
        users.add(new User("Kasia", "Pomarańczowa", "kasia7@o2.pl", 23));

        //FunctionalInterface
        // Predicate - pobiera jedną wartosc i zwraca boolean
        // Consumer - pobiera jedną wartosc i nic nie zwraca
        // Supplier - dostarcza wartosc

        User lukasz = users.stream()
                .filter(user -> user.getFirstName().startsWith("Ł"))  //tutaj mamy Predicate
                .findFirst()  //tutaj dostajemy Optionala
                .orElseGet(() -> new User("ŁukaszGet", "GajdaGet", "b@test.com", 10));  //przyjmuje Supplier, podajemy pusty parametr, ale zwroci na nowego uzytkownika

        //czyli probujemy znaleźć jakoegos uzytkownika, ktorego imie zaczyna sie na litere B,
        //jezeli taki bedzie to go zwracamy, jezeli nie to dodajemy nowego uzytkownika

        System.out.println(lukasz);
    }
}
