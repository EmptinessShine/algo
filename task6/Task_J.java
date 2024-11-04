import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for (int m = 0; m < l; m++) {

            int res = 1;
            Map<String, Integer> map = new HashMap<>();
            map.put("chleb", sc.nextInt() - 1);
            map.put("cheese", sc.nextInt());
            map.put("vetch", sc.nextInt());

            for (int i = 0; i < map.get("cheese") + map.get("vetch"); i++) {
                if (map.get("chleb") >= 1) {
                    int temp = map.get("chleb");
                    temp -= 1;
                    map.put("chleb", temp);
                    res += 2;
                }
            }
            System.out.println(res);
        }
    }
}