package TaskFour;

import java.util.function.Consumer;

//Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//выводить сумму переведенную сразу в доллары.
public class OneMain {
    public static void main(String[] args) {
        String myMoney="124 BYN";
        Consumer<String> myTest= (String test )-> {
            String[] parts=test.split(" ");
            double sum = Double.parseDouble(parts[0]);
            double dollars=sum/3.2;
            System.out.println("Твои бабки: " + myMoney);
            System.out.println("Твои бабки переведенные: " + dollars + " USD");
        };
        myTest.accept(myMoney);
    }
}
