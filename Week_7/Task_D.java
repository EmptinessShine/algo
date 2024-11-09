package Week_7;

import java.util.Scanner;

public class Task_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int z = sc.nextInt();
        while (z-- > 0) {
            boolean sobakam = false;
            boolean koshkam = false;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > a) {
                int diff = x - a;
                if (c >= diff) {
                    c -= diff;
                    sobakam = true;
                }
            } else {
                sobakam = true;
            }

            if (y > b) {
                int diff = y - b;
                if (c >= diff) {
                    koshkam = true;
                }
            } else {
                koshkam = true;
            }

            if (koshkam && sobakam) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}