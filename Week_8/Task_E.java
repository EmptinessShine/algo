package Week_8;

import java.util.Scanner;

public class Task_E {
    public static void main(String[] arguments) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z-- > 0) {
            long n = sc.nextLong();
            System.out.println(-1 * (n - 1) + " " + n);
        }
    }
}