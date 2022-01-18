import java.io.*;

public class java_loops_1 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();

            for (int i = 1; i < 11; i++) {
                int f= N*i;
                System.out.printf("%s x %s = %s%n",N,i,f);
            }

        }
}
