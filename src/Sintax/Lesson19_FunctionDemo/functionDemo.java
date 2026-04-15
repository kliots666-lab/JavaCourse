package Sintax.Lesson19_FunctionDemo;

public class functionDemo {
    static void main() {

        System.out.println("Сумма 2-х чисел 15 и 35 = " + summOfNumbers(15, 35));
        System.out.println("Сумма 2-х чисел 38 и 144 = " + summOfNumbers(38, 144));


    }

    // public - идентификатор доступа, static - означает, что он пренадлежит напрямую классу, long - возвращаемый тип
    // summOfNumbers - название функции, (int a, int b) - аргументы, которые принимает эта функция
    public static long summOfNumbers(int a, int b) {
        // return - логика, возвращает a+b
        return a + b;
    }
}
