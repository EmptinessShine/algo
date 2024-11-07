import java.util.Scanner;

public class Task_D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        while (a-- > 0) {
            int b = sc.nextInt();
            int[] ar = new int[b];
            for (int i = 0; i < b; i++) {
                ar[i] = sc.nextInt();
            }
            int z = 0;
            for (int i = ar.length-1; 0 < i; i--) {
                z ^= ar[i];
            }
            if (z == ar[0]) {
                System.out.println(ar[0]);
            }

        }


    }
}
