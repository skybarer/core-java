package examples;

public class ReverseNumber {

	public static int reverseNumber(int num) {

		int temp = num;

		int rev = 0;

		while (temp > 0) {

			rev = rev * 10 + temp % 10;

			temp = temp / 10;
		}

		return rev;
	}

	public static void main(String[] args) {

		System.out.println(reverseNumber(123213));

	}

}
