package onboarding.Problem5;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();

        for (Money amount : Money.values()) {
            answer.add(amount.calculate(money));
            money = amount.send(money);
        }

        return answer;
    }
}
