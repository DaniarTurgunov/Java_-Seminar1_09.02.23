package Seminar_1.HW2;
//Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
import  java.util.Scanner;
public class Zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] v = n.split(" ");
        int len = v.length;
        int sum = 0;
        int[] my_Array = new int[len];
        for (int i = 0; i < v.length; i++) {
            my_Array[i] = Integer.parseInt(v[i]);
        }
        for (int j = 0; j < my_Array.length; j++) {
            if (my_Array[j] < 0){
                sum = my_Array[j-1] + sum;
            }
        }
        System.out.println(sum);
    }
}
