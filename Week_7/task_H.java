package Week_7;

import java.util.Scanner;

public class task_H {

public static int count2(int[] numbers) {
    {
        int times2 = 0;
        for (int a : numbers) {
            if (a == 2) {
                times2++;
            }
        }

        return times2;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            int s = count2(numbers);
            if (s % 2 == 1) {
                System.out.println(-1);
            } else {
                s /= 2;
                int getindex = 0;

                for (int i = 0; i < n; i++) {
                    if (numbers[i] == 2) {
                        s--;
                        if (s == 0) {
                            getindex = i;
                            break;
                        }
                    }

                }
                System.out.println(getindex + 1);
            }
        }


    }
}