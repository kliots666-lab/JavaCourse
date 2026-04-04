package Sintax.Lesson15_printfDemo;

import java.time.LocalDateTime;

public class PrintfDemo {
    static void main() {


//%s - строка %n - перенос строки
        var name = "Сергей";
        System.out.printf("Hello, %s!%n", name);
//        %d - простое число
        int age = 40;
        System.out.printf("Age %d %n", age);
//%f - дробное число
        double rost = 1.68;
        System.out.printf("Rost %1.2f m %n",rost);
//%tF - дата %tT - время
        LocalDateTime now = LocalDateTime.now();
        System.out.printf("Date & time: %tF %tT", now, now);







    }
}
