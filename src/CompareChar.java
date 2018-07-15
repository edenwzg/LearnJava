
public class CompareChar {
	public static void main(String[] args) {
		char c = 'g';
		int i = 103;
		// 执行程序的正确顺序是先判断c == i，再拼接字符串
		System.out.println("’g’和103是否相等：" + (c == i));
	}
}
