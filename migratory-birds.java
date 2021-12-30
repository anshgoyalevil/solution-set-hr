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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    
    List<Integer> freq = new ArrayList<>(); 
    List<Integer> e = new ArrayList<>(); 
    int mxindex = 0;
    
    for(int i = 0; i< arr.size()-2; i++){
        
        int count = 1;
        
        int j = 1+i;
                j++;
        
            if(arr.get(i) == arr.get(j)){
                
                count++;
                
            }
            
        freq.add(count);
        e.add(arr.get(i));
        
    }
    
    int mx = 0;
    
    for(int i = 0; i< freq.size(); i++){
        mx = Math.max(mx, freq.get(i));
        
    }
    
    
    
    return e.get(freq.indexOf(mx));
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
