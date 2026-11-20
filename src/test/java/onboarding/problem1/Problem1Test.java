package onboarding.problem1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Problem1Test {
    @ParameterizedTest
    @DisplayName("포비의 값이 크면 1을 반환")
    @MethodSource("firstListWinCase")
    void 포비가_승리할시_1_반환(List<Integer> pobi, List<Integer> crong){
        assertThat(Problem1.solution(pobi, crong))
                .isEqualTo(1);
    }

    @ParameterizedTest
    @DisplayName("크롱의 값이 크면 2를 반환")
    @MethodSource("firstListWinCase")
    void 크롱이_승리할시_2_반환(List<Integer> crong, List<Integer> pobi){
        assertThat(Problem1.solution(pobi, crong))
                .isEqualTo(2);
    }

    @ParameterizedTest
    @DisplayName("값이 동일할 시 0을 반환")
    @MethodSource("sameResultCase")
    void 값이_동일할시_0_반환(List<Integer> crong, List<Integer> pobi){
        assertThat(Problem1.solution(pobi, crong))
                .isEqualTo(0);
    }

    static Stream<Arguments> firstListWinCase(){
        return Stream.of(
                Arguments.of(List.of(221, 222), List.of(111,112)),
                Arguments.of(List.of(21,22), List.of(11, 12)),
                Arguments.of(List.of(5, 6), List.of(3,4))
        );
    }
    static Stream<Arguments> sameResultCase(){
        return Stream.of(
                Arguments.of(List.of(97, 98), List.of(197, 198)),
                Arguments.of(List.of(95, 96), List.of(195, 196)),
                Arguments.of(List.of(93, 94), List.of(193, 194))
        );
    }
}
