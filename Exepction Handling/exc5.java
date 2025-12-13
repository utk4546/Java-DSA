public class exc5 {
    public static void main(String[] args) {

        try {
            System.out.println("Outer try start");

            try {
                int a = 10 / 0;   // ArithmeticException
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException

            System.out.println("Outer try end");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index error");
        }

        System.out.println("Program continues...");
    }
}
