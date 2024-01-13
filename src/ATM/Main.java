package ATM;

public class Main {
    public static void main (String[] agrs){
        ATM atm = new ATM( 0, 1,2,5);

        System.out.println(atm.takeMoney(170));
    }
}
