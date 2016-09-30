import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int thorX = in.nextInt(); // Thor's starting X position
        int thorY = in.nextInt(); // Thor's starting Y position
        String direction;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            if(lightX < thorX) {
                thorX--;
                if(lightY < thorY) {
                    direction = "NW";
                    thorY--;
                }
                else if(lightY > thorY) {
                    direction = "SW";
                    thorY++;
                }
                else {
                    direction = "W";
                }
            }
            else if(lightX > thorX) {
                thorX++;
                if(lightY < thorY) {
                    direction = "NE";
                    thorY--;
                }
                else if(lightY > thorY) {
                    direction = "SE";
                    thorY++;
                }
                else {
                    direction = "E";
                }
            }
            else {
                if(lightY < thorY) {
                    direction = "N";
                    thorY--;
                }
                else {
                    direction = "S";
                    thorY++;
                }
            }
            
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
}