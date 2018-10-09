package ÖvnHärmapaScanner;


import java.util.Locale;
import java.util.Scanner;


public class Övning0_HärmapaScanner {

    Övning0_HärmapaScanner(){

     //  Scanner sc = new Scanner(System.in);
       Scanner sc = new Scanner(System.in,  "iso8859-1");
       System.out.print("Skriv nåt: ");
       
        while (sc.hasNextLine()){
            String input = sc.nextLine();
            if (input.equals("bye")){
                System.exit(0);
            }
            System.out.println("Du sa: "+input);
            System.out.print("Skriv nåt: ");
        }
        
//        //Variant
//        Scanner sc2 = new Scanner(System.in,  "iso8859-1");
//        //gör att vi läser en rad i taget, inte ett ord i taget
//        sc2.useDelimiter("\\n");
//        System.out.print("Skriv nåt: ");
//       
//        while (sc2.hasNext()){
//            String input = sc2.next();
//            if (input.equals("bye")){
//                System.exit(0);
//            }
//            System.out.println("Du sa: "+input);
//            System.out.print("Skriv nåt: ");
//        }
    }
    
    public static void main(String[] args){
        Övning0_HärmapaScanner sc = new Övning0_HärmapaScanner();
    }
}
