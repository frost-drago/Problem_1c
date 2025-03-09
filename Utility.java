import java.util.Stack;

public class Utility {
    /**
     * Reverses a sentence. Problem 1c.
     * @param aSentence String of words separated with space.
     * @return The sentence reversed.
     */
    public static String reverseSentence(String aSentence) {
        Stack<String> stack = new Stack<String>();
        String[] words = aSentence.split(" ");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
