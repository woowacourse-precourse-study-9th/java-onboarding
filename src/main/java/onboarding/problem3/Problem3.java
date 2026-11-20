package onboarding.problem3;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        validate(number);
        for(int i = 0; i<= number; i++){
            String numberToString = String.valueOf(number-i);
            for(char digit : numberToString.toCharArray()){
                if(digit == '3' || digit == '6' || digit == '9'){
                    answer++;
                }
            }
        }

        return answer;
    }
    private static void validate(int number){
        if(number < 1 || 10_000 < number){
            throw new NumberException(NumberErrorMessage.NOT_IN_RANGE_ERROR);
        }
    }

}
