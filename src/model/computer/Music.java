package model.computer;

public interface Music {

    //1. NIE MOŻNA DODAWAĆ PÓL OBIEKTU
    //2. MOŻNA TWORZYĆ TYLKO STAŁE - DOMYŚLNIE public static final

    public static final String NAME = "MUSIC";

    // modyfikator dostpepu jest zbędny (redundant), static jest zbędny (redundant), final jest zbędny(redundant)
    // każda stała domyslenie bedzie publiczna statyczna i finalna

    String MUSIC = "Hip-Hop";

    //3. MOŻEMY TWORZYĆ TYLKO METODY ABSTRAKCYJNE - domyślnie public abstract

    public abstract void createMusic(); //ponownie public abstract są zbędne

    //wszystkie metody w interface są publiczne i abstrakcyjne

    void playMusic();
    void pauseMusic();
    void stopMusic();


    // OD JAVY 8

    //4. METODY DOMYSLNE - ZWYKLE METODY
    default void sayHelloFromMusic() {
        System.out.println("Hello from default"); // metoda nie może miec ciała, jesli chcemy cialo musi być default
    }

    //5. METODY STATYCZNE

    static String getName(){
        privateMethod();
        return NAME;
    }

    //6. PRYWATNE STATYCZNE METODY

    private static void privateMethod(){
        System.out.println("Hello from private method");
    }


}
