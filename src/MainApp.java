import model.Bug;
import model.User;
import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;
import utils.StringUtils;
import utils.WeekUtils;

public class MainApp {

    public static void main(String[] args) {

//        User u1 = new User("Lukasz", "Gajda", "mail321@gmail.com", 34);
//        User u2 = new User("Lukasz", "Gajda", "mail321@gmail.com", 34);
//        User u3 = new User("Lukasz", "Gajda", "mail321@gmail.com", 34);
//        User u4 = new User("Lukasz", "Gajda", "mail321@gmail.com", 34);
//
//        System.out.println(User.getUserCounter());
//
//        System.out.println(u4.getEmail());
//
//        u4.setEmail("Gumisiowy89@o2.pl");
//
//        System.out.println(u4.getEmail());
//
//
//        Bug bug1 = new Bug("Jakiś tam bug kurde", "mailsrajl@o2.pl", 5);
//
//        System.out.println(bug1.getEmail());
//
//        bug1.setGmail("d@sdsasdaaKa");
//
//        System.out.println(bug1.getEmail());
//
//        System.out.println(StringUtils.getFormatedText("LukaszTest"));
//
//        System.out.println(Math.random() + 1);
//
//        System.out.println(WeekUtils.MONDAY);

        PC officeComputer1 = new PC("Office computer1", "HP", 500, 128);
        PC officeComputer2 = new PC("Office computer", "HP", 500, 128);
        PC officeComputer3 = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP Games", 1000, 512, 50);
        Laptop macbook = new Laptop("XGames", "HP Games", 1000, 512, 50);

//        gamingLaptop.setBatteryLevel(75);
//        gamingLaptop.switchOn();
//        System.out.println(gamingLaptop.getState());

        System.out.println(officeComputer1.getState());
        officeComputer1.setPowerSuplly(true);
        officeComputer1.switchOn();
        System.out.println(officeComputer1.getState());

        System.out.println(gamingLaptop);

        Computer officeComputer11 = new PC("Office computer11", "HP", 500, 128);
        Computer officeComputer22 = new PC("Office computer22", "HP", 500, 128);
        Computer officeComputer33 = new PC("Office computer33", "HP", 500, 128);
        Computer gamingLaptopX = new Laptop("XGamesPRO", "HP Games", 1000, 512, 50);
        Computer macbookX = new Laptop("XGames", "HP Games", 1000, 512, 50);

        Computer[] computers = {officeComputer11, officeComputer22, officeComputer33, gamingLaptopX, macbookX};

        for (Computer computer : computers){
            computer.switchOff();
        }

        System.out.println(officeComputer33.getState());
        ((PC) officeComputer33).setPowerSuplly(true);
        officeComputer33.switchOn();
        System.out.println(officeComputer33.getState());




    }
}
