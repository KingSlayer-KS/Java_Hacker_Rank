import java.util.*;

public class Java_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        List<Integer> C = new ArrayList<>(u);
        for (int i = 0; i < u; i++) {
            C.add(sc.nextInt());
        }
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            String D = sc.next();
            if (D.compareTo("Insert") == 0) {
                C.add(sc.nextInt(), sc.nextInt());
            } else {
                C.remove(sc.nextInt());
            }
        }
        for (Integer i : C)
            System.out.print(i + " ");

        sc.close();
    }
}
