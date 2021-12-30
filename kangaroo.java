import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */
     
     public static boolean isInteger(double N)
{
 
    // Convert float value
    // of N to integer
    int X = (int)N;
    double temp2 = N - X;
 
    // If N is not equivalent
    // to any integer
    if (temp2 > 0)
    {
        return false;
    }
    return true;
}

    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    
    double check = (double)(x1-x2)/(v2-v1);
    String ret = "";
    
    if(check >= 0){
        if(isInteger(check) == true){
        ret = "YES";
    }
    else{
        ret = "NO";
    }
    }
    else{
        ret = "NO";
    }
    
    return ret;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
