class ToStringExample {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;   // error yahan aayega
        }
        catch (ArithmeticException e) {

            System.out.println("Using toString():");
            System.out.println(e.toString());

            System.out.println("\nDirectly printing exception:");
            System.out.println(e);   // internally toString() call hota hai
        }
    }
}

    

