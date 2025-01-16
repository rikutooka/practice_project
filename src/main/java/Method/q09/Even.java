package Method.q09;

public class Even {
	public static void main(String[] agrs) {
		int num = 10;
		if (checkEven(num)) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}

	public static boolean checkEven(int num) {
		boolean result;
		result = (num % 2 == 0);
		return result;
	}
}