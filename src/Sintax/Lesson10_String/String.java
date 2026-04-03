package Sintax.Lesson10_String;

class String {
    static void main() {

        java.lang.String Name = "Сергей";
        java.lang.String Lastname = new java.lang.String("Яценко");
        System.out.println("Имя: "+Name+" Фамилия: "+Lastname);

//        Эквивалентность
        java.lang.String firstString = "Hello";
        var secondString = "hello";
        System.out.println("Одинаковые ли значения в строках? "+firstString.equals(secondString));
        System.out.println("Одинаковые ли значения в строках игнорирую регистр? "+firstString.equalsIgnoreCase(secondString));

//        Получение размера строки
        System.out.println("Сколько букв в имени: "+Name.length()+" букв.");

//        Получение подстроки
        java.lang.String greeting="Привет Друзья!";
        java.lang.String subString=greeting.substring(greeting.indexOf("Д"), greeting.indexOf("!"));
        System.out.println(subString);

//        Проверка наличия подстроки
        java.lang.String greetingBig = greeting.toUpperCase();
        java.lang.String greetingMini = greeting.toLowerCase();
        System.out.println("Поменялся ли регистр в строке \"Привет Друзья\" на строчные? "+greetingBig.contains("ДРУЗЬЯ"));
        System.out.println("Поменялся ли регистр в строке \"Привет Друзья\" на заглавные? "+greetingMini.contains("друзья"));
        System.out.println("Есть ли в строке слово \"Друзья?\" "+greeting.contains("Друзья"));

//        Удаление пробелов (trim)
        var login = "   kliots_666    ";
        java.lang.String logintrue = login.trim();
        System.out.println("Login: "+logintrue);

//        replace
        var loginAfterReplace = login.trim().replace("_", ".");
        System.out.println("Login после редактирования (замена \"_\" на \".\"): "+loginAfterReplace);

//StringBuilder - для однопоточного программирования, StringBuffer - для многопоточного
        StringBuilder sb = new StringBuilder("Привет, ");
//        "append" - присандалить (добавить)
        sb.append("Сергей");
        sb.append(" Григорьевич");
        System.out.println(sb);









    }




}
