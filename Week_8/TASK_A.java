package Week_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TASK_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int obsh = 0;
        for (int i = 0; i < 5; i++) {
            int z = sc.nextInt();
            obsh += z;
            map.put(z, map.getOrDefault(z, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1 && entry.getValue() < 4) {
                int k = entry.getKey();
                int v = entry.getValue();
                max = Math.max(max, k * v);
            } else if (entry.getValue() > 3) {
                max = Math.max(max, entry.getKey() * 3);
            }
        }
        System.out.println(obsh - max);


    }
}
