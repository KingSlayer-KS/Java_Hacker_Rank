import java.util.*;

public class Java_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        ArrayList[] list = new ArrayList[no];
        for (int i = 0; i < no; i++) {
            list[i] = new ArrayList<>();
            int on = sc.nextInt();
            for (int j = 0; j < on; j++) {
                int ele = sc.nextInt();
                list[i].add(ele);
            }
        }
        int ono = sc.nextInt();
        for (int i = 0; i < ono; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (list[x - 1].size() >= y && list[x - 1].size() >= 0)
                System.out.println(list[x - 1].get(y - 1));
            else {
                System.out.println("ERROR!");
            }

        }
        sc.close();
    }
}