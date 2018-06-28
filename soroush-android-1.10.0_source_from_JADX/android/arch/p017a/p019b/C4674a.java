package android.arch.p017a.p019b;

import android.arch.p017a.p019b.C0082b.C0080c;
import java.util.HashMap;

public final class C4674a<K, V> extends C0082b<K, V> {
    public HashMap<K, C0080c<K, V>> f12866a = new HashMap();

    protected final C0080c<K, V> mo23a(K k) {
        return (C0080c) this.f12866a.get(k);
    }

    public final V mo24a(K k, V v) {
        C0080c a = mo23a(k);
        if (a != null) {
            return a.f350b;
        }
        this.f12866a.put(k, m137b(k, v));
        return null;
    }

    public final V mo25b(K k) {
        V b = super.mo25b(k);
        this.f12866a.remove(k);
        return b;
    }

    public final boolean m8526c(K k) {
        return this.f12866a.containsKey(k);
    }
}
