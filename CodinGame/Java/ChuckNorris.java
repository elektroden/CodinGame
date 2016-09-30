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
        String MESSAGE = in.nextLine();
        
        StringBuilder binaryString = new StringBuilder();
        char[] charArray = MESSAGE.toCharArray();
        
        for(char c : charArray) {
            binaryString.append((String) String.format("%7s", Integer.toBinaryString((int) c)).replace(' ', '0'));
        }
        
        System.err.println(binaryString.toString());
        String groupedString[] = binaryString.toString().split("(?<=1)(?=0)|(?<=0)(?=1)");
        StringBuilder encodedString = new StringBuilder();
        
        for(String group : groupedString) {
            if (group.contains("0")) {
                encodedString.append("00 ");
            }
            else {
                encodedString.append("0 ");
            }
            
            for (int i = 0; i < group.length(); i++) {
                encodedString.append("0");
            }
            encodedString.append(" ");
        }
        
        encodedString.setLength(encodedString.length() - 1);
        //System.err.println(binaryString);

        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(encodedString.toString());
    }
    
}
