package Method.q09;

public class Even {
	public static void main(String[] agrs) {
		int num = 10;
		checkEven(num);
	}

	public static void checkEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}
}