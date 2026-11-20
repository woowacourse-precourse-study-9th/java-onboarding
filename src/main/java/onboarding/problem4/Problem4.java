package onboarding.problem4;

public class Problem4 {
    public static String solution(String word) {
        validate(word);
        StringBuilder sb = new StringBuilder();
        for(char c : word.toCharArray()){
            sb.append(reverse(c));
        }

        return sb.toString();
    }
    private static char reverse(char c){
        if('a' <= c && c <= 'z'){
            return (char) (('z' - c) + 'a');
        }
        if('A' <= c && c <= 'Z'){
            return (char) (('Z' - c) + 'A');
        }

        return c;
    }

    private static void validate(String word){
        if(word == null){
            throw new StringException(StringErrorMessage.NULL_ERROR);
        }
        if(word.isBlank()){
            throw new StringException(StringErrorMessage.EMPTY_ERROR);
        }
        int length = word.length();
        if(1_000 < length){
           throw new StringException(StringErrorMessage.NOT_IN_RANGE_ERROR);
        }
    }

}
