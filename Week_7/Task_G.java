package Week_7;

import java.util.Scanner;

public class Task_G {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); sc.nextLine();
        char[] symbols = sc.nextLine().toCharArray();

        int index =0;
        for (int i = 0; i <= a; i++) {
            index += i;
            if (index<a){
                sb.append(symbols[index]);
            }

        }
        System.out.println(sb);
        
        


    }


}
