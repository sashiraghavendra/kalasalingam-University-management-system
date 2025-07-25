package first;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 1;
        for(int row = 0; row <n;row++) {
        	for(int col = 0; col <=n; col++) {
        		System.out.print("");
        	}
        	for(int col = 0;col<t;col++) {
        		System.out.print("* ");
        	}
        	t= t + 1;
        	System.out.println();
        }
    }
}