package FizzBuzz;

public class fizzBuzz {
    public static void main(String[] args)
    {
        Fizzbuzz();
    }

    private static void Fizzbuzz() {
        for(int i=1;i<100;i++)
        {
            checkdivthree(i);
            checkdivfive(i);
            checknot(i);
            System.out.println();
        }
    }

    private static void checknot(int i) {
        if(i%3!=0&&i%5!=0)
            System.out.print(i);
    }

    private static void checkdivthree(int i) {
        if(i%3==0)
            System.out.print("Fizz");
    }
    private static void checkdivfive(int i) {
        if(i%5==0)
            System.out.print("Buzz");
    }
}
