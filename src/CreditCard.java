import buttons.Button;
import computer.Computer;
import computer.HDD;
import computer.HDDTip;
import computer.RAM;


//1. Создать класс CreditCard с полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard y которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.
public class CreditCard {
    public static void main(String[] args) {
        Button card1 = new Button(24,
                6589);
        Button card2 = new Button(56,
                5648);
        Button card3 = new Button(12,
                5645);

    }

}