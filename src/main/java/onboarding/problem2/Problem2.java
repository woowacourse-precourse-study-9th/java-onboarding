package onboarding.problem2;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        validate(cryptogram);
        
        return answer;
    }

    private static void validate(String s){
        if(s == null || s.isBlank()){
            throw new StringException(StringErrorMessage.NullOrEmptyError);
        }
        if(s.length() > 1000){
            throw new StringException(StringErrorMessage.LengthError);
        }
        if(isContainCapital(s)){
            throw new StringException(StringErrorMessage.CapitalError);
        }
    }

    private static boolean isContainCapital(String s) {
        return s.chars()
                .allMatch(c -> 'a' <= c && c <= 'z');
    }
}
