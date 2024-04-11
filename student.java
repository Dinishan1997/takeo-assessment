
package temperature;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user for Math, English, and Science
        System.out.println("Give score for Math (0-100):");
        int mathScore = scanner.nextInt();
        scoreValidation(mathScore);
        
        System.out.println("Give score for English (0-100):");
        int englishScore = scanner.nextInt();
        scoreValidation(englishScore);
        
        System.out.println("Give score for Science (0-100):");
        int scienceScore = scanner.nextInt();
        scoreValidation(scienceScore);

        double average = (mathScore + englishScore + scienceScore) / 3.0;

        char OverallGrade;
        if (average >= 90 && average <= 100) {
        	OverallGrade = 'A';
        } else if (average >= 80 && average <= 89) {
        	OverallGrade = 'B';
        } else if (average >= 66 && average <= 79) {
        	OverallGrade = 'C';
        } else if (average >= 58 && average <= 65) {
        	OverallGrade = 'D';
        } else {
        	OverallGrade = 'F';
        }

        System.out.println("Your average grade: " + average);
        System.out.println("Your letter grade: " + OverallGrade);
        
        scanner.close();
    }

    
    public static void scoreValidation(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a score from 0 and 100.");
            System.exit(1); 
        }
    }
}

