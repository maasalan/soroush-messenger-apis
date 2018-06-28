package android.arch.lifecycle;

import android.arch.lifecycle.C0093d.C0091a;
import android.arch.lifecycle.C0093d.C0092b;
import android.arch.p017a.p019b.C0082b;
import android.arch.p017a.p019b.C0082b.C0080c;
import android.arch.p017a.p019b.C0082b.C6331b;
import android.arch.p017a.p019b.C4674a;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public final class C4679h extends C0093d {
    private C4674a<C0095f, C0098a> f12873a = new C4674a();
    private C0092b f12874b;
    private final WeakReference<C0096g> f12875c;
    private int f12876d = 0;
    private boolean f12877e = false;
    private boolean f12878f = false;
    private ArrayList<C0092b> f12879g = new ArrayList();

    static class C0098a {
        C0092b f389a;
        GenericLifecycleObserver f390b;

        C0098a(C0095f c0095f, C0092b c0092b) {
            this.f390b = C0099j.m174a((Object) c0095f);
            this.f389a = c0092b;
        }

        final void m173a(C0096g c0096g, C0091a c0091a) {
            C0092b b = C4679h.m8536b(c0091a);
            this.f389a = C4679h.m8534a(this.f389a, b);
            this.f390b.mo2476a(c0096g, c0091a);
            this.f389a = b;
        }
    }

    public C4679h(C0096g c0096g) {
        this.f12875c = new WeakReference(c0096g);
        this.f12874b = C0092b.INITIALIZED;
    }

    static C0092b m8534a(C0092b c0092b, C0092b c0092b2) {
        return (c0092b2 == null || c0092b2.compareTo(c0092b) >= 0) ? c0092b : c0092b2;
    }

    private void m8535a(C0096g c0096g) {
        Iterator a = this.f12873a.m135a();
        while (a.hasNext() && !this.f12878f) {
            Entry entry = (Entry) a.next();
            C0098a c0098a = (C0098a) entry.getValue();
            while (c0098a.f389a.compareTo(this.f12874b) < 0 && !this.f12878f && this.f12873a.m8526c(entry.getKey())) {
                m8538b(c0098a.f389a);
                c0098a.m173a(c0096g, C4679h.m8539c(c0098a.f389a));
                m8537b();
            }
        }
    }

    static C0092b m8536b(C0091a c0091a) {
        switch (c0091a) {
            case ON_CREATE:
            case ON_STOP:
                return C0092b.CREATED;
            case ON_START:
            case ON_PAUSE:
                return C0092b.STARTED;
            case ON_RESUME:
                return C0092b.RESUMED;
            case ON_DESTROY:
                return C0092b.DESTROYED;
            default:
                StringBuilder stringBuilder = new StringBuilder("Unexpected event value ");
                stringBuilder.append(c0091a);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private void m8537b() {
        this.f12879g.remove(this.f12879g.size() - 1);
    }

    private void m8538b(C0092b c0092b) {
        this.f12879g.add(c0092b);
    }

    private static C0091a m8539c(C0092b c0092b) {
        switch (c0092b) {
            case INITIALIZED:
            case DESTROYED:
                return C0091a.ON_CREATE;
            case CREATED:
                return C0091a.ON_START;
            case STARTED:
                return C0091a.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder("Unexpected state value ");
                stringBuilder.append(c0092b);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private C0092b m8540c(C0095f c0095f) {
        C4674a c4674a = this.f12873a;
        C0092b c0092b = null;
        Entry entry = c4674a.m8526c(c0095f) ? ((C0080c) c4674a.f12866a.get(c0095f)).f352d : null;
        C0092b c0092b2 = entry != null ? ((C0098a) entry.getValue()).f389a : null;
        if (!this.f12879g.isEmpty()) {
            c0092b = (C0092b) this.f12879g.get(this.f12879g.size() - 1);
        }
        return C4679h.m8534a(C4679h.m8534a(this.f12874b, c0092b2), c0092b);
    }

    private void m8541c() {
        C0096g c0096g = (C0096g) this.f12875c.get();
        if (c0096g == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (true) {
            C0092b c0092b;
            boolean z = true;
            if (this.f12873a.f356e != 0) {
                C0092b c0092b2 = ((C0098a) this.f12873a.f353b.getValue()).f389a;
                c0092b = ((C0098a) this.f12873a.f354c.getValue()).f389a;
                if (c0092b2 != c0092b || this.f12874b != c0092b) {
                    z = false;
                }
            }
            if (z) {
                this.f12878f = false;
                return;
            }
            Entry entry;
            this.f12878f = false;
            if (this.f12874b.compareTo(((C0098a) this.f12873a.f353b.getValue()).f389a) < 0) {
                C0082b c0082b = this.f12873a;
                Iterator c6331b = new C6331b(c0082b.f354c, c0082b.f353b);
                c0082b.f355d.put(c6331b, Boolean.valueOf(false));
                while (c6331b.hasNext() && !this.f12878f) {
                    entry = (Entry) c6331b.next();
                    C0098a c0098a = (C0098a) entry.getValue();
                    while (c0098a.f389a.compareTo(this.f12874b) > 0 && !this.f12878f && this.f12873a.m8526c(entry.getKey())) {
                        C0091a c0091a;
                        c0092b = c0098a.f389a;
                        switch (c0092b) {
                            case INITIALIZED:
                                throw new IllegalArgumentException();
                            case CREATED:
                                c0091a = C0091a.ON_DESTROY;
                                break;
                            case STARTED:
                                c0091a = C0091a.ON_STOP;
                                break;
                            case RESUMED:
                                c0091a = C0091a.ON_PAUSE;
                                break;
                            case DESTROYED:
                                throw new IllegalArgumentException();
                            default:
                                StringBuilder stringBuilder = new StringBuilder("Unexpected state value ");
                                stringBuilder.append(c0092b);
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        m8538b(C4679h.m8536b(c0091a));
                        c0098a.m173a(c0096g, c0091a);
                        m8537b();
                    }
                }
            }
            entry = this.f12873a.f354c;
            if (!(this.f12878f || entry == null || this.f12874b.compareTo(((C0098a) entry.getValue()).f389a) <= 0)) {
                m8535a(c0096g);
            }
        }
    }

    public final C0092b mo33a() {
        return this.f12874b;
    }

    public final void m8543a(C0091a c0091a) {
        m8544a(C4679h.m8536b(c0091a));
    }

    public final void m8544a(C0092b c0092b) {
        if (this.f12874b != c0092b) {
            this.f12874b = c0092b;
            if (!this.f12877e) {
                if (this.f12876d == 0) {
                    this.f12877e = true;
                    m8541c();
                    this.f12877e = false;
                    return;
                }
            }
            this.f12878f = true;
        }
    }

    public final void mo34a(C0095f c0095f) {
        C0098a c0098a = new C0098a(c0095f, this.f12874b == C0092b.DESTROYED ? C0092b.DESTROYED : C0092b.INITIALIZED);
        if (((C0098a) this.f12873a.mo24a(c0095f, c0098a)) == null) {
            C0096g c0096g = (C0096g) this.f12875c.get();
            if (c0096g != null) {
                int i;
                Enum c;
                if (this.f12876d == 0) {
                    if (!this.f12877e) {
                        i = 0;
                        c = m8540c(c0095f);
                        this.f12876d++;
                        while (c0098a.f389a.compareTo(c) < 0 && this.f12873a.m8526c(c0095f)) {
                            m8538b(c0098a.f389a);
                            c0098a.m173a(c0096g, C4679h.m8539c(c0098a.f389a));
                            m8537b();
                            c = m8540c(c0095f);
                        }
                        if (i == 0) {
                            m8541c();
                        }
                        this.f12876d--;
                    }
                }
                i = 1;
                c = m8540c(c0095f);
                this.f12876d++;
                while (c0098a.f389a.compareTo(c) < 0) {
                    m8538b(c0098a.f389a);
                    c0098a.m173a(c0096g, C4679h.m8539c(c0098a.f389a));
                    m8537b();
                    c = m8540c(c0095f);
                }
                if (i == 0) {
                    m8541c();
                }
                this.f12876d--;
            }
        }
    }

    public final void mo35b(C0095f c0095f) {
        this.f12873a.mo25b(c0095f);
    }
}
