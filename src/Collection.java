import model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection {

    public static void main(String[] args) {

        //KOLEKCJA - ZBIÓR ELEMENTÓW TEGO SAMEGO TYPU -> ELEMENT1, ELEMENT2, ELEMENT3

//        List<String> names = new ArrayList<>();
////
////        names.add("Łukasz");
////        names.add("Marta");
////        names.add("Magda");
////        names.add("Sylwia");
////
////        List<String> names2 = new ArrayList<>();
////
////        names2.add("Janek");
////        names2.add("Mateusz");
////
////        System.out.println(names);
////        System.out.println(names2);
////
////        for (String name : names) {
////            System.out.println(name);
////        }
////
////        names.addAll(names2);
////
////        System.out.println(names);
////
////        Collections.sort(names);
////
////        System.out.println(names);
////
////        Collections.reverse(names);
////
////        System.out.println(names);

        List<User> users = new ArrayList<>();
        users.add(new User("Łukasz", "Gajda","gumisiowy89@o2.pl", 34));
        users.add(new User("Marta", "Matysiuk", "marta90@o2.pl", 33));
        users.add(new User("Jacek", "Zydlewski", "jaco84@o2.pl", 36));
        users.add(new User("Mateusz", "Malewski", "maloni87@o2.pl", 35));

        System.out.println(users);

        for (User user : users){
            System.out.println(user.getEmail());
        }

        Collections.sort(users, Comparator.comparing(User::getFirstName)); // sortowanie po imieniu, korzystamyz klasy Comparator
        System.out.println(users);

        Collections.sort(users, Comparator.comparingInt(User::getAge));
        System.out.println(users);




    }
}
