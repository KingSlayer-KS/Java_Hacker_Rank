import java.math.BigInteger;
import java.util.Scanner;


public class Java_BigInteger {
    public static void main(String[] args) {
        Scanner ff= new Scanner(System.in);
        BigInteger u=ff.nextBigInteger();
        BigInteger c=ff.nextBigInteger();
        ff.close();
        System.out.println(u.add(c)+"\n"+u.multiply(c));
    }
}
