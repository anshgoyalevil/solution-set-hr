import java.util.Scanner;

public class Solution {

    /*
    Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
    */

    static boolean isAnagram(String a, String b) {

        // Complete the function

        StringBuilder stringa = new StringBuilder(a);
        StringBuilder stringb = new StringBuilder(b);

        boolean flag = false;

        int check = 0;

        if(a.length() == b.length()){

            for(int i = 0; i<a.length(); i++){
                for(int j = 0; j<a.length(); j++){
                    if(Character.toUpperCase(stringa.charAt(i)) == Character.toUpperCase(stringb.charAt(j))){
                        stringa.setCharAt(i, '1');
                        stringb.setCharAt(j, '2');
                        check++;
                        break;
                    }
                }
            }
            if(check == a.length()){
                flag = true;
            }
        }
        else{
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
