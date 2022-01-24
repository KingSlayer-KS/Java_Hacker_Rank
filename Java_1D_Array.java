import java.util.*;


public class Java_1D_Array {
    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);
        int n = f.nextInt();

        int[] a = new int[n];

        for(int i = 0 ; i < n; i++){
            int val = f.nextInt();
            a[i] = val;
        }
        f.close();


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
