package onboarding.Problem3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Problem3Test {
    @Test
    void case1() {
        int number = 13;
        int result = 4;
        assertThat(Problem3.solution(number)).isEqualTo(result);
    }

    @Test
    void case2() {
        int number = 33;
        int result = 14;
        assertThat(Problem3.solution(number)).isEqualTo(result);
    }

    @Test
    void 백의자리_까지_삼육구일때(){
        int number = 333;
        int result = 228;
        assertThat(Problem3.solution(number)).isEqualTo(result);
    }
}