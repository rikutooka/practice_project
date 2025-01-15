package Method.q05;

public class Triangle {
	public static void main(String[] args) {
		int width = 8;
		int height = 5;
		getTriangleArea(width, height);
	}

	public static void getTriangleArea(int width, int height) {
		System.out.println("底辺:" + width);
		System.out.println("高さ:" + height);
		System.out.println("三角形の面積:" + width * height / 2);
	}
}