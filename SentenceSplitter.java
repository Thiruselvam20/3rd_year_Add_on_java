public class SentenceSplitter {
    public static void main(String[] args) {
        String sentence = "Accept sentence split into words using Java";

        // Split the sentence by space
        String[] words = sentence.split(" ");

        // Print each word
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}