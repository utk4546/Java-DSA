

// SIMPLE CALCULTOR USING JAVA 



import java.util.Scanner;

public class Switch1{
    public static void main(String args[]) {
        Scanner s1 =new Scanner(System.in);
        System.out.println("press 1 for addition  ");
        System.out.println("press 2 for subtrction ");
        System.out.println("press 3 for multiplication ");
        System.out.println("print 4 for division ");
         System.out.println("enter your choice");
          int ch=s1.nextInt();
    
          switch(ch){
            case 1:
            { 
                System.out.println("enter two numbers");
                    int a=s1.nextInt();
                     int b=s1.nextInt();
                     int c=a+b;
                     System.out.println("addition of a and b="+c);
                     break;          }
          case 2:
            {
                System.out.println("enter two numbers");
                    int a=s1.nextInt();
                     int b=s1.nextInt();
                     int c=a-b;
                     System.out.println("subtraction of a and b="+c);
                      break;

          }
          case 3: {
            System.out.println("enter two numbers");
                    int a=s1.nextInt();
                     int b=s1.nextInt();
                     int c=a*b;
                     System.out.println("multiplication of a and b="+c);
                     break;
          }
         case 4:{ System.out.println("enter two numbers");
                    int a=s1.nextInt();
                     int b=s1.nextInt();
                     if(b==0){
                        System.out.println("division id not possible");
                        break;
                     }
                    double c=a/b;
                     System.out.println("division of a and b="+c);
                     break;
                    }
                    default:{
                        System.out.println("invalid  choice h sale  ");
                    }
    
        }
    }
}
