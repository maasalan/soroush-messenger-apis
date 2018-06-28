package mobi.mmdt.ott.logic.bot.api.weather.models;

public enum RisingState {
    STEADY(0),
    RISING(1),
    FALLING(2);
    
    private int state;

    private RisingState(int i) {
        this.state = i;
    }

    public static RisingState getRisingState(int i) {
        for (RisingState risingState : values()) {
            if (risingState.getState() == i) {
                return risingState;
            }
        }
        return null;
    }

    public final int getState() {
        return this.state;
    }
}
