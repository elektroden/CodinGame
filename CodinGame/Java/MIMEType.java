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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        
        HashMap<String, String> mimeMap = new HashMap<String,String>();
        ArrayList<String> fileNames = new ArrayList<String>();
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            
            //System.err.println(EXT.toLowerCase());
            //System.err.println(MT.toLowerCase());
            //System.err.println("");
            
            mimeMap.put(EXT.toLowerCase(), MT);
        }
        
       //System.err.println("============================");
        
        in.nextLine();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            fileNames.add(FNAME.toLowerCase());
            //System.err.println(FNAME);
            //System.err.println("");
        }
        
        //System.err.println("============================");
    
        for(String file : fileNames) {
            int index = file.lastIndexOf(".");
            String extensionName = file.substring(index+1);
            //System.err.println(file);
            //System.err.println(ext);
            //System.err.println("");
            
            if( !extensionName.matches("\\w+") || index == -1) {
                System.out.println("UNKNOWN"); 
            }
            else {
                if(mimeMap.containsKey(extensionName)) {
                    System.out.println(mimeMap.get(extensionName));
                }
                else {
                    System.out.println("UNKNOWN");
                }
            }
        }
    }
}