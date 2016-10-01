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
        Double LON = Math.toRadians(Double.parseDouble(in.next().replaceAll(",", ".")));
        Double LAT = Math.toRadians(Double.parseDouble(in.next().replaceAll(",", ".")));
        int N = in.nextInt();
        in.nextLine();
        
        ArrayList<String[]> adressList = new ArrayList<String[]>();
        
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            adressList.add(DEFIB.replaceAll(",", ".").split(";"));
        }
        
        double closestToTarget = Double.MAX_VALUE;
        String answer = null;
        
        for(String[] adress : adressList) {
            
            Double adressLon = Math.toRadians(Double.parseDouble(adress[4]));
            Double adressLat = Math.toRadians(Double.parseDouble(adress[5]));
            double x = (LON - adressLon) * Math.cos( (adressLat + LAT) / 2 );
            double y = (LAT - adressLat);
            double distance = Math.sqrt( ((x*x) + (y*y)) ) * 6371;
            
            if(closestToTarget > distance) {
                closestToTarget = distance;
                answer = adress[1];   
            }
        }
        
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(answer);
    }
}