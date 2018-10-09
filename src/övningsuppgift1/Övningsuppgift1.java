package övningsuppgift1;

import java.util.Scanner;

public class Övningsuppgift1 {
    
    public Scanner sc = new Scanner(System.in);

    protected double getInParam(String promptMessage){
        System.out.println(promptMessage);
        return sc.nextDouble();
    }
    
    public Övningsuppgift1() {
        double currentMätarställning = getInParam("Ange mätarställning nu: ");
        double oldMätarställning = getInParam("Ange mätarställning för ett år sedan: ");
        double amountOfGas = getInParam("Ange antal liter förbrukad bensin: ");
        
        double antalKördaMil = currentMätarställning - oldMätarställning;
        double forbrukningPerMil = amountOfGas / antalKördaMil;
        
        System.out.printf("Antal körda mil: %8.0f \n" , antalKördaMil);
        System.out.printf("Antal liter bensin: %7.1f \n", amountOfGas);
        System.out.printf("Förbrukning per mil: %1.2f \n", forbrukningPerMil);

    }
    
    public static void main(String[] args) {
        Övningsuppgift1 ö = new Övningsuppgift1();
    }
    
}
