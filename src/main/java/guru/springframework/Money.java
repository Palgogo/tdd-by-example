package guru.springframework;

public abstract class Money {
    protected int amount;

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
        return new Dollar(dollar);
    }


    public static Franc franc(int franc) {
        return new Franc(franc);
    }
}
