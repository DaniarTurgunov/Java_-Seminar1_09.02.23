package Seminar_1.CW1;

import  java.util.Scanner;
public class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++){
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                count++;
            }
            num1 = num2;
        }
        System.out.println(count);
    }
}