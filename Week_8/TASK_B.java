package Week_8;

import java.util.Scanner;

public class TASK_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;


        int z = sc.nextInt();
        int cnt = 1;
        for (int i = 0; i < z; i++) {
            switch (cnt) {
                case 1:
                    a += sc.nextInt();
                    cnt++;
                    break;
                case 2:
                    b += sc.nextInt();
                    cnt++;
                    break;
                case 3:
                    c += sc.nextInt();
                    cnt = 1;
                    break;
                default:
                    break;

            }
        }
        if (a > b && a > c) {
            System.out.println("chest");
        } else if (a < b && c < b) {
            System.out.println("biceps");
        } else System.out.println("back");
    }
}
