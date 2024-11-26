package Week_8;

import java.util.Scanner;

public class Task_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        while (summ(z) % 4 != 0) {
            z++;
        }

        System.out.println(z);
    }
    public static int summ(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
