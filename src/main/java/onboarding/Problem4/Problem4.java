package onboarding.Problem4;

public class Problem4 {
    private final static int LOWER_START = 'a';
    private final static int UPPER_START = 'A';
    private final static int LOWER_END = 'z';
    private final static int UPPER_END = 'Z';

    public static String solution(String word) {

        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {

            sb.append(reverseAlphabet(c));

        }

        return  sb.toString();

    }
    private static char reverseAlphabet(char c) {
        if (isUpperCase(c)) {
            return (char) (UPPER_END - (c - UPPER_START));
        }
        if (isLowerCase(c)) {
            return (char) (LOWER_END - (c - LOWER_START));
        }
        return c;
    }

    private static boolean isLowerCase(char c) {
        return LOWER_START <= c && c <= LOWER_END;
    }

    private static boolean isUpperCase(char c) {
        return UPPER_START <= c && c <= UPPER_END;
    }
}
