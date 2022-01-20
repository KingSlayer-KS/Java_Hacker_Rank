import java.io.*;
import java.util.*;

public class string_introduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String c= "No";
        if (A.compareTo(B) >B.compareTo(A)){ c= "Yes";}
        System.out.println(A.length()+B.length()+"\n"+c+"\n"+A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

        /* Enter your code here. Print output to STDOUT. */

    }
}
