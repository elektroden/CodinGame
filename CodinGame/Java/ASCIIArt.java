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
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        
        ArrayList<String> AsciiList = new ArrayList<String>();
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?".split("");
        
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            AsciiList.add(ROW);
        }
        numberList = getTextAsNumber(T);

        System.out.println(buildNewAsciiString(AsciiList, numberList, L));
    }
    
    private static ArrayList<Integer> getTextAsNumber(String text) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        char[] chars = text.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : chars) {
            int temp = (int)c;
            int temp_integer = 96; //for lower case
            if(temp<=122 & temp>=97) {
                numberList.add((temp-96));
            }
            else {
                numberList.add(27);
            }
        }
        return numberList;
    }
    
    private static String buildNewAsciiString(ArrayList<String> AsciiList, ArrayList<Integer> numberList, int L) {
        StringBuilder sb = new StringBuilder();
        for(int p = 0; p < AsciiList.size(); p++) {
            for(Integer i: numberList) {
                sb.append(AsciiList.get(p).subSequence((i*L-L), (i*L)));
            }
            if(p != AsciiList.size()-1) {
                    sb.append("\n");
                }
            
        }
        return sb.toString();
    }
}