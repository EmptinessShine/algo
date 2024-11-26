package Week_8;

import java.util.Scanner;

public class TASK_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int[] arr = new int[z];
        for (int i = 0; i < z; i++) {
            arr[i] = sc.nextInt();
        }

        int score = 0;
        int shag = 0;

        int[] lest = new int[z];

        for (int i = 0; i < z; i++) {
            if (arr[i] == 1) {
                if (score > 0) {
                    lest[score - 1] = shag;
                }
                score++;
                shag = 1;
            } else {
                shag++;
            }
        }

        lest[score - 1] = shag;

        System.out.println(score);
        for (int i = 0; i < score; i++) {
            System.out.print(lest[i] + " ");
        }
    }
}
