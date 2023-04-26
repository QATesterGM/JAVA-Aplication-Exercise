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

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");

        if(isPowerSuplly) {
            super.switchOn();
        }else{
            System.out.println("PC jest niepodlaczony do pradu");
        }

    }

}
