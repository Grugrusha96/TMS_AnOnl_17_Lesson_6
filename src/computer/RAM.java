package computer;

public class RAM {
    private String name;
    private double volume;
    public  RAM(){
    }
    public RAM (String name, double volume){
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Имя :" + name + "Volume :" + volume;
    }
}

