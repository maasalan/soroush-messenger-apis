package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class C4118i {
    public static final C4118i f11791f = new C4118i();
    volatile String f11792a;
    final VideoInfo f11793b = new VideoInfo();
    WeakHashMap<String, VideoView> f11794c = new WeakHashMap();
    Map<String, C4113d> f11795d = new ConcurrentHashMap();
    WeakHashMap<Context, String> f11796e = new WeakHashMap();
    private ActivityLifecycleCallbacks f11797g;

    class C41171 implements ActivityLifecycleCallbacks {
        final /* synthetic */ C4118i f11790a;

        C41171(C4118i c4118i) {
            this.f11790a = c4118i;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            C4113d b = this.f11790a.m7990b();
            if (b != null) {
                b.m7965a("onActivityDestroyed");
                b.m7967b();
            }
            this.f11790a.f11796e.remove(activity);
        }

        public final void onActivityPaused(Activity activity) {
            C4113d b = this.f11790a.m7991b((String) this.f11790a.f11796e.get(activity));
            if (b != null) {
                b.m7965a("onActivityPaused");
                if (b.f11759d == 3 || b.f11758c == 3 || b.f11759d == 4 || b.f11758c == 4) {
                    if (b.f11760e != null) {
                        b.f11764i = (int) b.f11760e.getCurrentPosition();
                    }
                    b.m7964a();
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
            C4113d b = this.f11790a.m7991b((String) this.f11790a.f11796e.get(activity));
            if (b != null) {
                b.m7965a("onActivityResumed");
                if (b.f11759d == 3) {
                    b.start();
                } else if (b.f11759d == 4 && b.f11757b && b.f11764i >= 0) {
                    b.seekTo(b.f11764i);
                }
            }
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    public static C4118i m7985a() {
        return f11791f;
    }

    static void m7986a(String str, String str2) {
        if (C4113d.f11756a) {
            Log.d("GiraffePlayerManager", String.format("[setFingerprint:%s] %s", new Object[]{str, str2}));
        }
    }

    public final VideoView m7987a(VideoInfo videoInfo) {
        return (VideoView) this.f11794c.get(videoInfo.f11700d);
    }

    final synchronized void m7988a(Application application) {
        if (this.f11797g == null) {
            this.f11797g = new C41171(this);
            application.registerActivityLifecycleCallbacks(this.f11797g);
        }
    }

    public final boolean m7989a(String str) {
        return str != null && str.equals(this.f11792a);
    }

    public final C4113d m7990b() {
        return this.f11792a == null ? null : (C4113d) this.f11795d.get(this.f11792a);
    }

    public final C4113d m7991b(String str) {
        return str == null ? null : (C4113d) this.f11795d.get(str);
    }

    public final C4118i m7992c(String str) {
        C4113d c4113d = (C4113d) this.f11795d.get(str);
        if (c4113d != null) {
            c4113d.m7967b();
        }
        return this;
    }

    public final void m7993d(String str) {
        this.f11795d.remove(str);
    }
}
