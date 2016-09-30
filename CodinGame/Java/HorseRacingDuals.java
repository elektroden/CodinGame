import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            list.add(pi);
        }
        Collections.sort(list);
        int bestAnswer = Integer.MAX_VALUE;
        
        for(int i = 0; i < list.size()-1; i++) {
            int difference = list.get(i+1) -  list.get(i);
            if(difference < bestAnswer) {
                bestAnswer = difference;
            }
            else if (difference == 0) {
                bestAnswer = difference;
                break;
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(bestAnswer);
    }
}