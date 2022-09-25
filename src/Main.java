import java.text.DecimalFormat;
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
        double tipPer = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double costTotal = scan.nextDouble();
        scan.nextLine();
        double itemCost = 0;

        while (itemCost != -1)
        {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            itemCost = scan.nextDouble();
            costTotal = itemCost + costTotal;
            scan.nextLine();
        }

        System.out.println(cost);


        scan.close();

    }
}
