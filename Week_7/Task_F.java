package Week_7;

import java.util.Scanner;

public class Task_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); sc.nextLine();
        String f = sc.nextLine();
        String s = sc.nextLine();


        int turns = 0;
        int[] arr = new int[a];
        int[] arr2 = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = f.charAt(i) - '0';
            arr2[i] = s.charAt(i) - '0';
        }


        for (int i = 0; i < a; i++) {


            if (Math.abs(arr[i] - arr2[i]) < 6) {
                turns += Math.abs(arr[i] - arr2[i]);
            } else {
                turns += 10 - Math.abs(arr[i] - arr2[i]);
            }
        }
        System.out.println(turns);
    }
}
