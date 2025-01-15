package Method.q06;

public class Circle {
	public static void main(String[] args) {
		double radius = 5.0;
		getCircleArea(radius);
	}

	public static void getCircleArea(double radius) {
		System.out.println("半径:" + radius);
		System.out.println("円の面積:" + radius * radius * 3.14);
	}
}