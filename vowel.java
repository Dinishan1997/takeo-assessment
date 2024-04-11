package temperature;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter two any numbers:");
        float num1 = scanner.nextFloat(),  num2 = scanner.nextFloat();

        // Output
        System.out.printf("Average: %.2f%n", (num1 + num2) / 2);

        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0);
        System.out.println(isVowel(ch) ? "Vowel" : "Consonant");

        scanner.close();
    }

    // Method to check if character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
	}

}



