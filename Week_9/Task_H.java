package Week_9;

import java.util.Scanner;

public class Task_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int[] a = {2, 3, 5, 7};

            while (z-- > 0) {
                int n = sc.nextInt();
                for (int m : a) {
                    if (!checkDiv(n + m)) {
                        System.out.println(m);
                        break;
                    }
                }
        }
    }

    private static boolean checkDiv(int n) {
        switch (n) {
            case 0:
            case 1:
                return false;
            case 2:
            case 3:
                return true;
            default:
                if (n % 2 == 0 || n % 3 == 0) return false;
                for (int i = 5; i * i <= n; i += 6) {
                    if (n % i == 0 || n % (i + 2) == 0) return false;
                }
                return true;
        }
    }
}