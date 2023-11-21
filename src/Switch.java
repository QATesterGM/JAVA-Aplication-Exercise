public class Switch {

    public static void main(String[] args) {

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = homePage;

        switch (page) {
            case "Home":
                System.out.println("Przelaczas sie do strony Home");
                break;
            case "Login":
                System.out.println("Przelaczas sie do strony Login");
                break;
            case "Contact":
                System.out.println("Przelaczas sie do strony Contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");
        }
    }
}