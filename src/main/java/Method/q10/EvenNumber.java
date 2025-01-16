package Method.q10;

import java.util.Arrays;

public class EvenNumber {
	public static void main(String[] args) {
		int arrayNum[] = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };

		int count = getEvenNumbers(arrayNum);
		System.out.println(Arrays.toString(arrayNum) + "には、偶数が" + count + "個あります。");

	}

	public static int getEvenNumbers(int[] arrayNum) {
		int count = 0;
		for (int i = 0; i < arrayNum.length; i++) {
			if (arrayNum[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}