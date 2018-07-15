
public class GoodsVan {
	public static void main(String[] args) {
		int vanWidth = 2;
		int vanLength = 4;
		double boxWidth = 1.5;
		double boxLength = 1.5;
		// 箱子数的数据类型为整型，且载货区宽度与箱子宽度的商、载货区长度与箱子长度的商的数据类型都应该被转换为int型
		double boxNumber = (int)(vanWidth/boxWidth) * (int)(vanLength/boxLength);
		System.out.println("载货区一层可以放" + (int)boxNumber + "箱子！");
	}
}
