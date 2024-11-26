package Week_9;

import java.util.Scanner;

public class Task_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lemon = sc.nextInt();
        int apple = sc.nextInt();
        int grusha = sc.nextInt();


        int HowMuchFruitINeedToUse = Math.min(lemon, Math.min(apple / 2, grusha / 4));

        int total = HowMuchFruitINeedToUse * 7;

        System.out.println(total);
    }
}