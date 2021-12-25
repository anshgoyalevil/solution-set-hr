
import java.lang.reflect.Method;

class Printer

    /*
    Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
     */

{
    //Write your code here

    public void printArray(Integer [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void printArray(String[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
