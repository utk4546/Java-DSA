import java.util.Scanner;
class Circle{
    public static void main (String args[]){
        Scanner s1 =new Scanner(System.in);
        System.out.print("enter radius of circle:");
        int r=s1.nextInt();
        double z=3.14*r*r;
      System.err.println("Area of circle  is :"+z);
    }
}