import java.util.Scanner;

public class Reverse {

	public static void main(String[] arg) {
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int reversed = 0;
		int reminder;
		
		while(n != 0) {
			reminder = n%10;
			reversed = reversed * 10 + reminder;
			n = n/10;
		}
		System.out.println(reversed);
}
}