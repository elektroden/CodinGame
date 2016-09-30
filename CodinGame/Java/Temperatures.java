import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        
        String[] splited = temps.split(" ");
        int closestToZero = Integer.MAX_VALUE;
        int result = 0;
        
        if(n > 0) {
            for(String s : splited) {
                int stringNumber = Integer.parseInt(s);
                if(Math.abs(stringNumber) < Math.abs(closestToZero) || Math.abs(stringNumber) == Math.abs(closestToZero) && stringNumber > closestToZero) {
                    closestToZero = stringNumber;
                    result = stringNumber;
                }
    
            }
        }
        // To debug: System.err.println("Debug messages...");

        System.out.println(result);
    }
}