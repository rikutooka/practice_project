package practice.practice04;

public class Sparrw extends Animal {
	//フィールド

	private boolean canFly;

	//コンストラクタ
	public Sparrw(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		if(this.canFly) {
			System.out.println("飛べます");
		}else {
			System.out.println("飛べません");
		}
	}

	public void cry() {
		System.out.println("鳴き声:チュンチュン");
	}
}
