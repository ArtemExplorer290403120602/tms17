package TaskFive;

import java.util.Scanner;
import java.util.function.Supplier;

//Используя Supplier написать метод, который будет возвращать введенную с консоли
//строку задом наперед.
public class OneMain {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> {
            Scanner scanner=new Scanner(System.in);
            StringBuilder myText= new StringBuilder(scanner.nextLine());
            myText.reverse();
            return String.valueOf(myText);
        };
        String resutl = stringSupplier.get();
        System.out.println(resutl);
    }
}
