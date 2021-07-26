public class Price {
    private String currency;
    private double sum;

    public Price(String currency, double sum) {
        this.currency = currency;
        this.sum = sum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String makeUpPrice(){
        return this.currency + this.sum;
    }


}
