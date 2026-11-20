package onboarding.problem4;

public class StringException extends IllegalArgumentException {
    public StringException(StringErrorMessage message) {
        super(message.getMessage());
    }
}
