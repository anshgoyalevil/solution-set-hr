import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        
        String sol = "";
        
        if(x< z && y<z){
            if(x>y){
                sol = "Cat A";
            }
            else if(x<y){
                sol = "Cat B";
            }
        }
        if(x<= z && y>=z){
            if( (z-x) < (y-z) ){
                sol = "Cat A";
            }
            else if((z-x) > (y-z)){
                sol = "Cat B";
            }
            else if((z-x) == (y-z)){
                sol = "Mouse C";
            }
        }
        if(x>= z && y<=z){
            if( (x - z) < (z-y) ){
                sol = "Cat A";
            }
            else if((x - z) > (z-y)){
                sol = "Cat B";
            }
            else if((x - z) == (z-y)){
                sol = "Mouse C";
            }
        }
        if(x == y){
            sol = "Mouse C";
        }
        if(x > z && y>z){
            if(x<y){
                sol = "Cat A";
            }
            else if(x>y){
                sol = "Cat B";
            }
        }
        
        return sol;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
