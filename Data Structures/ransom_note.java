import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        HashMap<String,Integer> wordcount = new HashMap<>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String word = in.next();
            if (wordcount.containsKey(word)){
                wordcount.put(word, wordcount.get(word)+1);
            } else{
                wordcount.put(word, 1);
            }
        }
        String word;
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            word = in.next();
            if (wordcount.containsKey(word) & wordcount.get(word) > 0){
                wordcount.put(word, wordcount.get(word)-1);
            } else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
