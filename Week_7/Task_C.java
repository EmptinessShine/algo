package Week_7;

import java.util.Scanner;

public class Task_C {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] numb = new int[a];
        for (int i = 0; i < a; i++) {
            numb[i] = sc.nextInt();
        }

        for (int num : numb){
            System.out.println(result(num));
        }


    }
    public static int result(int numb) {;
        int temp;
        if (numb<10){
            return 7;
        }
        if (numb % 7 == 0) {
            return numb;
        } else{
            temp = numb - (numb%10);
           while (temp%7!=0){
               temp++;
           }
        }
        return temp;
    }
}
