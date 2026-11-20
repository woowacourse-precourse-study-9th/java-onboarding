package onboarding.problem5;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class problem5Test {
    @ParameterizedTest
    @MethodSource("moneyResult")
    void 기본_동작_테스트(int money, int[] expect){
        assertThat(Problem5.solution(money)).isEqualTo(expect);
    }

    static Stream<Arguments> moneyResult(){
        return Stream.of(
                Arguments.of(50_237, new int[]{1,0,0,0,0,2,0,3,7}),
                Arguments.of(15_000, new int[]{0,1,1,0,0,0,0,0,0})
        );
    }
}
