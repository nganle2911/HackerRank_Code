import java.util.Scanner;

/**
 * Ex2 
 * Practice "standard input" and "standard output" 
 */
public class StdinAndStdout1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt(); 
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }
}
