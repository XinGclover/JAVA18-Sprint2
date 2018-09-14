package övningsuppgift5;

import java.io.File;
import java.util.Scanner;

public class Övningsuppgift5b {
    
    public Övningsuppgift5b () {
        File file = new File("src\\övningsuppgift5\\temp.txt");
        double temp;
        double tempSum = 0;
        int amountOfDays = 0;
        double maxTemp = -Double.MAX_VALUE;
        double minTemp = Double.MAX_VALUE;
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                temp = sc.nextDouble();
                if (temp > maxTemp) {
                    maxTemp = temp;
                }
                if (temp < minTemp) {
                    minTemp = temp;
                }
                amountOfDays++;
                tempSum += temp;
            }
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            System.out.flush();
            System.exit(0);
        }
        
        System.out.printf("Maxtemp är %.1f, mintemp är %.1f, medelvärdet är %.1f (beräknat över %d dagar)", 
                maxTemp, minTemp, tempSum/amountOfDays, amountOfDays);
    }
    
    
    public static void main(String[] args){
        Övningsuppgift5b ö = new Övningsuppgift5b();
    }
}
