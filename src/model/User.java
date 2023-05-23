package model;

import java.util.Objects;

public class User implements Comparable<User> {

    private static int userCounter = 0;

    public static int getUserCounter() {
        return userCounter;
    }

    // 1. POLA OBIEKTU
    // OPISUJĄ Z CZEGO SKŁADA SIE OBIEKT

    private String firstName; //null
    private String lastName; //null
    private String email; //null
    private int age; //null
    private boolean isAdult;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

// 2. METODY
    // OPISUJĄ CO DANY OBIEKT BĘDZIE MÓGŁ ZROBIĆ

    //zwracany typ + nazwa metody
    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    // void nie zwraca żadnej wartości
    void getAllInfo() {
        System.out.println("Użytkownik nazywa się " + firstName + " " + lastName + ", jego mail to " + email + ",a jego wiek to: " + age + " czyli jest pełnoletni: " + isAdult);
    }

    // zwraca inta
    int getUserAge() {
        return age;
    }


    // zwraca booleana
    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // metoda z parametrem
    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + " you are " + userAge + " years old");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

    //Przeciążanie metod
    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see You!");
    }

    void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see You!");
    }

    void greetings(String firstName, String lastName, int userAge) {
        System.out.println("Hi " + firstName + " " + lastName + ". Nice to see You! " + userAge);
    }

    // 3. KONSTRUKTOR
    // DOMYSLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

    User() {
    }

    User(String firstNameParam, String lastNameParam, String emailParam, int ageParam, boolean isAdultParam) {

        firstName = firstNameParam;
    }

    // uzywamy tej konwencji !!!!!!!!!!!!!!!!!!!!!!!!!
    User(String firstName, String lastName) {
        this.lastName = lastName; // jest zasada ze jak nazywamy pola obiektu tak jak nazwy parametrow dajemy "this" przy nazwie obiektu
        firstName = firstName; // w przeciwnym razie inteliJ i kompilator nie rozpoznaja ktore to nazwa obiektu a ktore nazwa parametru
        // druga zasada po lewej stronie dajemy nazwy pola obiektu a dopiero przypisujemy im jakas wartosc
    }

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
    }

    //TODO zawsze nadpisuj metode toString equals i hashcode

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                isAdult == user.isAdult &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult);
    }


    //TODO metoda sluzaca do porównywania obiektów w secie ZAWSZE NADPISYWAC!!! JAK CHCEMY POROWNYWAC OBIEKTY
    @Override
    public int compareTo(User o) {
        int compareResult = this.getFirstName().compareTo(o.getFirstName());
        if (compareResult == 0) {
            compareResult = this.getLastName().compareTo(o.getLastName());
        }
        return compareResult;
    }
}
