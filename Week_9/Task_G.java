package Week_9;

import java.util.Scanner;

public class Task_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        while (z-- > 0) {
            int students = sc.nextInt();
            int maxSwitch = sc.nextInt();
            int pos1 = sc.nextInt();
            int pos2 = sc.nextInt();


            if (pos1 > pos2) {
                int temp = pos1;
                pos1 = pos2;
                pos2 = temp;
            }

            int dist = pos2 - pos1;
            int maxDist = Math.min(students - 1, dist + maxSwitch);

            System.out.println(maxDist);
        }
    }
}