package onboarding.problem1;

import java.util.List;

public class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if(validateList(pobi) == false || validateList(crong) == false){
            return -1;
        }

        int pobiMax = getMaxInList(pobi);
        int crongMax = getMaxInList(crong);

        if (pobiMax > crongMax) {
            return 1;
        }
        if (crongMax > pobiMax) {
            return 2;
        }

        return 0;
    }

    private static boolean validateList(List<Integer> list){
        int leftPage = list.get(0);
        int rightPage = list.get(1);

        if(leftPage %2 == 1 && rightPage - leftPage == 1 && leftPage > 1 && rightPage < 400){
            return true;
        }

        return false;
    }

    private static int getMaxInList(List<Integer> list) {
        int leftMax = getPageMax(list.get(0));
        int rightMax = getPageMax(list.get(1));

        return Math.max(leftMax, rightMax);
    }

    private static int getPageMax(Integer pageNumber) {
        int pageDigitSum = digitSum(pageNumber);
        int pageDigitMultiply = digitMultiply(pageNumber);

        return Math.max(pageDigitMultiply, pageDigitSum);
    }

    private static int digitMultiply(Integer pageNumber) {
        return pageNumber.toString()
                .chars()
                .map(c -> c - '0')
                .reduce(1, (a, b) -> a * b);
    }

    private static int digitSum(Integer pageNumber) {
        return pageNumber.toString()
                .chars()
                .map(c -> c - '0')
                .sum();
    }

}