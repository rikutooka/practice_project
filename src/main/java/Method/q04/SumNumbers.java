package Method.q04;

public class SumNumbers {
	public static void main(String[] args) {
		int num = 3;
		int num2 = 2;
		calculateSum(num, num2);
	}

	public static void calculateSum(int num, int num2) {
		int sum = num + num2;
		System.out.println("第一引数:" + num);
		System.out.println("第二引数:" + num2);
		System.out.println("加算結果:" + sum);

	}
}