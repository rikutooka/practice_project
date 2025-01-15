package basic.q7;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				System.out.printf(" %2d", (i * j));
			}

		}
	}

}