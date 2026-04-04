package Sintax.Lesson16_If;

import java.util.Scanner;

public class IfDemo {
    static void main() {

//        System.in - объявляем сканер из консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш возраст: ");
        int age = scanner.nextInt();


//Этот код я брал из головы, пробовал составить условие сам, без обучения и учебников, просто вспоминая институтские времена
        //if (age<18) System.out.println("Вы ещё ребёнок!");
        //else System.out.println("Вы взрослый!");

//        Это код по обучающей программе
        if (age >= 18) {
            System.out.println("Вы врослый.");
        } else if (age >= 13) {
            System.out.println("Вы подросток.");
        } else {
            System.out.println("Вы ребенок.");
        }
        scanner.close();


    }


}

