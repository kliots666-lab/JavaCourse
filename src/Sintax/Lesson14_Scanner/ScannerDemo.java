package Sintax.Lesson14_Scanner;

import java.io.File;
import java.util.Scanner;

public class ScannerDemo {
    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine().trim();

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        System.out.println("Имя: "+name+".");
        System.out.println("Возраст: "+age+" лет.");






    }
}
