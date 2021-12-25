import java.util.Scanner;
import java.util.regex.*;
import java.util.*;

public class Solution
{

    /*
    Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.
     */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){

            testCases--;

            String regex = in.nextLine();

            PatternSyntaxException exc = null;
            try {
                Pattern.compile(regex);
            } catch (PatternSyntaxException e) {
                exc = e;
            }
            if (exc != null) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }

        }
    }
}



