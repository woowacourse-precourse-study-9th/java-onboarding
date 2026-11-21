package onboarding.Problem5;

public enum Money {
    WON_50000(50_000),
    WON_10000(10_000),
    WON_5000(5_000),
    WON_1000(1_000),
    WON_500(500),
    WON_100(100),
    WON_50(50),
    WON_10(10),
    WON_1(1);



    private final int amount;

    Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int send(int money) {
        return money % amount;
    }

    public int calculate(int money) {
        return money/amount;
    }
}
