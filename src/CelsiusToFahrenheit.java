public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		int celsius = 37;
		System.out.println("要转换的摄氏度 = " + celsius);
		// 9/5的结果是int型，9.0/5的结果是double型
		double fahrenheit = 9.0/5 * celsius + 32;
		int intfahrenheit = (int)fahrenheit;
		System.out.println("37摄氏度 = " + fahrenheit + "华氏度(未转换成int型)");
		System.out.println("37摄氏度 = " + intfahrenheit + "华氏度(转换成int型)");
	}
}
