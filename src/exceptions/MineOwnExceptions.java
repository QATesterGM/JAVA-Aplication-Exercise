package exceptions;

public class MineOwnExceptions extends RuntimeException { // Tworzac wlasne wyjatki mozemy zdecydowac czy bedziemy musieli je lapac czy nie wybierajac jako klase matke
    // Exception zamiast RuntimeException (dobra praktyka żeby uzywac RuntimeException)

    public MineOwnExceptions() {
    }

    public MineOwnExceptions(String message) {
        super(message);
    }
}
