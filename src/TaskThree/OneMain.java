package TaskThree;

import java.util.function.Function;

//Используя Function реализовать лямбду, которая будет принимать в себя строку в
//формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//возвращать сумму переведенную сразу в доллары
public class OneMain {
    public static void main(String[] args) {
        String myMoney="1213 BYN";
        Function<String, Double> myTest = test -> {
            String[] parts=test.split(" ");
            double amountInByn=Double.parseDouble(parts[0]);
            double amountInDollars=amountInByn/3.2;
            return amountInDollars;
        };
        double results=myTest.apply(myMoney);
        System.out.println("Ваша бабки: " + myMoney);
        System.out.println("Ваши денюжки: " + results + " USD");
    }
}
