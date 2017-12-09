package Triangle;

import java.util.Scanner;

public class rightTriangle {
    public static void main(String args[]) {
        int n;
        Scanner ipScnr = new Scanner(System.in);
        n = ipScnr.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
