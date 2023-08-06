package exceptions;

import java.util.ArrayList;
import java.util.List;

public class IllegalStateException {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Lukasz");
        names.add("Cecylia");
        names.add("Marcin");

        names.stream()
                .filter(s -> s.startsWith("F"))
                .findFirst()
                .orElseThrow(() -> new java.lang.IllegalStateException("Csan not find any names wwith given parameters"));
        //takim wyjatkiem mozemy rzucic ghgdy znajdujemy sie w jakims niezgodnym stanie
        //naszej aplikacji, spodziewam sie czego innego, tego niema, rzucam IllegalStateException
    }
}
