package onboarding.problem2;

public class StringException extends IllegalArgumentException {
    public StringException(StringErrorMessage message) {
        super(message.getMessage());
    }
}
