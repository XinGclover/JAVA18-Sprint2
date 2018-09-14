package övningsuppgift9;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public class Övningsuppgift9 {
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    public void showMessage(String stad){
        String formattedTime = formatter.format(LocalTime.now());
        JOptionPane.showMessageDialog(null, "I "+ stad +" är klockan "+ 
                formattedTime);
    }
    
    public void showErrorMessage(){
        JOptionPane.showMessageDialog(null, "Inte en giltig stad");
    }

    public Övningsuppgift9(){
        String vilkenStad = JOptionPane.showInputDialog("Vilket land vill du veta tiden för?");
        boolean giltigStad = false;
        if(vilkenStad.toUpperCase().trim().equals("STOCKHOLM")){
            TimeZone.setDefault(TimeZone.getTimeZone("Europe/Stockholm"));
            showMessage(vilkenStad);
        }
        else if(vilkenStad.toUpperCase().trim().equals("SHANGHAI")){
            TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
            showMessage(vilkenStad);
        }
        else if(vilkenStad.toUpperCase().trim().equals("TORONTO")){
            TimeZone.setDefault(TimeZone.getTimeZone("America/Toronto"));
            showMessage(vilkenStad);
        }
        else showErrorMessage();
    }
    
    

    public static void main(String[] args) {
        Övningsuppgift9 ö = new Övningsuppgift9();
    }
    
}
