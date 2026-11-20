package onboarding.problem3;

public enum NumberErrorMessage {
    NOT_IN_RANGE_ERROR("숫자는 1이상 10,000이하만 가능합니다.");
    private String message;

    NumberErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
