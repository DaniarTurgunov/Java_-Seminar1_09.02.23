package Seminar_1.CW1;

import  java.util.Scanner;
public class CW1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int sum = 0;
       int pr = 1;
       while (n!=0){
           pr*= n%10;
           sum += n%10;
           n/=10;
       }
       System.out.println(pr-sum);
    }
}