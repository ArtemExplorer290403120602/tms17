package Task;

import java.time.LocalDate;
import java.util.Scanner;

//Пользователь вводит в консоль дату своего рождения. Программа должна вернуть
//дату, когда пользователю исполнится 100 лет. Использовать Date/Time API.
public class OneMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите дату своего рождения: ");
        LocalDate date=LocalDate.parse(scanner.nextLine());
        System.out.println("Ваша дата рождение: " + date);
        LocalDate futureDate = date.plusYears(100);
        System.out.println("Ваша дата через 100 лет: " + futureDate);
    }
}
