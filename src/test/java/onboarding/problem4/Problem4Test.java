package onboarding.problem4;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem4Test {
    @ParameterizedTest
    @CsvSource({
            "I love you, R olev blf",
            "ABC DEFGH IJK LMNOPQ R STUVWXYZ, ZYX WVUTS RQP ONMLKJ I HGFEDCBA",
            "abc, zyx"
    })
    void 규칙에_맞춰서_알파벳_치환(String input, String expect){
        assertThat(Problem4.solution(input)).isEqualTo(expect);
    }
}
