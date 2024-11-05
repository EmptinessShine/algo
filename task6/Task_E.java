import java.util.*;

public class Task_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        while (a-- > 0) {
            StringBuilder st = new StringBuilder();
            String s = sc.nextLine();
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                list.add(s.charAt(i));
            }
            Collections.sort(list);
            for (Character character : list) {
                st.append(character);
            }
            System.out.println(st);

        }
    }
}
