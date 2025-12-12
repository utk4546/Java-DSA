// package ExepctionHandling;

public class exc1 {
    public static void main(String[] args) {
        int d , a ;
        try{
            //monitor the block of code 
            d=0;
            a=45/d;
            System.out.println("this will not be printed");
        }
        catch(ArithmeticException e){
            // catches the error
            System.out.println(" division by zero");

        }
        System.out.println("after the catch statement");
    
    }
    
}
