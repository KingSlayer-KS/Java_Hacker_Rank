import java.math.BigInteger;
import java.util.Scanner;


public class Java_BigInteger {
    public static void main(String[] args) {
        Scanner f= new Scanner(System.in);
        BigInteger u=f.nextBigInteger();
        BigInteger c=f.nextBigInteger();
        f.close();
        System.out.println(u.add(c)+"\n"+u.multiply(c));
    }
}
