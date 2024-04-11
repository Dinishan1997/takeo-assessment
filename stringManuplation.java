package temperature;
import java.util.Scanner;

public class stringManuplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();

        String lowercaseSentence = sentence.toLowerCase();
        System.out.println("Lowercase sentence: " + lowercaseSentence);

        int vowelCount = countVowels(lowercaseSentence);
        System.out.println("Number of vowels: " + vowelCount);

        scanner.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
	
}

