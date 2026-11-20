package onboarding.problem3;

public class NumberException extends IllegalArgumentException {
    public NumberException(NumberErrorMessage message) {
        super(message.getMessage());
    }
}
