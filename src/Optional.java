import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Optional {

    public static void main(String[] args) {

        // Optional - opakowanie dla obiektu   TEN OBIEKT może istniec, ale moze go tez tam nie puc, moze byc pusty
        // Optional[ obiekt ] / Optional[ ]
        // Zabezpieczenie przed null'ami

        List<User> users = new ArrayList<>();
        users.add(new User("Łukasz", "Gajda", "gumisiowy89@o2.pl", 34));
        users.add(new User("Cecylia", "Nawrot", "Sesi96@o2.pl", 27));
        users.add(new User("Jacek", "Zydlewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 36));
        users.add(new User("Jacek", "Majewski", "jaco84@o2.pl", 18));
        users.add(new User("Mateusz", "Malewski", "maloni87@o2.pl", 35));
        users.add(new User("Bartek", "Biały", "bialy83@o2.pl", 28));
        users.add(new User("Tomek", "Czarny", "tomeki87@o2.pl", 90));
        users.add(new User("Kasia", "Pomarańczowa", "kasia7@o2.pl", 23));

        java.util.Optional<User> max = users.stream()
                .max(Comparator.comparingInt(User::getAge));

        // get()
        // isPresent()  zwraca boolean czy wystepuje
        // isEmpty()    zwraca boolean czy jest pusty czy nie
        // orElse()
        // orElseGet()
        // orElseThrow()
        // ifPresent()
        // ifPresentOrElse()

        //System.out.println(max.get());

        if (max.isPresent()) { // jezeli zwroci nam element to teraz bezpiecznie mozemy uzyc geta ktory w przypadku braku elemetntu wyrzucilby wyjatek
            System.out.println(max.get());
        } else {
            System.out.println("Nie znalazlem takiego elementu");
        }
    }
}
