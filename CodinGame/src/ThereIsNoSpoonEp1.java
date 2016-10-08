import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        in.nextLine();
        
        char[][] charArray = new char[width][height];
        for (int y = 0; y < height; y++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            for(int x = 0; x < line.length(); x++) {
                charArray[x][y] = line.charAt(x);
                //System.err.println(charArray[x][y]);
            }
            
        }
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                if(charArray[x][y] == '0') {
                    String p1 = x + " " + y;
                    String p2 = checkHorizontal(x+1, y, width, charArray);
                    String p3 = checkVertical(y+1, x, height, charArray);
                    
                    System.out.println(p1 + " " + p2 + " " + p3);
                }
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // Three coordinates: a node, its right neighbor, its bottom neighbor
        
    }
    
    private static String checkHorizontal(int xPos, int y, int width, char[][] charArray) {
        if(xPos < width) {
            for(int x = xPos; x < width; x ++) {
                if(charArray[x][y] == '0') {
                    return  x + " " + y;
                }
            }
        }
        
        return "-1 -1";
    }
    
    private static String checkVertical(int yPos, int x, int height, char[][] charArray) {
        if(yPos < height) {    
            for(int y = yPos; y < height; y ++) {
                if(charArray[x][y] == '0') {
                    return  x + " " + y;
                }
            }
        }
        return "-1 -1";
    }
    
}