package onboarding.problem3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import onboarding.problem2.Problem2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Problem3Test {
    @ParameterizedTest
    @CsvSource({
            "13, 4",
            "33, 14",
            "14, 4"
    })
    void 숫자를_입력받아서_369_횟수_반환(int number, int expect){
        assertThat(Problem3.solution(number)).isEqualTo(expect);
    }

    @Nested
    @DisplayName("예외 테스트")
    class InputExceptionTest {

        @ParameterizedTest
        @ValueSource(ints = {1, 5_000, 10_000})
        void 길이가_1이상_10000이하_값은_처리가능(int i) {
            assertThatNoException().isThrownBy(() -> Problem3.solution(i));
        }

        @ParameterizedTest
        @ValueSource(ints = {0, 10_001})
        void 길이가_1000을_넘으면_예외발생(int i) {
            assertThatThrownBy(() -> Problem3.solution(i)).isInstanceOf(IllegalArgumentException.class);
        }
    }
}
