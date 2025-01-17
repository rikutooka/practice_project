package practice.practice03;

public class Employee {
	//フィールドの生成
	private String name;
	private int age;

	//コンストラクタの生成
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//アクセサの作成
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//メソッド
	public void selfintroduction() {
		System.out.println("氏名:" + this.name);
		System.out.println("年齢:" + this.age);
	}
}
