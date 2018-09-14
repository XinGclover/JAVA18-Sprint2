package LocaleDemo;

import java.util.Locale;


public class LocaleDemo {

    LocaleDemo(){
        System.out.println("Default locale: "+Locale.getDefault());
        Locale.setDefault(Locale.US);
        System.out.println("New locale: "+Locale.getDefault());
    }
    
    public static void main(String[] args){
        LocaleDemo g = new LocaleDemo();
    }
    
}
