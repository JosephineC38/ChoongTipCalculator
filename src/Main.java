import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group? ");
        int numPe = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? ");
        double tipPer = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 ");
        double cost = 0.0;

        while (cost != -1)
        {
            cost += scan.nextInt();
        }

        System.out.println(cost);

        scan.close();

    }
}
