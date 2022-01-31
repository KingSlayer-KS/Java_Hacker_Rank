import java.util.*;

public class Java_Hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = sc.next();
            pair_right[i] = sc.next();
        }
        Set<String> set_of_pairs = new HashSet<String>();

        for (int i = 0; i < t; i++) {
            String pair = String.join(" ", pair_left[i], pair_right[i]);
            set_of_pairs.add(pair);
            System.out.println(set_of_pairs.size());
        }

        sc.close();
    }

}
