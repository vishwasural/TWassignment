package Diamond;

import java.util.Scanner;

public class isosceles {
    public static void main(String args[]) {
        int n;
        Scanner ipScnr = new Scanner(System.in);
        n = ipScnr.nextInt();
        int gap = n-1;
        for(int i=0; i<n; i++) {
            for(int j=0;j<gap;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++) {
                System.out.print("*");
            }
            for(int j=0;j<gap;j++)
            {
                System.out.print(" ");
            }
            gap--;
            System.out.println();
        }
    }
}
