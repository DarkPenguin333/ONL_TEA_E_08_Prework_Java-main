package pl.coderslab.ckontrolaprzeplywu;

public class Main05 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;

		for (int i = 1; i < 11; i++) {
			resultFor += i;
		}

		int j = 1;
		while (j < 11) {
			resultWhile += j;
			j++;
		}

		System.out.println(resultFor);
		System.out.println(resultWhile);
	}


		}
