package onboarding.Problem1;

import java.util.List;

class Problem1 {

    private static final int LEFT_PAGE = 0;
    private static final int RIGHT_PAGE = 1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {

        if (isNotValidPage(pobi) || isNotValidPage(crong)) {
            return -1;
        }
        return decideWinner(calculateMax(pobi), calculateMax(crong));
    }


    private static int calculateMax(List<Integer> user) {
        return Math.max(sumNumber(user), multiplyNumber(user));
    }

    private static int multiplyNumber(List<Integer> user) {


        return Math.max(
                multiplyDigits(user.get(LEFT_PAGE))
                , multiplyDigits(user.get(RIGHT_PAGE))
        );

    }

    private static int multiplyDigits(int number) {
        int result = 1;
        for (int i = number; i > 0; i /= 10) {
            result *= (i % 10);
        }
        return result;
    }

    private static int sumNumber(List<Integer> user) {
        return Math.max(
                sumDigits(user.get(LEFT_PAGE))
                , sumDigits(user.get(RIGHT_PAGE))
        );
    }

    private static int sumDigits(int number) {
        int result = 0;
        for (int i = number; i > 0; i /= 10) {
            result += (i % 10);
        }
        return result;
    }

    private static int decideWinner(int pobi, int crong) {

        if (pobi == crong) {
            return 0;
        }

        if (pobi > crong) {
            return 1;
        }

        return 2;
    }

    private static boolean isNotValidPage(List<Integer> user) {


        if (!isNextPage(user)) {
            return true;
        }

        if (!isValidPageRange(user)) {
            return true;
        }

        if (!isValidPageOrder(user)) {
            return true;
        }

        return false;
    }

    private static boolean isValidPageOrder(List<Integer> user) {
        int right = user.get(RIGHT_PAGE);
        int left = user.get(LEFT_PAGE);

        return (left % 2 == 1) && (right % 2 == 0);
    }

    private static boolean isValidPageRange(List<Integer> user) {

        int right = user.get(RIGHT_PAGE);
        int left = user.get(LEFT_PAGE);

        return (1 < left && left < 400) && (1 < right && right < 400);

    }

    private static boolean isNextPage(List<Integer> user) {

        return user.get(RIGHT_PAGE) - user.get(LEFT_PAGE) == 1;

    }
}