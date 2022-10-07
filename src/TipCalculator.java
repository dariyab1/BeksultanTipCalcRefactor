public class TipCalculator {
    private int numPeople;
    private double billBeforeTip;
    private double percentTip;

    public TipCalculator(int people, double tipPercentage) {
        int numPeople = people;
        double percentTip = tipPercentage;
        double billBeforeTip = 0.0;
    }

    public double getTotalBeforeTip() {
        return billBeforeTip;
    }

    public double getTipPercentage() {
        return percentTip;
    }

    public void addMeal(double price) {
        billBeforeTip += price;
    }

    public double tipAmount(){
        return billBeforeTip*(percentTip/100);
    }

    public double totalBill(){
        return billBeforeTip+tipAmount();
    }

    public double perPersonTipAmount() {
        return billBeforeTip / numPeople;
    }




}
