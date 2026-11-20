package onboarding.problem4;

public class Problem4 {
    public static String solution(String word) {
        StringBuilder sb = new StringBuilder();
        for(char c : word.toCharArray()){
            if('a' <= c && c <= 'z'){
                char s = (char) (('z' - c) + 'a');
                sb.append(s);
                continue;
            }
            if('A' <= c && c <= 'Z'){
                char s = (char) (('Z' - c) + 'A');
                sb.append(s);
                continue;
            }
            sb.append(c);
        }

        return sb.toString();
    }

}
