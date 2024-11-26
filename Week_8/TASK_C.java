package Week_8;

import java.util.Scanner;

public class TASK_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-- > 0) {
            int l = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();

            if (b.startsWith("2020") || b.endsWith("2020") || (b.startsWith("2") && b.endsWith("020")) || (b.startsWith("20") && b.endsWith("20")) || (b.startsWith("202") && b.endsWith("0")))
                System.out.println("YES");
            else
                System.out.println("NO");


        }

    }

}
