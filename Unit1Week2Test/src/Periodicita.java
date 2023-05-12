
public enum Periodicita {
    SETTIMANALE,
    MENSILE,
    SEMESTRALE;

    @Override
    public String toString() {
        switch (this) {
            case SETTIMANALE:
                return "Settimanale";
            case MENSILE:
                return "Mensile";
            case SEMESTRALE:
                return "Semestrale";
            default:
                return "";
        }
    }
}
