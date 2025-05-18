package string;

public class ReverseWordsExample {

    public static void main(String[] args) {
        String text = "Hello world of Java";

        String reversedWords = reverseWords(text);
        System.out.println("Reversed words: " + reversedWords);
    }

    public static String reverseWords(String text) {
        // Split the string into words based on spaces
        String[] words = text.split("\\s+");
        
        // StringBuilder to construct the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }
        
        return reversed.toString();
    }
}


