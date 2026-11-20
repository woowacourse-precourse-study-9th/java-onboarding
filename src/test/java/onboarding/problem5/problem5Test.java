package onboarding.problem5;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class problem5Test {
    @ParameterizedTest
    @MethodSource("moneyResult")
    void 기본_동작_테스트(int money, List<Integer> expect){
        assertThat(Problem5.solution(money)).isEqualTo(expect);
    }

    static Stream<Arguments> moneyResult(){
        return Stream.of(
                Arguments.of(50_237, List.of(1,0,0,0,0,2,0,3,7)),
                Arguments.of(15_000, List.of(0,1,1,0,0,0,0,0,0))
        );
    }

    @Nested
    @DisplayName("예외 테스트")
    class InputExceptionTest {

        @ParameterizedTest
        @ValueSource(ints = {1, 500_000, 1_000_000})
        void 길이가_1이상_1_000_000이하_값은_처리가능(int i) {
            assertThatNoException().isThrownBy(() -> Problem5.solution(i));
        }

        @ParameterizedTest
        @ValueSource(ints = {0,1_000_001})
        void 길이가_1미만_1_000_000초과_되면_예외발생(int i) {
            assertThatThrownBy(() -> Problem5.solution(i)).isInstanceOf(IllegalArgumentException.class);
        }
    }

}
