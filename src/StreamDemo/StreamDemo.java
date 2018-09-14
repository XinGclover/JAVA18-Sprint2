package StreamDemo;

import java.io.BufferedReader;
import java.io.FileReader;


public class StreamDemo {
    
    
    public static void main(String[] args){
        String tempLine;
        try {
            BufferedReader bufIn = new BufferedReader
                (new FileReader ("src\\StreamDemo\\Luka.txt"));
            //med BufferedReader kan vi läsa en rad i taget
            while(true){
                tempLine = bufIn.readLine();
                System.out.println(tempLine);
            }
        }
        catch (Exception e){
            System.out.println("Could not read from file");
        }
    }
}


