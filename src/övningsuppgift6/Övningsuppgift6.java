package övningsuppgift6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Övningsuppgift6 {
    
    //Kräver filer som finns. 
    //Ligger de i samma katalog måste de skrivas enligt src\\PathDemo\\filnamn

    public Övningsuppgift6 () {
       
        String firstLine;
        String secondLine;
        Path inFilePath;
        String filePath = "src\\övningsuppgift6\\Personuppgifter.txt";
        String outFilePathString = "src\\övningsuppgift6\\TallPeopleInformation.txt";
        Path outFilePath = Paths.get("src\\övningsuppgift6\\TallPeopleInformation.txt");
        
        String[] personDataParts;
        
        //Uppgift 6b, try with resources, gamla sättet
        //try(PrintWriter w = new PrintWriter(new BufferedWriter(
        //        new FileWriter(outFilePathString)))){
               
        //Uppgift 6b, try with resources, nya sättet med Paths och Files
        try(PrintWriter w = new PrintWriter(Files.newBufferedWriter(outFilePath)))
            {
            
            inFilePath = Paths.get(filePath);
            Scanner fileScanner = new Scanner(inFilePath);
            
            while(fileScanner.hasNext()){
                firstLine = fileScanner.nextLine();
                if (fileScanner.hasNext()){
                    secondLine = fileScanner.nextLine();
                    personDataParts = secondLine.split(",");

                    if (Integer.parseInt(personDataParts[2].trim()) > 199){
                        w.print(firstLine + "\n" + secondLine+ "\n");
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Filen kunde inte hittas");
            System.out.flush();
            System.exit(0);
       }
        catch (IOException e){
            System.out.println("Det gick inte att skriva till fil");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }
        //finally behövs inte när vi har try-with-resources
    }
    
    public static void main(String[] args){
        Övningsuppgift6 ö = new Övningsuppgift6();
    }
}
