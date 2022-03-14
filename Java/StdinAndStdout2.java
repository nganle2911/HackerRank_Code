import java.util.Scanner;

/**
 * Ex4
 * Read an integer, a double and a string from stdin
 * Print the values according to the instructions in the Output format 
 */
public class StdinAndStdout2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine(); 
        String s = scan.nextLine(); 
        
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close(); 
    }
}
