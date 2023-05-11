package model.computer;

public class Laptop extends Computer implements Music, Video {

    private int batteryLevel;


    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
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

    @Override
    public void createMusic() {
        System.out.println("CREATE MUSIC");
    }

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");
    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }

    @Override
    public void createVideo() {

    }

    @Override
    public void playVideo() {

    }

    @Override
    public void pauseVideo() {

    }

    @Override
    public void stopVideo() {

    }
}
