package onboarding.problem5;

import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        validate(money);
        return Money.match(money);
    }

    private static void validate(int money) {
        if(money < 1 || 1_000_000 < money){
            throw new IllegalArgumentException("1_000_000이하의 값만 입력 가능합니다.");
        }
    }


}
