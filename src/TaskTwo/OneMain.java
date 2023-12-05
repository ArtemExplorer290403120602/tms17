package TaskTwo;

import java.util.function.Predicate;

//Используя Predicate среди массива чисел вывести только те, которые являются
//положительными.
public class OneMain  {
    public static void main(String[] args) {
        int[] array={-1,4,6,7,8,-4,-5,6};
        Predicate<Integer> myTest = number-> number>0;
        for (int numberTest: array) {
            if(myTest.test(numberTest)){
                System.out.print(numberTest + " ");
            }
        }
    }
}
