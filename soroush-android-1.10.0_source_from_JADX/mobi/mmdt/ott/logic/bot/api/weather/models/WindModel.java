package mobi.mmdt.ott.logic.bot.api.weather.models;

public class WindModel {
    private int chill;
    private int direction;
    private int speed;

    public WindModel(int i, int i2, int i3) {
        this.chill = i;
        this.direction = i2;
        this.speed = i3;
    }

    public int getChill() {
        return this.chill;
    }

    public int getDirection() {
        return this.direction;
    }

    public int getSpeed() {
        return this.speed;
    }
}
