import java.lang.reflect.Method;

class Printer<my_type> {
    // Write your code here
    void printArray(my_type[] inputArray) {
        for (my_type i : inputArray) {
            System.out.println(i);
        }

    }

}

public class Java_Generics {

    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1)
            System.out.println("Method overloading is not allowed!");

    }
}
