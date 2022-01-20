import java.util.*;

public class Substring_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        List f=new ArrayList<String>();
        String smallest = "";
        String largest = "";
        for(int i=0; i<=s.length()-k;i++){

            f.add(s.substring(i,i+k));
        }
        Collections.sort(f);
        smallest= String.valueOf(f.get(0));
        largest= String.valueOf(f.get(f.size()-1));
        return smallest + "\n" + largest;
        //return String.valueOf(f);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
