package Week_9;

import java.util.Scanner;

public class Task_A {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int L = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();


        double res = (double) (L-d)/(v1+v2);
        System.out.printf("%.20f\n", res);
    }
}
