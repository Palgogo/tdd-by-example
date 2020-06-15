package guru.springframework;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract Money times(int multiplier);

    public Money(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;

        return amount == money.amount
                && this.getClass().equals(object.getClass());
    }

    public static Dollar dollar(int dollar) {
        return new Dollar(dollar, "USD");
    }


    public static Franc franc(int franc) {
        return new Franc(franc, "CHF");
    }
}
