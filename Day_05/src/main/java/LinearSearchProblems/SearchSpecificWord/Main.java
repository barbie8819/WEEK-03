package LinearSearchProblems.SearchSpecificWord;

import LinearSearchProblems.FirstNegativeNumber.FirstNegativeInArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sentences:");
        int n = Integer.parseInt(scanner.nextLine());

        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = scanner.nextLine();
        }

        System.out.println("Enter the word to find:");
        String wordToFind = scanner.nextLine();

        String result = SpecificWordFinder.searchForWord(sentences, wordToFind);
        System.out.println(result);

        scanner.close();
    }
}
