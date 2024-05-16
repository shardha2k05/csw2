
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q10{
    public static void main(String[] args) {
        String inputString = "Your large input string goes here..."; // Replace with your actual input string

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFreq = new HashMap<>();

        // Split the input string into words
        String[] words = inputString.split("\\s+"); // Split by whitespace

        // Iterate through each word
        for (String word : words) {
            // Remove punctuation and convert to lowercase
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Update word frequency in the HashMap
            if (!cleanedWord.isEmpty()) {
                wordFreq.put(cleanedWord, wordFreq.getOrDefault(cleanedWord, 0) + 1);
            }
        }

        // Find the most occurring words
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordFreq.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int numWordsToShow = 5; // Change this to display more or fewer words
        for (int i = 0; i < Math.min(numWordsToShow, sortedWords.size()); i++) {
            System.out.println(sortedWords.get(i).getKey() + ": " + sortedWords.get(i).getValue());
        }
    }
}