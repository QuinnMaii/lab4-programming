package characters;

public enum State {
    NEUTRAL, THINKING, UNCERTAIN, HAPPY, TIRED, ECSTATIC;

    public String describe() {
        switch (this) {
            case THINKING:
                return "THINKING";
            case UNCERTAIN:
                return "UNCERTAIN";
            case HAPPY:
                return "HAPPY";
            case TIRED:
                return "TIRED";
            case ECSTATIC:
                return "ECSTATIC";
            default:
                return "Neutral Condition";
        }
    }
}
