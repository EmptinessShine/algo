package Week_8;

import java.util.Scanner;
public class Task_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        int n = sc.nextInt();

        int kubk = a1 + a2 + a3;
        int medal = b1 + b2 + b3;

        int PolkKubk = (kubk + 4) / 5;
        int PolkMed = (medal + 9) / 10;

        if (PolkKubk + PolkMed <= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
