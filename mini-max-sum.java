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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
    List<Long> Sums = new ArrayList<>();
    
    
    long Sum = 0;
    long maxSum = Long.MIN_VALUE;
    long minSum = Long.MAX_VALUE;
    
    int temp = 0;
    
    for(int i = 0; i<arr.size(); i++){
        temp = arr.get(i);
            arr.set(i, 0);
            Sum = 0;
        for(int j = 0; j<arr.size(); j++){
            
            Sum = Sum + arr.get(j);
            
            
            
        }
        Sums.add(Sum);
        arr.set(i, temp);
    }
    
    for(int i = 0; i< arr.size(); i++){
        minSum = Math.min(minSum, Sums.get(i));
    }
    for(int i = 0; i< arr.size(); i++){
        maxSum = Math.max(maxSum, Sums.get(i));
    }
    
    System.out.println(minSum + " " + maxSum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
