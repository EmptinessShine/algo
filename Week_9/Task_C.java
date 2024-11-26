package Week_9;

import java.util.Scanner;

public class Task_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-->0){
            int a = sc.nextInt();
            sc.nextInt();
            int b = sc.nextInt();
            sc.nextInt();

            if (a == b) {
                b++;
            }

            System.out.println(a + " " + b);
        }
    }
}