import java.util.Scanner;

public class Testattu {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello World");
		System.out.println("Nimi?");
		String name = keyboard.nextLine();

		System.out.println("Hyvaa huomenta, " + name);
		System.out.println("Do you like Finnish food? ");
		String prompt = keyboard.nextLine();
		if (prompt.equalsIgnoreCase("yes") == true) {
			System.out.println("Good for you!");
		} else {
			System.out.println("I haven't eaten it either, so I wouldn't know.");
		}

	}
}
