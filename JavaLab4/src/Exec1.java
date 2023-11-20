import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = scanner.nextLine();
        System.out.println(midLetters(string));
    }

    public static String midLetters(String string) {
        if (string.length() % 2 == 0) {
            return string.substring(string.length()/2-1,string.length()/2+1);
        } else {
            return String.valueOf(string.charAt(string.length()/2));
        }
    }
}