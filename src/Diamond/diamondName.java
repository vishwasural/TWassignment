package Diamond;

import java.util.Scanner;

public class diamondName {
    public static void main(String[] args)
    {
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
            if(i==n-1) {
                System.out.print("Vishwas");
                break;
            }
            else
                System.out.print("*");
        }
        for(int j=0;j<gap;j++)
        {
            System.out.print(" ");
        }
        gap--;
        System.out.println();
    }
    gap++;
        for(int i=n-2; i>=0; i--) {
        for(int j=0;j<=gap;j++)
        {
            System.out.print(" ");
        }
        for(int k=0;k<2*i+1;k++) {
            System.out.print("*");
        }
        for(int j=0;j<=gap;j++)
        {
            System.out.print(" ");
        }
        gap++;
        System.out.println();
    }
}
}
