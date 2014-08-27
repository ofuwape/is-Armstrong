import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number here: ");
		String text = scan.next();
		System.out.println(amst(text));

	}

	private static boolean amst(String text) {
		// TODO Auto-generated method stub
		int sz = text.length();
		// int[] all = new int[sz];
		int count = 0;
		int sum = 0;
		while (count < sz) {
			int num = Integer.parseInt(Character.toString(text.charAt(count)));
			sum += (Math.pow(num, 3));
			count++;
		}
		// System.out.println(sum);
		return Integer.parseInt(text) == sum;
	}
}
