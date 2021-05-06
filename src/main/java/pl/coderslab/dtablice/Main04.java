package pl.coderslab.dtablice;

public class Main04 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, 69};
		int sumOdd = 0;


		for (int i = 0; i < numbers.length; i++) {
		int r = numbers[i] % 2;
		if (r == 0) {
			System.out.println(numbers[i]);
		} else {
			sumOdd = sumOdd + numbers[i];

		}
	}System.out.print(sumOdd);

}
	}


