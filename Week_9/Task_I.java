package Week_9;

import java.util.Scanner;

public class Task_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.nextInt();
        sc.nextInt();

        System.out.println(a>b ? "First" : "Second");
    }
}