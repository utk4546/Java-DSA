import java.util.Scanner;

public class Percent {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        int s=0;
        int count=0;
        double per;
        int arr[]=new int[6];
        System.out.println("enter 6 numbers ");
        for(int i=0;i<6;i++){
            arr[i]=s1.nextInt();
            s=s+arr[i];
            if(arr[i]<30){
                count++;
            }

        }
        System.out.println("total martks = "+s);
        
        per =(s/600.0)*100.0;
        System.out.println("percentage = " +per);
        if(count==0){
        if(per>=70 && per<80 ){
            System.out.println("passs with B+ grade");
        }else if(per>=80 && per<=100){
            System.out.println("passes with grade A");
        }else if(per<70 && per>=50){
            System.out.println("passes with B grade ");
        }else if(per<50 && per>=40){
            System.out.println("passes with C grade");
        }else if(per<=40 && per>=30){
            System.out.println("pass with grace");
        }
        else {
            System.out.println("fail ho gya sala dallla ");
        }
        }
        else {
            System.out.println("fail hai dalle  ");
        }
     }
     }


        