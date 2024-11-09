package Week_7;

import java.util.Scanner;

public class Task_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextLine();
        }
        boolean Canorcat = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 2 && arr[i].charAt(0) == 'O' && arr[i].charAt(1) == 'O') {
                Canorcat = true;
                arr[i] = arr[i].replaceFirst("OO", "++");
                break;
            }
            if (arr[i].length() >= 5 && arr[i].charAt(3) == 'O' && arr[i].charAt(4) == 'O') {
                Canorcat = true;
                arr[i] = arr[i].replaceFirst("OO", "++");
                break;
            }
        }
        if (Canorcat) {
            System.out.println("YES");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("NO");
        }
    }
}