package mobi.mmdt.ott.view.conversation.emojisticker;

import android.view.View;
import mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.emoji.Emojicon;

public abstract class C4010a {
    protected C4009a f11540a;

    public interface C4009a {
        void mo2365a(int i, int i2, int i3, String str);

        void mo2366a(Emojicon emojicon);
    }

    public abstract View mo2368a();

    public final void m7893a(C4009a c4009a) {
        this.f11540a = c4009a;
    }

    public abstract int mo2370b();
}
