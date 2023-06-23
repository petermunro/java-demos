public class Currency {
    private String currency;

    public Currency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public static void main(String[] args) {
        Currency c = new Currency("USD");
        System.out.println(c.getCurrency());
    }
}
