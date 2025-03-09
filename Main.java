import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Problem 1c.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversed = Utility.reverseSentence(sentence);
        System.out.println("Reversed sentence: " + reversed);
    }
}
