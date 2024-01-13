package computer;

public class Computer {
    private String model;
    private double price;
    private RAM ram;
    private HDD hdd;

    public Computer(String model, double price) {
        this.model = model;
        this.price = price;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(String model, double price, RAM ram, HDD hdd) {
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Модель компа :" + model + " Цена :" + price + "RAM :" + ram + "HDD :" + hdd;
    }
}

