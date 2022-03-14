import java.util.Scanner;

/**
 * Exercise 3
 * Using if-else conditional statements 
 */
public class IfElse {
    
    private static final Scanner scan = new Scanner(System.in); 
    public static void main(String[] args) {
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N >= 1 && N <= 100) {
            if (N % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                } else if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }
        }
        scan.close(); 
    }
}
