package onboarding.Problem2;


public class Problem2 {

    public static String solution(String cryptogram) {



        String before = cryptogram;
        String after = findDuplication(before);
        while(isNotSameLen(before, after)){
            before = after;
            after = findDuplication(before);
        }

        return after;
    }

    private static boolean isNotSameLen(String before, String after) {
        return before.length() != after.length();
    }

    private static String findDuplication(String text) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            appendIfNotDuplicate(text, i, sb);

        }

        return sb.toString();
    }

    private static void appendIfNotDuplicate(String text, int i, StringBuilder sb) {

        if (!isDuplicate(text, i)) {
            sb.append(text.charAt(i));
        }

    }

    private static boolean isDuplicate(String text, int i) {
        return isSameNext(text, i) || isSamePrevious(text, i);
    }

    private static boolean isSamePrevious(String text, int i) {
        return i > 0 && text.charAt(i - 1) == text.charAt(i);
    }

    private static boolean isSameNext(String text, int i) {
        return i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1);
    }
}
