package Week_7;

import java.util.Scanner;

public class Task_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while (z-- > 0) {
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println(2);
                continue;
            }
            if (a % 3 == 0) {
                System.out.println(a / 3);
            } else System.out.println(a / 3 + 1);

        }

    }
}
