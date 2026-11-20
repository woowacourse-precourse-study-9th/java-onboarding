package onboarding.problem2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Nested;

public class Problem2Test {
    @ParameterizedTest
    @CsvSource({"browoanoommnaon, brown",
            "pppaabllle, be",
            "ddddoongoonnttaoae, ngaoae",
            "baaba, a",
            "abbab, b",
            "accac, c"
    })
    void 중복되는_값을_제거하여_반환한다(String input, String expect) {
        assertThat(Problem2.solution(input)).isEqualTo(expect);
    }

    @Test
    void 대문자가_들어가면_예외발생() {
        assertThatThrownBy(() -> Problem2.solution("Silsavm")).isInstanceOf(IllegalArgumentException.class);
    }

    @Nested
    @DisplayName("입력 길이 제한")
    class InputLength {

        @ParameterizedTest
        @ValueSource(ints = {1, 999, 1000})
        void 길이가_1이상_1000이하_값은_처리가능(int i) {
            int size = i;
            String s = "s".repeat(size);

            assertThatNoException().isThrownBy(() -> Problem2.solution(s));
        }

        @Test
        void 길이가_1000을_넘으면_예외발생() {
            int size = 1001;
            String s = "s".repeat(size);

            assertThat(s).hasSize(size);
            assertThatThrownBy(() -> Problem2.solution(s)).isInstanceOf(IllegalArgumentException.class);
        }

        @Test
        void null값이_들어가면_예외발생() {
            assertThatThrownBy(() -> Problem2.solution(null)).isInstanceOf(IllegalArgumentException.class);
        }
        @Test
        void 빈값이_들어가면_예외발생(){
            assertThatThrownBy(() -> Problem2.solution("")).isInstanceOf(IllegalArgumentException.class);
        }
    }
}
