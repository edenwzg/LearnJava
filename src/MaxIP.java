
public class MaxIP {
	public static void main(String[] args) {
		byte maxvalue = 127;
		short s = 128;
		// 执行程序的正确顺序是先运算maxvalue + s，再拼接字符串（任何基本数据类型与字符串拼接后结果的返回值都是字符串）
		System.out.println("IP中的每段数字的最大值 = " + (maxvalue + s));
	}
}
