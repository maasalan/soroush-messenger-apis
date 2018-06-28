package mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.C4027a;

public class Emojicon implements Parcelable {
    public static final Creator<Emojicon> CREATOR = new C40291();
    public int f11576a = C4030a.f11583a;
    public int f11577b = 0;
    public char f11578c = '\u0000';
    public String f11579d = null;
    public int f11580e;
    public String f11581f;
    private char f11582g;

    static class C40291 implements Creator<Emojicon> {
        C40291() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Emojicon(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Emojicon[i];
        }
    }

    private Emojicon() {
    }

    public Emojicon(Parcel parcel) {
        this.f11580e = parcel.readInt();
        this.f11582g = (char) parcel.readInt();
        this.f11581f = parcel.readString();
    }

    public static Emojicon m7907a(char c) {
        Emojicon emojicon = new Emojicon();
        emojicon.f11576a = C4030a.f11583a;
        emojicon.f11578c = c;
        emojicon.f11581f = Character.toString(c);
        emojicon.f11580e = C4027a.f11565b.get(c);
        return emojicon;
    }

    public static Emojicon m7908a(int i) {
        Emojicon emojicon = new Emojicon();
        emojicon.f11576a = C4030a.f11585c;
        emojicon.f11577b = i;
        emojicon.f11581f = Character.charCount(i) == 1 ? String.valueOf(i) : new String(Character.toChars(i));
        emojicon.f11580e = C4027a.f11565b.get(i);
        return emojicon;
    }

    public static Emojicon m7909a(String str) {
        Emojicon emojicon = new Emojicon();
        emojicon.f11576a = C4030a.f11584b;
        emojicon.f11581f = str;
        emojicon.f11579d = str;
        if (C4027a.f11564a.containsKey(str)) {
            emojicon.f11580e = ((Integer) C4027a.f11564a.get(str)).intValue();
        }
        return emojicon;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Emojicon) && this.f11581f.equals(((Emojicon) obj).f11581f);
    }

    public int hashCode() {
        return this.f11581f.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11580e);
        parcel.writeInt(this.f11582g);
        parcel.writeString(this.f11581f);
    }
}
