package hillel.plyska.utils.lesson3;

public class Task1 {
 /*   1. Написать метод считающий сколько в строке встречается определенный символ.
    Посчитать в ваших инициалах из первой задачи сколько пробелов и звездочек.
*/

    public static void main(String[] args) {

    }

    private static int countCharackterInString(String text, char  word){
        int sum = 0;
        char [] stringToChar =  text.toCharArray();
        for (int a=0; a <stringToChar.length; a ++){
            if (stringToChar[a]== word){
                sum++;
            }
        }
        return sum;
    }
}
