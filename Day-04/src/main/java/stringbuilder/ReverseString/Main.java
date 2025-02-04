package stringbuilder.ReverseString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();


        String reversed = Reverse.reverseString(input);


        System.out.println("Reversed String: " + reversed);


        scanner.close();
    }

}
