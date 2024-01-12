package buttons;

public class Button {
    int numberCards;
    int summa;

   public Button (int summa, int numberCards){
       this.summa = summa;
       this.numberCards = numberCards;
       System.out.println("сумма на счету :" + summa + "Номер счета :" + numberCards);
   }
public void Popolnenie (int summa){
       this.summa += summa;
       System.out.println("счет пополнен, баланс :" + this.summa);
}
public void Snjtie (int summa){
       this.summa -= summa;
       System.out.println("сумма снята, баланс : " + this.summa);
}
public void Information (){
       System.out.println( "Счет номер" + numberCards + " Сумма на счету" + this.summa );
}
    }

