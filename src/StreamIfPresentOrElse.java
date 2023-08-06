import model.User;

import java.util.ArrayList;
import java.util.List;

public class StreamIfPresentOrElse {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Łukasz", "Gajda", "gumisiowy89@o2.pl", 34));
        users.add(new User("Cecylia", "Nawrot", "Sesi96@o2.pl", 27));
        users.add(new User("Jacek", "Zydlewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 18));
        users.add(new User("Mateusz", "Malewski", "maloni87@o2.pl", 35));
        users.add(new User("Kasia", "Biały", "bialy83@o2.pl", 28));
        users.add(new User("Tomek", "Czarny", "tomeki87@o2.pl", 90));
        users.add(new User("Kasia", "Pomarańczowa", "kasia7@o2.pl", 23));

        users.stream()
                .filter(user -> user.getFirstName().startsWith("Ce"))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println(user), () -> System.out.println("Nie ma takiego użytkowniaka"));  //Ta metoda przyjmuje 2 parametry: Consumer i lambda
        // albo zwraca nam element, który wystepuje, albo zwraca nam drugą pusta wartosc do ktorej mozemy przypisac komunikat
    }
}