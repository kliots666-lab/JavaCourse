package Sintax.Lesson17_do_while;

import java.util.Scanner;

public class do_while {
    static void main() {

        int cnt = 0;
/*      Это простой цыкл

        while (cnt < 3) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ваш возраст: ");
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("Вы врослый.");
            } else if (age >= 13) {
                System.out.println("Вы подросток.");
            } else {
                System.out.println("Вы ребенок.");
            }

            cnt++;
            // scanner.close();
        }

        System.out.println("Цыкл завершен.");
*/


        //do-while
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ваш возраст: ");
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("Вы врослый.");
            } else if (age >= 13) {
                System.out.println("Вы подросток.");
            } else {
                System.out.println("Вы ребенок.");
            }

            cnt++;
        }while (cnt < 4);

        System.out.println("Цыкл завершен.");

    }
}
