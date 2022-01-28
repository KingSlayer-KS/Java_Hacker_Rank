import java.util.*;

public class End_of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer u = 0;
        while (sc.hasNext()) {
            u += 1;
            String c = sc.nextLine();
            System.out.println(u + " " + c);
        }
        sc.close();
    }
}
