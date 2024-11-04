import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-- > 0) {
            Map<Integer, Integer> map = new HashMap<>();
            int b = sc.nextInt();
            int[] arr = new int[b];
            for (int i = 0; i < b; i++) {
                arr[i] = sc.nextInt();
            }
            int s = -1;
            int e = -1;
            int temp = 0;

            for (int i = 0; i < b; i++) {
                if (arr[i] == 1) {
                    if (s == -1) s = i;
                    e = i;
                }
            }

            for (int i = s; i <= e; i++) {
                if (arr[i] == 0) {
                    temp++;
                }
            }
//            for (int z : arr){
//                System.out.print(z + " ");
//            }
            System.out.println(temp);
        }
    }
}

