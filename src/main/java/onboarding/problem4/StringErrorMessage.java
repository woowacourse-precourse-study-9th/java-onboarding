package onboarding.problem4;

public enum StringErrorMessage {
    NULL_ERROR("null값을 입력할 수 없습니다."),
    EMPTY_ERROR("빈값을 입력할 수 없습니다."),
    NOT_IN_RANGE_ERROR("문자열의 길이는 1이상 1,000이하만 가능합니다.");

    private String message;

    StringErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
