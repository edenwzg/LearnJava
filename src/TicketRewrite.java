import java.util.Arrays;
import java.util.Scanner;

public class TicketRewrite {
    public static void main(String args[]) {
        // 初始化客车每个座位的票数
        int[][] seat = new int[9][4];
        for (int i = 0; i < 9; i++){
            Arrays.fill(seat[i],1);
        }

        // 开始售票
        while (true) {
            // 打印出票情况
            for (int i = 0; i < 9; i++){
                for (int j = 0; j < 4; j++){
                    System.out.print(seat[i][j] + "\t");
                }
                System.out.println();
            }

            // 创建扫描器，提示用户输入座位的行号和列号
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入要预定的坐位行号：");
            int row = sc.nextInt();
            System.out.print("请输入要预定的坐位列号：");
            int column = sc.nextInt();
            seat[row - 1][column - 1] = 0;
        }
    }
}
