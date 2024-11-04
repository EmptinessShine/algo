import java.util.Scanner;

public class Task_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int v = 0; v < k; v++) {

            int max = 0, max2 = 0;
            int z = sc.nextInt();
            int[][] a = new int[2][z];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            sort(a);

            for (int i = 0; i < z; i++) {
                max = Math.max(max, a[0][i]);
                max2 = Math.max(max2, a[1][i]);
            }
            System.out.println(max * max2);

        }
    }


    public static int[][] sort(int[][] ar) {
        int temp = 0;
        for (int i = 0; i < ar[0].length; i++) {
            if (ar[0][i] < ar[1][i]) {
                temp = ar[0][i];
                ar[0][i] = ar[1][i];
                ar[1][i] = temp;
            }
        }
        return ar;
    }
}
