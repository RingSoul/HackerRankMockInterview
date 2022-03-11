import java.util.Scanner;
import java.util.ArrayList;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, i + k);
            list.add(str);
        }

        String smallest = list.get(0);
        String largest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (largest.compareTo(str) < 0) {
                largest = str;
            }
            if (smallest.compareTo(str) > 0) {
                smallest = str;
            }
        }
        /* alternative solution
        for (String str : list)
        {
            String str = list.get(i);
            if (largest.compareTo(str) < 0) {
                largest = str;
            }
            if (smallest.compareTo(str) > 0) {
                smallest = str;
            }
        }
         */


        return smallest + "\n" + largest;
    }
}

