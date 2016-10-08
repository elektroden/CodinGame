import java.util.*;
import java.io.*;
import java.math.*;
 
class Solution {
 
    public static void main(String args[])
    {
       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       
        int[] intList = new int[n];
       
        for (int i = 0; i < n; i++)
        {
            intList[i] = in.nextInt();
            System.err.println(intList[i]);
        }
       
        int maxLoss = 0;
               
        int minValue = intList[0];
        int maxValue = intList[0];
   
       
        for(int i = 1; i < n; i++)
        {
            if(minValue > intList[i])
            {
                minValue = intList[i];
                int newLoss = maxValue - minValue;
                if(newLoss > maxLoss)
                    maxLoss = newLoss;
            }
            else if(maxValue < intList[i])
            {  
               
                maxValue = intList[i];
                minValue = maxValue;
            }
            else
                minValue = maxValue;
        }
       
        maxLoss = -maxLoss;
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
 
        System.out.println(maxLoss);
    }
}