package onboarding.problem1;

import java.util.List;

public class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        long pobiMax = getMaxInList(pobi);
        long crongMax = getMaxInList(crong);

        if (pobiMax > crongMax) {
            return 1;
        }
        if (crongMax > pobiMax) {
            return 2;
        }

        return 0;
    }

    private static long getMaxInList(List<Integer> list) {
        long leftMax = getPageMax(list.get(0));
        long rightMax = getPageMax(list.get(1));

        return Math.max(leftMax, rightMax);
    }

    private static long getPageMax(Integer pageNumber) {
        long pageDigitSum = digitSum(pageNumber);
        long pageDigitMultiply = digitMultiply(pageNumber);

        return Math.max(pageDigitMultiply, pageDigitSum);
    }

    private static long digitMultiply(Integer pageNumber) {
        return pageNumber.toString()
                .chars()
                .map(c -> c - '0')
                .reduce(1, (a, b) -> a * b);
    }

    private static long digitSum(Integer pageNumber) {
        return pageNumber.toString()
                .chars()
                .map(c -> c - '0')
                .sum();
    }

}