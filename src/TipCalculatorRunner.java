import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
        int people = input.nextInt();
        System.out.println("What's the tip percentage?");
        int percentageTip = input.nextInt();
        TipCalculator calc = new TipCalculator(people, 25);
        double cost=0;
        while (cost!=-1){
            calc.addMeal(cost);
            System.out.println("Enter a cost in dollars and cents: ");
            cost=input.nextDouble();
        }
        System.out.println("Total Bill Before Tip: " + calc.getTotalBeforeTip());
        System.out.println("Tip Percentage: "+calc.getTipPercentage());
        System.out.printf("Total Tip: %.2f %n",calc.tipAmount());
        System.out.printf("Total Bill With Tip: %.2f %n",calc.totalBill());
        System.out.printf("Per Person Cost Before Tip: %.2f %n", calc.perPersonCostBeforeTip());
        System.out.printf("Tip Per Person: %.2f %n", calc.perPersonTipAmount());
        System.out.printf("Total Cost Per Person: %.2f %n", calc.perPersonTotalCost());
    }
}
