import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Łukasz", "Gajda", "gumisiowy89@o2.pl", 34));  // sortowanie po users zwraca nieposortowana liste
        users.add(new User("Cecylia", "Nawrot", "Sesi96@o2.pl", 27));
        users.add(new User("Jacek", "Zydlewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 18));
        users.add(new User("Mateusz", "Malewski", "maloni87@o2.pl", 35));
        users.add(new User("Bartek", "Biały", "bialy83@o2.pl", 28));
        users.add(new User("Tomek", "Czarny", "tomeki87@o2.pl", 21));
        users.add(new User("Kasia", "Pomarańczowa", "kasia7@o2.pl", 23));

        List<User> sortedUsers = users.stream()                                                   //sortowanie listy po firstName
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName).thenComparing(User::getAge))  // referencja do metody w pierwszej kolejnosci sortowanie po imieniu w drugiej po nazwisku
                .collect(Collectors.toList());

        for (User user : sortedUsers) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAge());
        }


    }
}
