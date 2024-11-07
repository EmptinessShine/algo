import java.util.*;

public class Task_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-- > 0) {
            int NumberOfSpellCast = 0;
            List<Integer> ListOfHealth = new ArrayList<>();
            int b = sc.nextInt();
            for (int i = 0; i < b; i++) {
                int f = sc.nextInt();
                if (f >= 2) NumberOfSpellCast++;
                else ListOfHealth.add(f);
            }
            int NumberOfOneHp = Collections.frequency(ListOfHealth, 1);

            if (NumberOfOneHp % 2 == 0) {
                NumberOfSpellCast += NumberOfOneHp / 2;
            } else {
                NumberOfSpellCast += (NumberOfOneHp + 1) / 2;
            }
            System.out.println(NumberOfSpellCast);


        }

    }
}
