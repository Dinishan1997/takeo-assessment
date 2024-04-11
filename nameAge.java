package temperature;
import java.util.Scanner;

public class nameAge {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println(" Give the name:");
        String name = scanner.nextLine();

       
        System.out.println("Enter the age:");
        int age = scanner.nextInt();

        
        System.out.println("Hi, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
	
}
