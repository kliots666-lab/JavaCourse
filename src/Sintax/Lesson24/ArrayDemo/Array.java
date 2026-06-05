package Sintax.Lesson24.ArrayDemo;

import java.util.Arrays;

public class Array {
    static void main(String[] args) {

        int[] arrNumbers = new int[6];
        arrNumbers[0] = 6;
        arrNumbers[1] = 7;
        arrNumbers[2] = 23;
        arrNumbers[3] = 35;
        arrNumbers[4] = 96;
        arrNumbers[5] = 1;

        System.out.println(Arrays.toString(arrNumbers));
        System.out.println("5-й элемент массива arrNumbers = " + arrNumbers[4]);
        //length - метод для получения длины массива
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println("Номер индекса arrNumbers " + i + " значение индекса " + arrNumbers[i]);
        }

        int[] arrNumbers1 = {6, 7, 23, 35, 96, 1};
        System.out.println(Arrays.toString(arrNumbers1));
        System.out.println("5-й элемент массива = arrNumbers1 " + arrNumbers1[4]);


    }

}

