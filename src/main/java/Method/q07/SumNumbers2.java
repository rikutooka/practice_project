package Method.q07;

public class SumNumbers2 {
	public static void main(String[] args) {
		int num = 5;
		double num2 = 3.3;
		calculateSum(num, num2);
	}

	public static void calculateSum(int num, double num2) {
		System.out.println("第一引数（整数）:" + num);
		System.out.println("第二引数（実数）:" + num2);
		System.out.println("加算結果:" + (int) (num + num2));

	}
}