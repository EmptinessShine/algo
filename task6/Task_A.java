import java.util.Scanner;
public class Task_A {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //massiv
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            char[][] tort = new char[a][b];
//zapolnenie
            for (int i = 0; i < a; i++) {
                tort[i] = sc.nextLine().toCharArray();
            }
//result
            int res = obshee(a, tort, b);
            System.out.println(res);
        }

        private static int obshee(int r, char[][] tort, int c) {
            int kletki = 0;
            boolean[] stroki = new boolean[r];

            for (int i = 0; i < r; i++) {
                if (rowcheck(tort, i)) {
                    kletki += c;
                    stroki[i] = true;
                }
            }

            for (int j = 0; j < c; j++) {
                if (colcheck(tort, j)) {
                    for (int i = 0; i < r; i++) {
                        if (!stroki[i] && tort[i][j] == '.') {
                            kletki++;
                        }
                    }
                }
            }

            return kletki;
        }

        public static boolean rowcheck(char[][] ar, int row) {
            for (int j = 0; j < ar[row].length; j++) {
                if (ar[row][j] == 'S') {
                    return false;
                }
            }
            return true;
        }

        public static boolean colcheck(char[][] ar, int col) {
            for (int i = 0; i < ar.length; i++) {
                if (ar[i][col] == 'S') {
                    return false;
                }
            }
            return true;
        }
    }
