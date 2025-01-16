package Method.q09;

public class Even {
	public static void main(String[] agrs) {
		int num = 10;
		String result = checkEven(num);
		System.out.println(num + "は" + result + "です。");
	}

	public static String checkEven(int num) {
		if (num % 2 == 0) {
			return "偶数";
		} else {

			return "奇数";
		}
	}
}