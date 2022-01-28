
import java.util.*;

public class Java_Static_Initializer_Block {
    static int B;
    static int H;
    static boolean flag = true;
    static {
        Scanner f = new Scanner(System.in);
        B = f.nextInt();
        H = f.nextInt();
        f.close();
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.print(e);
            System.exit(0);

        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}
