import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// HomeWork
        // Create method div(), which calculates the dividing of two double numbers.
        // In main method input 2 double numbers and call this method. Catch all exceptions.

        Scanner sc = new Scanner(System.in);
       try{
        Double a=sc.nextDouble();
        Double b=sc.nextDouble();
        System.out.println( div(a,b));}
       catch (Exception e) {
           System.err.println(e.getMessage() + "\n");
           e.printStackTrace();
       }

        //Write a method readNumber(int start, int end), that read from console integer number
        // and return it, if it is in the range [start ... end].
        //If an invalid number or non-number text is read, the method should throw an exception.
        //Using this method write a method main(), that has to enter 10 numbers:
        //	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
        //Refactor your previous homeworks (1-7) and try to handle all possible exceptions
        // in your code.
        for (int i=0; i<10; i++) {
            try {
                System.out.println(readNumber(1,100));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static double div(double a, double b) {
    return a/b;
    }
    private static String readNumber(int start, int end) throws Exception{
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        if ((n>start)&&(n<end))return String.valueOf(n);
        else return "Out of bond";
    }
}
