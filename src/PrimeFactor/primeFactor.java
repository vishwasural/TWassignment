package PrimeFactor;

import java.util.ArrayList;
import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {
        Scanner ipScnr =new Scanner(System.in);
        int n = ipScnr.nextInt();
        generate(n);
    }

    private static void generate(int n){
        ArrayList<Integer> factors =new ArrayList<>();
        int sqrtnum = (int) Math.sqrt(n);
        for (int i = 1; i < sqrtnum; i++) {
            if(n%i== 0 && isPrime(i)){
                factors.add(i);
            }

        }
        System.out.println(factors);
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }
}