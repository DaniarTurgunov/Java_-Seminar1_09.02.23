package Seminar_1.HW1;
// 151. Reverse Words in a String
public class zadanie1 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        String[] d_str = s.split(" ");
        String new_str = " ";
        for (int i = 0; i < d_str.length ; i++) {
            if (i == d_str.length - 1) {
                new_str = d_str[i] + new_str;
            } else {
                new_str = " " + d_str[i] + new_str;
            }
        }
        return new_str;
    }
}
