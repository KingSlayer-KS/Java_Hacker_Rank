import java.util.*;

public class End_of_file {
    public static void main(String[] args) {
        Scanner f=new Scanner(System.in);
        Integer u = 0;
        while (f.hasNext()){
            u+=1;
            String c=f.nextLine();
            System.out.println(u+" "+c);
        }
    }
}
