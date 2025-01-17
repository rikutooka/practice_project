package practice.practice04;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("ポチ", 2, "白");
		Sparrw sparrw = new Sparrw("チュン", 1, true);
		dog.showInfo();
		dog.cry();
		System.out.println("--------------------");
		sparrw.showInfo();
		sparrw.cry();

	}
}
