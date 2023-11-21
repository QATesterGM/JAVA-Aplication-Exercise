public class Table {
    public static void main(String[] args) {

        //1. Tablica - zbiór danych tego samego typu
        //2. Zawsze musimy określić rozmiar tablicy
        //3. Ostatni elment - długosc tablicy - 1
        //4. [] - Tablica
        //5. int[] numbers = new int[10]

        String[] names = new String[5];

        names[0] = "Lukasz";
        names[1] = "Mariusz";
        names[2] = "Monika";
        names[3] = "Asia";
        names[4] = "Tomek";

        //for (licznik, warunek, zmiana licznika);

        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0)                    // tylko dla parzystych wynik modulo, reszta z dzielenia
                System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

        // roznica miedzy tymi petlami jest taka, ze w pierwszej musimy znać index i możemy przeskakiwac miedzy
        // elementami a w tej drugiej petla wykona sie dla kazdego elementu tablicy

        String[] namesTwo = {"Marta", "Lukasz", "Michał", "Tomek"};
        System.out.println(namesTwo.length);

        for (String nameTwo : namesTwo) {
            System.out.println(nameTwo.toUpperCase());
        }

        for (int i = 0; i < namesTwo.length; i++) {
            System.out.println(namesTwo[i].toLowerCase());
        }

        //for(zmienna inicjalna; warunek wykonywalności; modyfikator Licznika;){instrukcja wykonania}
        for (int i = 1; i <= 10; i++){
            System.out.println("Gajda Lukasz");
        }

    }
}