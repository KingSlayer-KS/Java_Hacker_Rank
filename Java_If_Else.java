import java.util.*;

public class Java_If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        if (u % 2 != 0) {
            System.out.println("Weird");
        } else if (u % 2 == 0) {
            if (u >= 2 && u <= 5) {
                System.out.println("Not Weird");
            } else if (u >= 6 && u <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }

        }
        sc.close();
    }
}
