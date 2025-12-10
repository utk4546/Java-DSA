import java.util.*;
public class otp{
    public static void main(String[] args){
        Random s1=new Random();
        String otp=" ";
        for(int i=0;i<=4;i++){
            int digit =s1. nextInt(10);
            otp+=digit;
        
        }
        System.out.println("your otp is :"+otp);

    }
}