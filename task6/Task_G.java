import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int b = sc.nextInt();
            int[] ar = new int[b];
            for (int j = 0; j < b; j++) {
                int z = sc.nextInt();
                ar[j] = z;
                map.put(z, map.getOrDefault(z, 0) + 1);
            }

                        //Nahodim min chislo
            Integer min = null;
            for (Map.Entry<Integer, Integer> kar : map.entrySet()) {
                int kluc = kar.getKey();
                int znach = kar.getValue();

                if (znach == 1) {
                    if (min == null || kluc < min) {
                        min = kluc;
                    }
                }
            }
                    // ---------------
            if (min != null) {
                for (int j = 0; j < ar.length; j++) {
                    if (min == ar[j]){
                        System.out.println(j+1);
                    }
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}