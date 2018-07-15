
public class PlusChar {
	public static void main(String[] args) {
		char a = 'a';
		char b = 'b';
		char c = 'c';
		char d = 'd';
		char e = 'e';
		char f = 'f';
		char g = 'g';
		// char类型相加的结果会隐式转换为int类型，得到int类型的值后再拼接字符串
		System.out.println("’a’~’g’相加后的结果：" + (a + b + c + d + e + f + g));
	}
}
