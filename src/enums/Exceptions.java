package enums;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

    public static void main(String[] args) {

        //WYJATKI - SYTUACJE WYJATKOWE

        // 1. DWA TYPY WYJĄTKÓW (MUSIMY ŁAPAĆ I NIE MUSIMY ŁAPAĆ)
        // 2. ŁAPANIE WYJĄTKÓW
        // 3. RZUCANIE WYJĄTKÓW
        // 4. DODANIE WYJĄTKUY DO SYGNATURY METODY
        // 5. TWORZENIE WŁASNYCH WYJĄTKÓW

        // 1. MUSIMY ŁAPAĆ - Exception

        // FileNotFoundException();
        // IOException();

        // 2. NIE MUSIMY ŁAPAć - RuntimeException
        // IllegalStateException();
        // IllegalArgumentException();
        // NullPointerException();
        // IndexOutOfBoundsException();
        // UnsupportedOperationException();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test1.txt"));

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("TO WYKONA SIE ZAWSZE!!!");
        }
    }
}
