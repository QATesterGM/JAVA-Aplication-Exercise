import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamOrElse {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User("Łukasz", "Gajda", "gumisiowy89@o2.pl", 34));
        users.add(new User("Cecylia", "Nawrot", "Sesi96@o2.pl", 27));
        users.add(new User("Jacek", "Zydlewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 18));
        users.add(new User("Mateusz", "Malewski", "maloni87@o2.pl", 35));
        //users.add(new User("Kasia", "Biały", "bialy83@o2.pl", 28));
        users.add(new User("Tomek", "Czarny", "tomeki87@o2.pl", 90));
        //users.add(new User("Kasia", "Pomarańczowa", "kasia7@o2.pl", 23));

        java.util.Optional<User> max = users.stream()
                .max(Comparator.comparingInt(User::getAge));

        String kasia = users.stream()
                .map(User::getFirstName)  //stream ktory sklada sie z uzytkownikow zamieniamy na stream, ktory sklada sie tylko ze Stringow z pierwszego imienia
                .filter(s -> s.equals("Kasia"))  // na tym streamie, ktory sklada sie tylko z pierwszych imion wywolujemy filtr, który szuka Kasi
                .findFirst() // wołamy pierwszą Kasie, dostajemy optionala bo moze nie byc zadnego obiektu
                .orElse("Kasi nie ma w zbiorze");  // natomiast w przeciwnym wypadku dostaniemy jakas wartosc, np Kasia nie isnietje w zbiorze

        System.out.println(kasia);

        int maxAge = users.stream()
                .map(User::getAge)
                .max(Integer::compareTo)
                .orElse(-1);

        System.out.println(maxAge);
    }
}
