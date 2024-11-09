package Week_7;

import java.util.Scanner;

public class Task_J {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  = sc.nextInt();

        int route1 = a + c + b;
        int route2 = b + c + a;
        int route3 = 2 * (a + b);
        int route4 = 2 * (a + c);
        int route5 = 2 * (b + c);
        int minDistance = Math.min(route1, Math.min(route2, Math.min(route3, Math.min(route4, route5))));

        System.out.println(minDistance);
    }
}
