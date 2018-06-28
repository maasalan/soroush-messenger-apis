package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class Stars {
    @C1902a
    @C1904c(a = "Five")
    private int mFive;
    @C1902a
    @C1904c(a = "Four")
    private int mFour;
    @C1902a
    @C1904c(a = "One")
    private int mOne;
    @C1902a
    @C1904c(a = "Three")
    private int mThree;
    @C1902a
    @C1904c(a = "Two")
    private int mTwo;

    public Stars(int i, int i2, int i3, int i4, int i5) {
        this.mOne = i;
        this.mThree = i3;
        this.mTwo = i2;
        this.mFour = i4;
        this.mFive = i5;
    }

    public int getmFive() {
        return this.mFive;
    }

    public int getmFour() {
        return this.mFour;
    }

    public int getmOne() {
        return this.mOne;
    }

    public int getmThree() {
        return this.mThree;
    }

    public int getmTwo() {
        return this.mTwo;
    }
}
