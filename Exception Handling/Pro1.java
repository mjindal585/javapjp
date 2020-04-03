import java.util.Scanner;
public class Pro1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String str = sc.nextLine();
		try {
			int x = Integer.parseInt(str);
			System.out.println("The square value is: " + x * x);
			System.out.println("No Exceptions!!!");
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not an integer.");
		}
		sc.close();
	}
}
