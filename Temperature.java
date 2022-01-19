package places;

public enum Temperature {
    WARM, COLD;

    public String describe() {
        switch(this) {
            case COLD:
                return "cold";
            default:
                return "warm";
        }
    }
}
