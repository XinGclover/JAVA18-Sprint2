package StreamDemo;

import java.io.BufferedReader;
import java.io.FileReader;


public class StreamDemo {
    
    public static void main(String[] args){
        String tempLine;
        int tempInt = 0;
        try {
         //   med BufferedReader kan vi läsa en rad i taget
            BufferedReader bufIn = new BufferedReader
                (new FileReader ("src\\StreamDemo\\Luka.txt"));
            
            while(true){
                tempLine = bufIn.readLine();
                System.out.println(tempLine);
            }
            
//            FileReader fileIn = new FileReader("src\\StreamDemo\\Luka.txt");
//            
//            while(tempInt != -1){
//               // tempInt = fileIn.read();
//                tempInt = fileIn.read();
//                System.out.println(tempInt);
//                // Vi måste casta intarna till char
//                //System.out.println((char)tempInt);
//            }
        }
        catch (Exception e){
            System.out.println("Could not read from file");
        }
    }
}


