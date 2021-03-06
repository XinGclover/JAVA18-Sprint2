package övningsuppgift8;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Övningsuppgift8 {
    
    public Övningsuppgift8(){
        Calculator calculator = new Calculator();
        double firstNumber;
        double secondNumber;
        String operator ;
        double result;
        String indata;
        String svar = "";

        while(true){
            indata = JOptionPane.showInputDialog(svar + 
                    "Skriv ett uttryck");
            
            if (indata == null){
              System.exit(0);
            }
            Scanner sc = new Scanner(indata);
            try{
                firstNumber = sc.nextDouble();
                operator = sc.next();
                secondNumber = sc.nextDouble();
                result = calculator
                  .calculate(firstNumber, secondNumber, operator);
                svar = "Svaret blev " +result+". " ;
            }
            catch (InputMismatchException e){
                svar = "Fel format på indata. " ;
            }
            catch (NoSuchElementException  e){
                svar = "Kunde inte läsa indata. " ;
            }
            catch (OperatorNotSupportedException   e){
                //svar = "Ogiltig operator. " ;
                svar += e.getMessage();
            }
        }
    }
    
    public static void main(String[] args){
        Övningsuppgift8 ö = new Övningsuppgift8();
        
    }
    
}
