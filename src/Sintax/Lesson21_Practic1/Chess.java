package Sintax.Lesson21_Practic1;

public class Chess {
    static void main(String[] args) {

        System.out.println("Чемпионат по шахматам выиграл: "+winner(3,6,7));
    }

            public static String winner(
                    int kasparov, int kasparya,
                    int yatsenko
                )
            {
                if (kasparov > kasparya && kasparov > yatsenko) {
                    return "Каспаров";
                } else if (kasparya>kasparov && kasparya>yatsenko) {
                    return "Каспарян";
                }else {
                    return "Яценко";
                }






        }
    }

