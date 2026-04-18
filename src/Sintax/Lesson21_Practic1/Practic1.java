package Sintax.Lesson21_Practic1;

public class Practic1 {

    static void main(String[] args) {

        System.out.println("Победитель кубка школы: "+getWinner(100,230,84,124));
    }
    public static String getWinner (
            int griffindorPoints, int slyterinPoints,
            int rawenclawPoints, int huffelpufPoints
    ){
        if (griffindorPoints>slyterinPoints
        && griffindorPoints>rawenclawPoints
        && griffindorPoints>huffelpufPoints){
            return "Гриффиндор";
        }else if(slyterinPoints>griffindorPoints
        && slyterinPoints>rawenclawPoints
        && slyterinPoints>huffelpufPoints){
            return "Слитерин";
        }else if (rawenclawPoints>griffindorPoints
        && rawenclawPoints>slyterinPoints
        && rawenclawPoints>huffelpufPoints){
            return "Равенклов";
        }else{
            return "Хафелпаф";
        }
    }
}





