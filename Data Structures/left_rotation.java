import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // nb of integers
        int k = in.nextInt(); // nb of rotations
        //k = k % n;
        int a[] = new int[n];
        int temp;
        for(int a_i=0; a_i < n; a_i++){
            temp = ((n-k)+a_i) % n;
            a[temp] = in.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
