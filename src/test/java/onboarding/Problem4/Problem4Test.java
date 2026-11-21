package onboarding.Problem4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem4Test {
    @Test
    void case2() {
        String word = "I";
        String result = "R";
        assertThat(Problem4.solution(word)).isEqualTo(result);
    }

    @Test
    void case1() {
        String word = "I love you";
        String result = "R olev blf";
        assertThat(Problem4.solution(word)).isEqualTo(result);
    }


}