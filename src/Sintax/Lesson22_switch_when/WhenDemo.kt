package Sintax.Lesson22_switch_when

fun getWinner(zenit: Int, spartak: Int, ural: Int, loco: Int): String {

    val maxPoints = maxOf(zenit,spartak,ural,loco)

    return when (maxPoints){
        zenit -> "Зенит"
        spartak -> "Спартак"
        ural -> "Урал"
        else -> "Локомотив"
    }
}