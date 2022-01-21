import java.util.*;

public class String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.length()==0){
            System.out.println(0);
        }else {
            String[] arry = s.split("[\s,.'!@_?]+");
            scan.close();
            System.out.println(arry.length);
            for (String a : arry)
                System.out.println(a);
        }
    }
}
