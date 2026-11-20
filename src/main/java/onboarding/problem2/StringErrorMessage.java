package onboarding.problem2;

public enum StringErrorMessage {
    NullOrEmptyError("null값 또는 빈값은 들어올수 없습니다."),
    LengthError("문자열의 길이는 1이상 1000이하만 가능합니다."),
    CapitalError("문자열에는 소문자만 가능합니다.");

    private String message;

    StringErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
