public class TemperatureConverter {
    /**
     * 摄氏度转换为整数华氏度
     */
    public static void main(String[] args) {
        // main
        double celsius = 37;
        double fahrenheit;

        fahrenheit = 32 + celsius * 1.8;
        System.out.printf("%.1fC° ≈ %dF°", celsius, (int)fahrenheit);
   }
}
