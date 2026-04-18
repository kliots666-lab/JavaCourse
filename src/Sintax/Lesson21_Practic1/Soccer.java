package Sintax.Lesson21_Practic1;

public class Soccer {
    static void main(String[] args) {

        System.out.println("Кубок выиграла команда " +champion(10, 7));
    }

    public static String champion(
            int spartak, int cska
    ) {
        if (spartak > cska) {
            return "Спартак";
        } else {
            return "ЦСКА";
        }


}

    }

