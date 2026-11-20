package onboarding.problem4;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import onboarding.problem3.Problem3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Problem4Test {
    @ParameterizedTest
    @CsvSource({
            "'I love you', 'R olev blf'",
            "'ABC DEFGH IJK LMNOPQ R STUVWXYZ', 'ZYX WVUTS RQP ONMLKJ I HGFEDCBA'",
            "abc, zyx"
    })
    void 규칙에_맞춰서_알파벳_치환(String input, String expect){
        assertThat(Problem4.solution(input)).isEqualTo(expect);
    }

    @Nested
    @DisplayName("예외 테스트")
    class InputExceptionTest {

        @ParameterizedTest
        @ValueSource(ints = {1, 500, 1_000})
        void 길이가_1이상_1000이하_값은_처리가능(int i) {
            String s = "a".repeat(i);
            assertThatNoException().isThrownBy(() -> Problem4.solution(s));
        }

        @ParameterizedTest
        @ValueSource(ints = {1_001})
        void 길이가_1000을_넘으면_예외발생(int i) {
            String s = "a".repeat(i);
            assertThatThrownBy(() -> Problem4.solution(s)).isInstanceOf(IllegalArgumentException.class);
        }

        @Test
        void null값이_들어오면_예외발생(){
            assertThatThrownBy(() -> Problem4.solution(null)).isInstanceOf(IllegalArgumentException.class);
        }
        @Test
        void 빈값이_들어오면_예외발생(){
            assertThatThrownBy(() -> Problem4.solution("")).isInstanceOf(IllegalArgumentException.class);
        }
    }
}
