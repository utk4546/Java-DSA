 class Example {
    int x;  //object(instance) member variable
    int y;
    static int   z;  //static member variable
    
}
public class Clsobj {
public static void main(String[] args){
    Example.z=10;
    System.out.println(Example.z);
    Example e1=new Example();
    Example e2 = new Example();
    e1.x=5;
    e2.x=6;
    Example.z=7;
    System.out.println(e1.x);
    System.out.println(e2.x);
    System.out.println(Example.z);

 
}
}