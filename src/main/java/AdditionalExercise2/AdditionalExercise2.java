package AdditionalExercise2;

public class AdditionalExercise2 {
	public static void main(String[] args) {
		int arrayNum[] = { 10, 22, 4, 50, 25, 37, 80, 78, 67 };

		int maxNum = ArrayMaxCheck_(arrayNum);
		System.out.println("配列内の最大値は" + maxNum + "です。");
	}

	public static int ArrayMaxCheck_(int[] arrayNum) {
		int maxNum = arrayNum[0];
		for (int i = 1; i < arrayNum.length; i++) {
			if (arrayNum[i] > maxNum) {
				maxNum = arrayNum[i];
			}
		}
		return maxNum;
	}
}
//戻り値 配列の中から最大値を探し、整数型で呼び出し元に返す
//引数 整数型の配列
// 
//配列の中身は
//10.22.4,50,25,37,80,78,67
//にしてください。
// 
//出力イメージ
//配列内の最大値は80です。