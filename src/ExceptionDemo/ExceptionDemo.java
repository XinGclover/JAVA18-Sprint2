package ExceptionDemo;

public class ExceptionDemo {
    void method()throws ArithmeticException{  
        throw new ArithmeticException("ArithmeticException Occurred");  
    }  

    public static void main(String args[]){
        ExceptionDemo obj=new ExceptionDemo(); 
        try{
            obj.method(); 
            System.out.println("Stuff in try clause");
        }
        catch (ArithmeticException ae){
            System.out.println("Catch");
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("End Of Program");  
    }  
}
