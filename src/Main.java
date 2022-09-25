import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat formatter = new DecimalFormat("#.##");

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are in your group? ");
        int numPe = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? ");
        double tip = scan.nextDouble();
        scan.nextLine();
        String tipCal = "1." + (int)tip;
        double tipPer = Double.parseDouble(tipCal); //I had to search up how to convert a double to a string
        
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double bill = scan.nextDouble();
        scan.nextLine();
        double itemCost = 0;

        while (itemCost != -1)
        {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            itemCost = scan.nextDouble();
            bill = itemCost + bill;
            scan.nextLine();
        }
        bill ++;
        scan.close();

        double billTip = bill * tipPer;
        String formBillTip = formatter.format(billTip);

        double tipTotal = billTip - bill;
        String formTipTotal = formatter.format(tipTotal);

        double perCost = bill / numPe;
        String formPerCost = formatter.format(perCost);

        System.out.println("------------------------");
        System.out.println("Total Bill Before Tip: " + bill);
        System.out.println("Tip Percentage: " + tip);
        System.out.println("Total Tip: " + formTipTotal);
        System.out.println("Total Bill With Tip: " + formBillTip);
        System.out.println("Per Person Cost Before Tip: " + formPerCost);


    }
}
