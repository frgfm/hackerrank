import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        HashMap<String,Integer> alphacount = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ++ch){
            alphacount.put(String.valueOf(ch), 0);
        }
        for (int i = 0; i < first.length(); i++){
            alphacount.put(Character.toString(first.charAt(i)), alphacount.get(Character.toString(first.charAt(i)))+1);
        } // array of numbers of occurences of each letters
        for (int i = 0; i < second.length(); i++){
            alphacount.put(Character.toString(second.charAt(i)), alphacount.get(Character.toString(second.charAt(i)))-1);
        }
        int diff = 0;
        for (String key : alphacount.keySet()){
            diff = diff + Math.abs(alphacount.get(key));
        }
        return diff;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
