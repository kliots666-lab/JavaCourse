package Sintax.Lesson8_operations;

public class Operations {
    static void main() {

        int a=10, b=3;
//        Оператор присваивания
        b=a;
//        Арифмитические операторы
        int sum=a+b;
        int diff=a-b;
        int product=a*b;
        int qotient=b/a;
        int remainder=a%b;

//        a=a+1;
        a++; //Инкрементирование
//        a=a-1;
        a--; //Дикрементирование
//        a=a+5
        a +=5;
//        Операции сравнения
//        Сравнение равенства
        boolean isEqual;
        if (a == b) isEqual = true;
        else isEqual = false;
//          Сравнение a>b
        boolean isGreater;
        if (a > b) isGreater = true;
        else isGreater = false;
//        Сравнение a<b
        boolean isLess;
        if (a < b) isLess = true;
        else isLess = false;

//        Сравнение a>=b
        boolean isGreaterOrEqual;
        if (a >= b) isGreaterOrEqual = true;
        else isGreaterOrEqual = false;

//        Сравнение a<=b
        boolean isLessOrEqual;
        if (a <= b) isLessOrEqual = true;
        else isLessOrEqual = false;

        //        Сравнение неравенства
        boolean isNotEqual;
        if (a != b) isNotEqual = true;
        else isNotEqual = false;














    }
}
