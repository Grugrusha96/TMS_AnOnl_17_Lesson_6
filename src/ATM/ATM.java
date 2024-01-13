package ATM;

public class ATM {
    int mony10;
    int mony20;

    int mony50;
    int mony100;

    public ATM(int mony20, int mony50, int mony100, int mony10) {
        this.mony10 = mony10;
        this.mony20 = mony20;
        this.mony50 = mony50;
        this.mony100 = mony100;
    }

    void addMoney(int mony20, int mony50, int mony100, int mony10) {
        this.mony10 += mony10;
        this.mony20 += mony20;
        this.mony50 += mony50;
        this.mony100 += mony100;

    }

    boolean takeMoney(int value) {
        int mony100 = value / 100;
        int count100 = (mony100 > this.mony100) ? this.mony100 : mony100;
        value -= count100 * 100;

        int mony50 = value / 50;
        int count50 = (mony50 > this.mony50) ? this.mony50 : mony50;
        value -= count50 * 50;

        int mony20 = value / 20;
        int count20 = (mony20 > this.mony20) ? this.mony20 : mony20;
        value -= count20 * 20;

        int mony10 = value / 10;
        int count10 = (mony10 > this.mony10) ? this.mony10 : mony10;
        value -= count10 * 10;

        if (value == 0) {
            System.out.println("Выдано 100 купюр :" + count100);
            System.out.println("Выдано 50 купюр :" + count50);
            System.out.println("Выдано 20 купюр :" + count20);
            System.out.println("выдано 10 купюр :" +count10 );

            return true;

        } else {
            return false;
            }
    }
}
