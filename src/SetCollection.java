import model.User;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

    public static void main(String[] args) {

        //SET = ZBIÓR UNIKALNYCH ELEMENTÓW

        Set<User> users = new HashSet<>();
        users.add(new User("Łukasz", "Gajda", "gumisiowy89@o2.pl", 34));
        users.add(new User("Marta", "Gajda", "gumisiowy89@o2.pl", 34)); //Zignoruje duplikat obiektu
        users.add(new User("Mateusz", "Matysiuk", "gumisiowy89@o2.pl", 40));
        users.add(new User("Marta", "Kowalski", "gumisiowy89@o2.pl", 25));
        users.add(new User("Marta", "Komik", "gumisiowy89@o2.pl", 46));
        users.add(new User("Ania", "Lis", "gumisiowy89@o2.pl", 38));

//        System.out.println(users.size());
//
//        for(User userList: users){
//            System.out.println(userList);
//        }
//
//        for(User user: users){
//            System.out.println(user.getFirstName() + " " + user.getLastName());
//        }

        Set<User> sortedUsers = new TreeSet<>(users);

        //TODO jezeli uzywamy SETA i chcemy zwrocic unikalne posortowane
        //TODO wartosci to klasa porywnywanych obiektów musi Implementować klase Comparable

       for(User user: sortedUsers){
           System.out.println(user.getFirstName() + " " + user.getLastName());
       }


    }
}
