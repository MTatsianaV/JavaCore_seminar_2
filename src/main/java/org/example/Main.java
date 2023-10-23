package org.example;
import java.util.*;

public class Main {

//    Написать метод, возвращающий количество чётных элементов массива.
//    countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0

    public static int counterOfEven(int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) count +=1;
        }
        return count;
    }
//Написать функцию, возвращающую разницу между самым большим и
// самым маленьким элементами переданного не пустого массива.

    public static int differenceBetweenMaxMin(int [] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        return max - min;
    }

    //Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

    public static boolean twoZeros(int [] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if ((array[i] == array[i - 1]) && (array[i] == 0)) count += 1;
        }
        if (count > 0) return true;
        else return false;
    }

    public static int[] createArray(int size){
        int [] newArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(0, 5);
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] ourArray = createArray(10);
        System.out.println(Arrays.toString(ourArray));
        System.out.println("Количество чётных элементов: " + counterOfEven(ourArray));
        System.out.println("Разница между максимальным и минимальным значениями: " + differenceBetweenMaxMin(ourArray));
        System.out.println("Наличие соседних нулей -> : " + twoZeros(ourArray));

    }
}