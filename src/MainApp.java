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


    }
}
