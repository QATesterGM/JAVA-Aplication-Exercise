package enums;

public class MainAppEnum {

    public static void main(String[] args) {
        // ENUM - TYPY WYLICZENIOWE typy wyliczeniowe, ktore moga nie miec zadnych wartosci

        System.out.println(WeekDays.PONIEDZIALEK.getName());

        if ("Sroda".equals(WeekDays.SRODA.getName())) {
            System.out.println("Jest OK");
        } else {
            System.out.println("Nie jest OK");
        }
    }
}
