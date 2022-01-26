import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {
    public static void main(String[] args) {
        Scanner F =new Scanner(System.in);
        int u = F.nextInt();
        List<Integer> C = new ArrayList<>(u);
        for(int i=0; i< u; i++ ){
            C.add(F.nextInt());}
        int M = F.nextInt();
        for(int i=0; i< M; i++){
            String D = F.next();
            if(D.compareTo("Insert")==0)
                {C.add(F.nextInt(),F.nextInt());}
            else
                {C.remove(F.nextInt());}
        }
        for (Integer i : C)
            System.out.print(i+" ");
    }
}
