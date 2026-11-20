package onboarding.problem4;

public class Problem4 {
    public static String solution(String word) {
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

}
