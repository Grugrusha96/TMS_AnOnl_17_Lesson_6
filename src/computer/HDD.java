package computer;

public class HDD {
    private String name;
    private int volume;
    private HDDTip hddTip;

    public HDD() {
    }

    public HDD(String name, int volume, HDDTip hddTip) {
        this.name = name;
        this.volume = volume;
        this.hddTip = hddTip;
    }


    @Override
    public String toString() {
        return "Имя :" + name + "Volume :" + volume + "Тип :" + hddTip;
    }
}

