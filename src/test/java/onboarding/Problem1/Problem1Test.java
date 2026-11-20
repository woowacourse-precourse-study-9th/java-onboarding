package onboarding.Problem1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class Problem1Test {

    @Test
    void 무승부_테스트() {
        List<Integer> pobi = List.of(97, 98);
        List<Integer> crong = List.of(197, 198);
        int result = 0;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void 포비_승리_테스트() {
        List<Integer> pobi = List.of(131, 132);
        List<Integer> crong = List.of(211, 212);
        int result = 1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void 크롱_승리_테스트() {
        List<Integer> pobi = List.of(131, 132);
        List<Integer> crong = List.of(241, 242);
        int result = 2;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void case3() {
        List<Integer> pobi = List.of(99, 102);
        List<Integer> crong = List.of(211, 212);
        int result = -1;
        assertThat(Problem1.solution(pobi, crong)).isEqualTo(result);
    }

    @Test
    void 왼쪽이_짝수라면_예외(){
        List<Integer> pobi = List.of(102, 104);
        List<Integer> crong = List.of(211, 212);

        int result = -1;
        assertThat(Problem1.solution(pobi,crong)).isEqualTo(result);

    }

    @Test
    void 오른쪽이_홀수라면_예외(){
        List<Integer> pobi = List.of(101, 103);
        List<Integer> crong = List.of(211, 212);

        int result = -1;
        assertThat(Problem1.solution(pobi,crong)).isEqualTo(result);

    }
    @Test
    void 오른쪽_값이_왼쪽_더하기_1_이_아니라면_예외(){
        List<Integer> pobi = List.of(99, 102);
        List<Integer> crong = List.of(211, 212);

        int result = -1;
        assertThat(Problem1.solution(pobi,crong)).isEqualTo(result);

    }
    @Test
    void 페이지_범위가_1_이하면_예외(){
        List<Integer> pobi = List.of(1, 102);
        List<Integer> crong = List.of(211, 212);

        int result = -1;
        assertThat(Problem1.solution(pobi,crong)).isEqualTo(result);

    }
    @Test
    void 페이지_범위가_400_이상이면_예외(){
        List<Integer> pobi = List.of(101, 400);
        List<Integer> crong = List.of(211, 212);

        int result = -1;
        assertThat(Problem1.solution(pobi,crong)).isEqualTo(result);

    }




}