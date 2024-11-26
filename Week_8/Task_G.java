package Week_8;


import java.util.Scanner;

public class Task_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int fp = 0;
        int noonewin = 0;
        int sp = 0;

        for (int x = 1; x <= 6; x++) {
            int dst1 = Math.abs(a - x);
            int dst2 = Math.abs(b - x);

            if (dst1 < dst2) {
                fp++;
            } else if (dst1 > dst2) {
                sp++;
            } else {
                noonewin++;
            }
        }

        System.out.println(fp + " " + noonewin + " " + sp);
    }
}
