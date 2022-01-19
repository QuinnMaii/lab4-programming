package places;

public enum Intensity {
    STRONG, WEAK;

    public String describe() {
        switch(this) {
            case STRONG:
                return "strong";
            default:
                return "weak current";
        }
    }
}
