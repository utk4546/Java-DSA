public class exc4 {
    public static void main(String[] args) {
       try {
        int a =args.length;
        System.out.println("a is = "+a);
        int b=45/a;
        int c[]={1};
        c[42]=59;
    }catch(ArithmeticException e){
        System.out.println("divide by zero "+e);
    }catch(ArrayIndexOutOfBoundsException e ){
        System.out.println("Array index out off bound "+e );
    }
    System.out.println(" after try/catch blocks");
  }
}