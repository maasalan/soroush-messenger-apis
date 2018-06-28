package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1715e.C1713a;
import com.google.android.gms.common.api.C1715e.C1714b;
import com.google.android.gms.common.internal.C1763l;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.aw;
import java.util.Set;

public final class C1708a<O extends C1704a> {
    public final C5445b<?, O> f5211a;
    public final C5447g<?> f5212b;
    public final String f5213c;
    private final C5449i<?, O> f5214d = null;
    private final C5450j<?> f5215e;

    public interface C1704a {

        public interface C5443c extends C1704a {
        }

        public interface C5444d extends C1704a {
        }

        public interface C6571a extends C5443c, C5444d {
            Account m15873a();
        }

        public interface C6572b extends C5443c {
            GoogleSignInAccount m15874a();
        }

        public interface C6573e extends C5443c, C5444d {
        }
    }

    public interface C1705c {
    }

    public static class C1706d<C extends C1705c> {
    }

    public static abstract class C1707e<T extends C1705c, O> {
    }

    public static abstract class C5445b<T extends C5446f, O> extends C1707e<T, O> {
        public abstract T mo3026a(Context context, Looper looper, aw awVar, O o, C1713a c1713a, C1714b c1714b);
    }

    public interface C5446f extends C1705c {
        void m11752a();

        void m11753a(ao aoVar);

        void m11754a(au auVar);

        void m11755a(C1763l c1763l, Set<Scope> set);

        boolean m11756b();

        boolean m11757c();

        boolean mo3413d();
    }

    public static final class C5447g<C extends C5446f> extends C1706d<C> {
    }

    public interface C5448h<T extends IInterface> extends C1705c {
    }

    public static abstract class C5449i<T extends C5448h, O> extends C1707e<T, O> {
    }

    public static final class C5450j<C extends C5448h> extends C1706d<C> {
    }

    public <C extends C5446f> C1708a(String str, C5445b<C, O> c5445b, C5447g<C> c5447g) {
        ac.m4377a((Object) c5445b, (Object) "Cannot construct an Api with a null ClientBuilder");
        ac.m4377a((Object) c5447g, (Object) "Cannot construct an Api with a null ClientKey");
        this.f5213c = str;
        this.f5211a = c5445b;
        this.f5212b = c5447g;
        this.f5215e = null;
    }
}
