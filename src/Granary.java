public class Granary {
	/**
	 * 圆柱体积公式 V=πr²h
	 * 高h=3m，直径d=10m，半径r=d/2
	 * 每立方米屯粮 750kg
	 */
	public static void main(String[] args) {

		final double PI = 3.14;
		double diameter = 10;
		double high = 3;
		double radius = diameter / 2;
		double unitStorage = 750;

		double sumVolume = PI * (radius * radius) * high;
		double sumStorage = sumVolume * unitStorage;

		System.out.printf("Sum volume is: %.2fm³\n", sumVolume);
		System.out.printf("Sum storage is: %.2fkg ", sumStorage);


	}
}
