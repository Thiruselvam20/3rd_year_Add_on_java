import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Character count (excluding spaces if needed)
        int charCount = input.length();

        // Word count
        String[] words = input.trim().split("\\s+");
        int wordCount = words.length;

        // Reverse string
        String reversed = new StringBuilder(input).reverse().toString();

        // Longest word
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output
        System.out.println("Word Count: " + wordCount);
        System.out.println("Character Count: " + charCount);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Longest Word: " + longestWord);
    }
}