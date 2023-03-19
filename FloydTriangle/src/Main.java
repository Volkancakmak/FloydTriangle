import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("how many lines to print floyd triangle?");
        n = in.nextInt();

        System.out.println("Floyd Triangle");

        for (c = 1; c <= n; c++)
        {
            for (d = 1; d <= c; d++)
            {
                System.out.print(num+" ");
                num++;
            }

            System.out.println(); //skip to the next line
        }
    }
}