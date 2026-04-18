package Sintax.Lesson22_switch_when;

public class SwitchDemo {
    static void main(String[] args) {

        System.out.println(
        WhenDemoKt.getWinner(120,23,4,54));
    }
    /*a - Зенит, b - Спартак, c - Урал, d - Локомотив
    public static String getWinner(
            int zenit, int spartak,
            int ural, int loco
    ) {
        int maxPoints = Math.max(Math.max(Math.max(zenit, spartak), ural), loco);

        return switch (maxPoints) {
            case zenit -> "Зенит";
            case spartak ->  "Спартак";
            case ural -> "Урал";
            default -> "Нет победителя";
            }
        }

    }*/
}

