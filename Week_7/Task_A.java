package Week_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_A {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-->0){
            int b = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>(b);
            for (int i = 0; i < b; i++) {
                map.put(sc.nextInt(),i+1);
            }
            int turns=0;

            for (Map.Entry<Integer,Integer> entry: map.entrySet() ){
                if (entry.getKey().equals(entry.getValue())){
                    turns++;
                }
            }
            System.out.println(Math.ceilDiv(turns,2));


        }



    }
}
