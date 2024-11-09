package Week_7;

import java.util.Scanner;

public class Task_B {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a  = sc.nextLine();

        char[] symbols = a.toCharArray();


        int QbreforeA =0;
        int QafterA =0;
        int QaQ =0;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 'A'){
                for (int j = 0; j < symbols.length; j++) {
                    if (symbols[j] == 'Q' && j<i){
                        QbreforeA++;
                    }
                    else  if (symbols[j] == 'Q' && j>i){
                        QafterA++;
                    }
                }
                QaQ += QbreforeA * QafterA;
                QafterA =0;
                QbreforeA =0;
            }

        }
        System.out.println(QaQ);





    }
}
