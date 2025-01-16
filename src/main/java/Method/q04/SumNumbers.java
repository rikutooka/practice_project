package Method.q04;

public class SumNumbers {
	public static void main(String[] args) {
		int num = 3;
		int num2 = 2;
		int sum = calculateSum(num, num2);
		System.out.println("第一引数:" + num);
		System.out.println("第二引数:" + num2);
		System.out.println("加算結果:" + sum);

	}

	public static int calculateSum(int num, int num2) {
		int sum = num + num2;
		return sum;

	}
}