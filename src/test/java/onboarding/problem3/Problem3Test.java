package onboarding.problem3;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
}
