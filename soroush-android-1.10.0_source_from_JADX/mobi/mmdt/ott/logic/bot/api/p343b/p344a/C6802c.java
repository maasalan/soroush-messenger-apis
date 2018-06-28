package mobi.mmdt.ott.logic.bot.api.p343b.p344a;

import com.p072b.p073a.p074a.C1073q;
import java.util.HashMap;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.bot.api.C2785b;
import mobi.mmdt.ott.logic.bot.api.p343b.C2784a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.p366o.p367a.C2878a;
import org.apache.p493a.p494a.p496b.C4607a;
import org.jivesoftware.smack.util.StringUtils;
import org.json.JSONObject;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import p000a.p001a.p002a.C0005c;

public final class C6802c extends C5891a {
    private String f19423a;
    private String f19424b;
    private int f19425c;
    private String f19426d;
    private String f19427e;
    private boolean f19428f = false;

    public C6802c(String str, String str2, int i, String str3, String str4) {
        super(C2683h.f8620b);
        this.f19423a = str;
        this.f19424b = str2;
        this.f19425c = i;
        this.f19426d = str3;
        this.f19427e = str4;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2784a c5980a = new C5980a("CALL_FEEDBACK", this.f19423a, this.f19424b, this.f19425c, this.f19426d, this.f19427e);
        String a = C2483a.m6744a(MyApplication.m12952b());
        JSONObject a2 = c5980a.m7097a();
        MessageBufferPacker newDefaultBufferPacker = MessagePack.newDefaultBufferPacker();
        C2785b.m7100a(newDefaultBufferPacker, a2);
        newDefaultBufferPacker.close();
        byte[] a3 = C4607a.m8347a(newDefaultBufferPacker.toByteArray());
        Map hashMap = new HashMap();
        C5996e.m13260a().f16147a.m7106b("report@api.soroush", new String(a3, StringUtils.UTF8), a, hashMap);
        if (this.f19425c == 5 && C2878a.m7235c()) {
            this.f19428f = true;
        }
        C0005c.m0a().m9d(new C2783b(this.f19428f));
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
