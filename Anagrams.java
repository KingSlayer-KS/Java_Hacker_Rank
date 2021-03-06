import java.util.*;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()==b.length()){
            char[] aa=a.toLowerCase().toCharArray();
            char[] bb=b.toLowerCase().toCharArray();
            Arrays.sort(aa);
            Arrays.sort(bb);
            return (String.valueOf(aa)).equals((String.valueOf(bb)));

        }else {return false;}
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
