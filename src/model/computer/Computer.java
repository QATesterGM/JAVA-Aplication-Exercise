package model.computer;

abstract public class Computer {
    protected String name;
    protected String type;
    protected Hdd hdd;  //KOMPOZYCJA zachodzi zależnosc HAS I
    protected Ram ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("SUPER - ustawiam pole na true");
        state = true;
    }

    public void switchOff() {
        System.out.println("Wylaczam komputer " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }

    // METODY ABSTRAKCYJNE

    public abstract int volumeUp();  // METODA ABSTRAKCYJNA -  nie ma swojego ciała,
    // uruchamia metody w klasach dzieciach gdy obiekt jest typu matka, musi być publiczna

    public abstract int volumeDown();
}
