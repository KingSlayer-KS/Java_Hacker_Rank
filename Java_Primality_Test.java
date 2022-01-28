import java.io.*;
import java.math.BigInteger;

public class Java_Primality_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String f = bufferedReader.readLine();
        BigInteger u = new BigInteger(f);
        bufferedReader.close();
        String c = "";
        if (u.isProbablePrime(10)) {
            c = "prime";
        } else {
            c = "not prime";
        }
        System.out.println(c);
    }
}
