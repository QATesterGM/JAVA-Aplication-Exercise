import model.Bug;
import model.User;
import utils.StringUtils;
import utils.WeekUtils;

public class MainApp {

    public static void main(String[] args) {

        User u1 = new User("Lukasz", "Gajda", "mail321@gmail.com", 34);
        User u2 = new User("Lukasz", "Gajda", "mail321@gmail.com", 34);
        User u3 = new User("Lukasz", "Gajda", "mail321@gmail.com", 34);
        User u4 = new User("Lukasz", "Gajda", "mail321@gmail.com", 34);

        System.out.println(User.getUserCounter());

        System.out.println(u4.getEmail());

        u4.setEmail("Gumisiowy89@o2.pl");

        System.out.println(u4.getEmail());


        Bug bug1 = new Bug("Jakiś tam bug kurde", "mailsrajl@o2.pl", 5);

        System.out.println(bug1.getEmail());

        bug1.setGmail("d@sdsasdaaKa");

        System.out.println(bug1.getEmail());

        System.out.println(StringUtils.getFormatedText("LukaszTest"));

        System.out.println(Math.random() + 1);

        System.out.println(WeekUtils.MONDAY);
    }
}
