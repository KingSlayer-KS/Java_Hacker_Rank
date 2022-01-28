import java.util.*;
import java.util.List;

public class Substring_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        List<String> f = new ArrayList<String>();
        String smallest = "";
        String largest = "";
        for (int i = 0; i <= s.length() - k; i++) {

            f.add(s.substring(i, i + k));
        }
        Collections.sort(f);
        smallest = String.valueOf(f.get(0));
        largest = String.valueOf(f.get(f.size() - 1));
        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
