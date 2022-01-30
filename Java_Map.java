import java.util.*;

class Java_Map {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();

            try {
                int number = map.get(s);
                System.out.println(s + "=" + number);
            } catch (Exception e) {
                System.out.println("Not found");
            }
            /*--------------OR------------
            * if (map.get(s) != null) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            } */

        }
        in.close();
    }
}
