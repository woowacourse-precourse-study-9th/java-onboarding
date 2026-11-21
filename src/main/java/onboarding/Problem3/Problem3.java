package onboarding.Problem3;

public class Problem3 {

    private static final int DIVIDE_NUMBER = 10;
    private static final int CLAP_MULTIPLE_BASE = 3;
    private static final int INIT_NUMBER = 0;
    private static final int CLAP = 1;
    private static final int NO_CLAP = 0;

    public static int solution(int number) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {

            answer += countClap(i);
        }

        return answer;
    }

    private static int countClap(int number) {
        int count = INIT_NUMBER;

        while (number > 0) {

            int digit = number % DIVIDE_NUMBER;
            number /= DIVIDE_NUMBER;
            count += countClapOfDigit(digit);

        }

        return count;
    }

    private static int countClapOfDigit(int digit) {

        if (is369(digit)) {
            return CLAP;
        }
        return NO_CLAP;
    }

    private static boolean is369(int remain) {
        return remain != 0 && remain % CLAP_MULTIPLE_BASE == 0;
    }


}
