package exp5.t1;

public class People {
	protected double weight, height;

	/**
	 * 这是一个问好的方法
	 */
	public void speakHello() {
		System.out.println("yayayaya");
	}

	/**
	 * 输出平均身高
	 */
	public void averageHeight() {
		height = 173;
		System.out.println("average height:" + height);
	}

	/**
	 * 输出平均体重
	 */
	public void averageWeight() {
		weight = 70;
		System.out.println("average weight:" + weight);
	}
}