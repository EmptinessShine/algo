package Week_9;

import java.util.Scanner;

public class TASK_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int result = -1;

        for (int i = first; i <= second; i++) {
            if (check(i)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

    private static boolean check(int n) {
        boolean[] check = new boolean[10];
        while (n > 0) {
            int t = n % 10;
            if (check[t]) {
                return false;
            }
            check[t] = true;
            n /= 10;
        }
        return true;
    }
}