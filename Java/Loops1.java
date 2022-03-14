import java.util.Scanner;

/**
 * Ex5
 * Use loops to do some simple math  
 */
public class Loops1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = Integer.parseInt(scan.nextLine()); 

        if (N >= 2 && N <= 20) {
            int result = 0; 
            for (int i = 1; i <= 10; i++) {
                result = N * i;
                System.out.println(N + " x " + i + " = " + result);
            }
        }
        scan.close(); 
    }
}
