package Seminar_1.CW1;
//Дана строка. Поменять местами ее половины.
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        StringBuilder myNewStr = new StringBuilder();
        myNewStr.append(n.substring(n.length() / 2, n.length()))
                .append(n.substring(0, n.length() / 2));
        System.out.println(myNewStr.toString());
    }
}
