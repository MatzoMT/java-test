import java.util.Scanner;

public class Testattu {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello World");
		System.out.println("Nimi?");
		String name = keyboard.nextLine();

		System.out.println("Hyvaa huomenta, " + name);
		keyboard.close();


	}
}
