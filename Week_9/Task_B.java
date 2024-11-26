package Week_9;

import java.util.Scanner;

public class Task_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cycles = sc.nextInt();
        while (cycles-- > 0) {
            int bulochki = sc.nextInt();
            int govyadina = sc.nextInt();
            int kurini = sc.nextInt();
            int priceGovyad = sc.nextInt();
            int priceKurini = sc.nextInt();
            int total = 0;

            boolean flag;

            flag = priceGovyad > priceKurini;
            bulochki /= 2;


            while (bulochki >= 1) {
                bulochki -= 1;
                if (flag && govyadina > 0 || !flag && kurini == 0 && govyadina > 0) {
                    total += priceGovyad;
                    govyadina--;
                } else if (!flag && kurini > 0 || flag && govyadina == 0 && kurini > 0) {
                    total += priceKurini;
                    kurini--;
                } else break;


            }
            System.out.println(total);
        }
    }
}
