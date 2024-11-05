import java.util.*;

public class Task_E {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        sc.nextLine();
//        while (a-- > 0) {
//            StringBuilder st = new StringBuilder();
//            String z = sc.nextLine();
//
//
//
//        }
        String a = "oelhl";
        String b= "abcdcba";
        String c = "ac";
        System.out.println(res(a));
        System.out.println(res(b));
        System.out.println(res(c));

    }

    public static String res(String a) {
        Map<Character, Integer> map = new HashMap<>();

        for (char b : a.toCharArray()) {
            map.put(b, map.getOrDefault(b, 0) + 1);
        }

        List<Character> dva = new ArrayList<>();
        List<Character> odin = new ArrayList<>();

        for (char c : map.keySet()){
            if (map.get(c) == 2){
                dva.add(c);
            }
            for (int i = 0; i < map.get(c); i++) {
                odin.add(c);
            }
        }

        char[] res = new char[a.length()];
        Arrays.fill(res,'\0');
        int id = 0;

        for (char c : dva){
        res[id] = c;
        res[id + 2] = c;
        id++;
        }

        for (char c : odin){
            while (id<res.length){
                id++;
            }
            res[id] = c;
        }



        return new String(res);
    }


}
