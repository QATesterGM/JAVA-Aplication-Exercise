public class MainApp {

    public static void main(String[] args) {

        Bug firstBug = new Bug("Bug przy wyswietlaniue sie nowej strony",
                "gajdalukasz89@o2.pl", 5);
        int bugPriority = firstBug.getBugPriority();
        System.out.println(bugPriority);

        firstBug.showAllBugInfo();
        firstBug.setEmail("nowymail@89");
        firstBug.showAllBugInfo();

        Bug secondBug = new Bug("Krótki opis", "gajdalukasz89@o2.pl", 4);
        secondBug.showAllBugInfo();
        secondBug.setBugDescription("Opis");

        Bug thirdBug = new Bug("Opisfjasomokaokcmsoa", "kup", 6);
        thirdBug.showBugDescription();
        thirdBug.setBugDescription("poprawny opis");
        thirdBug.showBugDescription();
        thirdBug.setEmail("gumisiowy89@o2.pl");
        thirdBug.setBugPriority(4);
        thirdBug.showAllBugInfo();

        User lukasz = new User("Łukasz", "Gajda", "gumisiowy89@o2.pl", 71);
        lukasz.getAllInfo();
        boolean userAdult = lukasz.isUserAdult();
        if(userAdult == true){
            System.out.println("Pełnoletni skurczybyk");
        }else{
            System.out.println("Nie jest pełnoletni, to jeszcze dzieciak");
        }

        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s = str1.toUpperCase();
        System.out.println(s);
        String s1 = str1.toLowerCase();
        System.out.println(s1);

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);
        System.out.println(str1.endsWith("lo"));
        System.out.println(str1.contains("ll"));

        System.out.println("    ".isBlank()); //ignoruje spacje
        System.out.println("  ".isEmpty());

        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);

        String sra = str1.replaceAll("ll", "GG");
        System.out.println(sra);

        String textWithWhiteSpaces = "   to jest jakiś text    ";
        System.out.println(textWithWhiteSpaces.length());

        String strip = textWithWhiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());


    }
}
