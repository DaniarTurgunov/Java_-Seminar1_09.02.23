package Seminar_1.CW1;
//Дан массив целых чисел. Верно ли, что массив является симметричным.

public class zadanie5 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(tester(myArray));
    }

    public static String tester(int[] array) {
        boolean myBool = true;
        for (int i = 0; i < array.length/ 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return ("Не симетричны");
            }
        }
        return ("Симетричны");
    }
}
