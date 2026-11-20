package onboarding.problem5;

import java.util.ArrayList;
import java.util.List;

public enum Money {
    WON_50_000("5만원", 50_000),
    WON_10_000("1만원", 10_000),
    WON_5_000("5천원", 5_000),
    WON_1_000("1천원", 1_000),
    WON_500("5백원", 500),
    WON_100("1백원", 100),
    WON_50("5십원", 50),
    WON_10("1십원",10),
    WON_1("1원", 1);

    private String moneyName;
    private int moneyAmount;

    Money(String moneyName, int moneyAmount) {
        this.moneyName = moneyName;
        this.moneyAmount = moneyAmount;
    }

    public static List<Integer> match(int inputNumber){
        List<Integer> result = new ArrayList<>();
        int number = inputNumber;

        for(Money money : Money.values()){
            result.add(number/ money.moneyAmount);
            number %= money.moneyAmount;
        }
        return result;
    }

}
