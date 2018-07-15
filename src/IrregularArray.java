public class IrregularArray {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[0] = new int[] { 52, 64, 85, 12, 3, 64};
        a[1] = new int[] {41, 99, 2};
        a[2] = new int[] {285, 61, 278, 2};
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]中有" + a[i].length + "个元素，分别是： ");
            for (int tmp : a[i]) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }
}
