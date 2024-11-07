import java.util.Arrays;
import java.util.Scanner;

public class Task_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-- > 0) {
            int b = sc.nextInt();
            int[] arr = new int[b];
            for (int i = 0; i < b; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int spellcast = 0;

            for (int i = 0; i < b; i++) {
                if (arr[i] >= 3) {
                    spellcast++;
                    arr[i] = 0;
                }
            }
                    for (int i = 0; i < b; i++) {

                        if (arr[i] == 2 && i + 1 < b && arr[i + 1] < 3) {
                            boolean found = false;
                            for (int j = i + 1; j < b; j++) {
                                if (arr[j] >= 3){
                                    spellcast++;
                                    arr[i] = 0;
                                    found = true;
                                    break;
                                }
                                if (arr[j] == 2 || arr[j] == 1) {
                                    spellcast += 2;
                                    arr[j] = 0;
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                spellcast++;
                            }
                        } else if (arr[i] == 1 && i + 1 < b && arr[i + 1] == 1) {
                            spellcast++;
                            arr[i + 1] = 0;
                        } else if (arr[i] == 1 && i + 1 < b && arr[i + 1] == 2) {
                            spellcast++;
                            arr[i + 1] = 1;

                        } else if (arr[i] == 1 && i + 1 >= b) {
                            spellcast++;

                        }
                    }


            for (int i = 0; i < b; i++) {
                if (arr[i] >= 3) {
                    spellcast++;
                    arr[i] = 0;
                }
            }

            for (int i = 0; i < b; i++) {
                if (arr[i] == 2) {
                    boolean found = false;
                    for (int j = i + 1; j < b; j++) {
                        if (arr[j] == 2 || arr[j] == 1) {
                            spellcast += 2;
                            arr[j] = 0;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        spellcast++;
                    }
                } else if (arr[i] == 1 && i + 1 < b && arr[i + 1] == 1) {
                    spellcast++;
                    arr[i + 1] = 0;
                }
            }
            System.out.println(spellcast);

        }

    }
}
