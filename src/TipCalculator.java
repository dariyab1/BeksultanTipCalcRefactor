public class TipCalculator {
    private int numPeople;
    private double billBeforeTip;
    private int percentTip;

    public TipCalculator(int numPeople, int percentTip) {
        this.numPeople = numPeople;
        this.percentTip = percentTip;
        double billBeforeTip = 0.0;
    }

    public double getTotalBeforeTip() {
        return billBeforeTip;
    }

    public int getTipPercentage() {
        return percentTip;
    }

    public void addMeal(double price) {
        billBeforeTip += price;
    }

    public double tipAmount(){
        return (double)billBeforeTip*percentTip/100;
    }

    public double totalBill(){
        return billBeforeTip+tipAmount();
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonCostBeforeTip(){
        return billBeforeTip/numPeople;
    }

    public double perPersonTotalCost(){
        return totalBill()/numPeople;
    }
}
