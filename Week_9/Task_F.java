package Week_9;

import java.util.Scanner;

public class Task_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] years = new int[n - 1];
        for (int i = 0; i < years.length; i++) {
            years[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        int total = 0;

        for (int i = a - 1; i < b - 1; i++) {
            total += years[i];
        }
        System.out.println(total);
    }
}