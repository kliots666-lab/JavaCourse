package Sintax.Lesson5_variables;

public class Variables {
    static void main() {

        //Byte -128..127
        byte byteNumber=40;
        System.out.println("The byte number: "+byteNumber);

        //Short -32768..32767
        short shortNumber=30000;
        System.out.println("The short number: "+shortNumber);

        //int -2 billion..2billion
        int intNumber=700560544;
        System.out.println("The int number: "+intNumber);

        //long 8 bytes
        long longNumber= 999_586_745L;
        System.out.println("The long number: "+longNumber);

        //float
        float floatNumber=3.12F;
        System.out.println("The float number: "+floatNumber);

        double doubleNumber=123.342;
        System.out.println("Tne double number: "+doubleNumber);

        char simbol='A';
        System.out.println(simbol);

        boolean booleancat;
        booleancat=true;
        booleancat=false;
        System.out.println("Cat is: "+booleancat);

        //Назначает переменную атоматически
        var dog=12;
        System.out.println("Возраст собаки: "+dog);

        int x, y;
        x=10;
        y=200;
        System.out.println("x="+x);
        System.out.println("y="+y);

        //Приведение типов
        short varForCasting=byteNumber;
        System.out.println(varForCasting);

        int intNewVar=varForCasting;
        System.out.println(intNewVar);

        var doubleVar=3.6;
        int intNewinteger = (int) doubleVar;
        System.out.println("After casting intNewinteger: "+intNewinteger);







    }

}
