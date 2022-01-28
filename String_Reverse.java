
import java.util.*;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // String f="No";
        char indexing;
        String ulta = "";
        sc.close();

        for (int i = 0; i < A.length(); i++) {
            indexing = A.charAt(i);
            ulta = indexing + ulta;
        }
        if (ulta.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
