import java.util.Scanner;

public class Task_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int v = 0; v < k; v++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int[][] arr = new int[2][a];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            arr(arr);

            for (int i = 0; i < a; i++) {
                if (b >= arr[0][i]) {
                    b += arr[1][i];
                }
            }
            System.out.println(b);

        }
    }

    public static int[][] arr(int[][] ar) {

        for (int i = 0; i < ar[0].length - 1; i++) {
            for (int j = 0; j < ar[0].length - 1 - i; j++) {
                if (ar[0][j] > ar[0][j + 1]) {
                    int temp = ar[0][j];
                    ar[0][j] = ar[0][j + 1];
                    ar[0][j + 1] = temp;

                    temp = ar[1][j];
                    ar[1][j] = ar[1][j + 1];
                    ar[1][j + 1] = temp;
                }
            }
        }
        return ar;
    }
}
