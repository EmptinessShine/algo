package Week_9;

import java.util.Scanner;

public class Task_J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int symb = sc.nextInt();
        int speedFirst = sc.nextInt();
        int speedSec = sc.nextInt();
        int pingF = sc.nextInt();
        int pingS = sc.nextInt();

        int timeF = 2 * pingF + symb * speedFirst;
        int timeS = 2 * pingS + symb * speedSec;

        if (timeF < timeS) {
            System.out.println("First");
        } else if (timeF > timeS) {
            System.out.println("Second");
        } else {
            System.out.println("Friendship");
        }
    }
}