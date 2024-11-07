import java.util.*;

public class Task_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-- > 0) {
            int NumberOfSpellCast = 0;
            List<Integer> ListOfHealth = new ArrayList<>();
            int b = sc.nextInt();
            while (b-- >0) {
                int f = sc.nextInt();
                if (f >= 2) NumberOfSpellCast++;
                else ListOfHealth.add(f);
            }

            if (ListOfHealth.size() % 2 == 0) {
                System.out.println(NumberOfSpellCast + ListOfHealth.size() / 2);
            } else {
                System.out.println(NumberOfSpellCast + ListOfHealth.size() / 2 + 1);
            }


        }

    }
}
