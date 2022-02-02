import java.util.*;

public class Java_Exception_Handling_Trycatch {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         */
        Scanner sc = new Scanner(System.in);

        try {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A / B);

        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
