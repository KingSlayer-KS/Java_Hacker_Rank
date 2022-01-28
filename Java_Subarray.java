import java.util.Scanner;

public class Java_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arry = new int[n];
        int jjj = 0;
        for (int i = 0; i <= n - 1; i++) {
            int kk = sc.nextInt();
            arry[i] = kk;

        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arry[k];

                }
                if (sum < 0) {
                    jjj++;
                }
            }
        }

        System.out.println(jjj);
        sc.close();
    }

}
