package onboarding.problem2;

public class Problem2 {
    public static String solution(String cryptogram) {
        validate(cryptogram);

        String answer = cryptogram;
        char lastChar;
        boolean hasDuplicate = true;
        StringBuilder sb = new StringBuilder();

        while (hasDuplicate) {
            lastChar = ' ';
            for (char c : answer.toCharArray()) {
                if (isDuplicate(c, sb)) {
                    sb.deleteCharAt(sb.length() - 1);
                    lastChar = c;
                    continue;
                }
                if (isSameWithLastChar(c, lastChar)) {
                    continue;
                }
                lastChar = c;
                sb.append(c);
            }
            if (answer.equals(sb.toString())) {
                hasDuplicate = false;
            }
            answer = sb.toString();
            sb.delete(0, sb.length());
        }

        return answer;
    }

    private static boolean isSameWithLastChar(char c, char lastChar) {
        return lastChar == c;
    }

    private static boolean isDuplicate(char c, StringBuilder sb) {
        return sb.length() > 0 && sb.charAt(sb.length() - 1) == c;
    }


    private static void validate(String s) {
        if (s == null || s.isBlank()) {
            throw new StringException(StringErrorMessage.NullOrEmptyError);
        }
        if (s.length() > 1000) {
            throw new StringException(StringErrorMessage.LengthError);
        }
        if (isContainCapital(s)) {
            throw new StringException(StringErrorMessage.CapitalError);
        }
    }

    private static boolean isContainCapital(String s) {
        return s.chars()
                .anyMatch(c -> 'z' < c || c < 'a');
    }
}
