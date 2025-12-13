import java.util.*;

public class exc2 {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random r=new Random();
        for (int i=0;i<10;i++){
            try{
            b=r.nextInt();
            c=r.nextInt();
            a=12345/(b/c);
        } catch(ArithmeticException e){
            System.out.println("division by 0");
            a=0;     // set a to 0 and countinue   


        }
           System.out.println("a "+a);
        
        }
    }
    
}
