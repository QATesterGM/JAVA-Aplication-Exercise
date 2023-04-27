package model.computer;

public class Laptop extends Computer {

    private int batteryLevel;


    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;

    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;  // POLEOBIEKTU = PARAMETR, nigdy odwrtonie!!!!!!!!!!!!!!!!!!!!
    }


    @Override
    public int volumeUp() {
        volumeLevel += 20;
        if (volumeLevel >= 100) {
            System.out.println("Glośnośc jest na maksa");
            return volumeLevel = 100;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery is to low!");
        }
    }

}
