package model.computer;

public class PC extends Computer {

    private boolean isPowerSuplly;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        isPowerSuplly = false;
    }

    public void setPowerSuplly(boolean powerSuplly) {
        isPowerSuplly = powerSuplly;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    @Override
    public int volumeUp() {
        volumeLevel += 1;
        return volumeLevel;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");

        if (isPowerSuplly) {
            super.switchOn();
        } else {
            System.out.println("PC jest niepodlaczony do pradu");
        }
    }

    // TODO komentarz typu todo ;)
}
