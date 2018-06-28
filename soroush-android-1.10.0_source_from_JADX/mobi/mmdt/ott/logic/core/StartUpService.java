package mobi.mmdt.ott.logic.core;

import android.app.IntentService;
import android.content.Intent;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.core.C2800c.C2799a;
import mobi.mmdt.ott.logic.notifications.notifsData.UpdateNotificationService;
import mobi.mmdt.ott.logic.vas.pray.C2922a;
import mobi.mmdt.ott.logic.vas.pray.praytimes.C2933d;
import mobi.mmdt.ott.p240c.C2526d.C2525a;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public class StartUpService extends IntentService {
    private C2535a f8828a;

    public StartUpService() {
        super("StartUpService");
    }

    public static void m7125a() {
        Intent intent = new Intent(MyApplication.m12952b(), StartUpService.class);
        intent.setAction("mobi.mmdt.ott.logic.action.ACTION_ON_BOOT");
        MyApplication.m12952b().startService(intent);
    }

    public static void m7126a(C2525a c2525a) {
        Intent intent = new Intent(MyApplication.m12952b(), StartUpService.class);
        intent.setAction("mobi.mmdt.ott.logic.action.ACTION_ON_CHAT_CONNECTION_STATE_CHANGED");
        intent.putExtra("mobi.mmdt.ott.logic.action.ACTION_ON_CHAT_CONNECTION_STATE_CHANGED", c2525a);
        MyApplication.m12952b().startService(intent);
    }

    public static void m7127b() {
        Intent intent = new Intent(MyApplication.m12952b(), StartUpService.class);
        intent.setAction("mobi.mmdt.ott.logic.action.ACTION_ON_SCREEN_TURNED_ON");
        MyApplication.m12952b().startService(intent);
    }

    public static void m7128c() {
        C2800c.m7135a().m7139b(C2799a.f8850b);
        Intent intent = new Intent(MyApplication.m12952b(), StartUpService.class);
        intent.setAction("mobi.mmdt.ott.logic.action.ACTION_ON_APPLICATION_STARTED");
        MyApplication.m12952b().startService(intent);
    }

    public static void m7129d() {
        Intent intent = new Intent(MyApplication.m12952b(), StartUpService.class);
        intent.setAction("mobi.mmdt.ott.logic.action.CONNECTIVITY_CHANGED");
        MyApplication.m12952b().startService(intent);
    }

    public static void m7130e() {
        Intent intent = new Intent(MyApplication.m12952b(), StartUpService.class);
        intent.setAction("mobi.mmdt.ott.logic.action.ACTION_ON_EXIT");
        MyApplication.m12952b().startService(intent);
    }

    public static void m7131f() {
        Intent intent = new Intent(MyApplication.m12952b(), StartUpService.class);
        intent.setAction("mobi.mmdt.ott.logic.action.ACTION_ON_APPLICATION_STARTED");
        MyApplication.m12952b().startService(intent);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    protected void onHandleIntent(Intent intent) {
        this.f8828a = C2535a.m6888a();
        if (intent != null) {
            String action = intent.getAction();
            StringBuilder stringBuilder = new StringBuilder("***************  onHandleIntent  action : ");
            stringBuilder.append(action);
            C2480b.m6742f(stringBuilder.toString());
            if ("mobi.mmdt.ott.logic.action.ACTION_ON_BOOT".equals(action)) {
                startService(new Intent(getApplicationContext(), UpdateNotificationService.class));
                try {
                    if (!this.f8828a.m6950i() && !this.f8828a.m6948h() && this.f8828a.m6952j() && C2474a.m6718b(getApplicationContext())) {
                        C2800c.m7135a().m7139b(C2799a.f8850b);
                    }
                } catch (Throwable e) {
                    C2480b.m6734a("Could not get application version!", e);
                }
            } else if ("mobi.mmdt.ott.logic.action.ACTION_ON_SCREEN_TURNED_ON".equals(action)) {
                C2800c.m7135a().m7139b(C2799a.f8850b);
            } else if ("mobi.mmdt.ott.logic.action.ACTION_ON_APPLICATION_STARTED".equals(action)) {
                try {
                    if (!this.f8828a.m6950i() && !this.f8828a.m6948h() && this.f8828a.m6952j() && C2474a.m6718b(getApplicationContext())) {
                        C2800c.m7135a().m7139b(C2799a.f8850b);
                    }
                    C2933d.m7313a();
                    C2933d.m7317b();
                    C2933d a = C2933d.m7313a();
                    C2922a.m7297a();
                    a.m7318a(C2922a.m7303g());
                } catch (Throwable e2) {
                    C2480b.m6734a("Could not get application version!", e2);
                }
                startService(new Intent(getApplicationContext(), UpdateNotificationService.class));
            } else if ("mobi.mmdt.ott.logic.action.CONNECTIVITY_CHANGED".equals(action)) {
                try {
                    if (this.f8828a.m6950i() || this.f8828a.m6948h() || !this.f8828a.m6952j() || !C2474a.m6718b(getApplicationContext())) {
                        C2795a.m7133b();
                    } else {
                        C2800c.m7135a().m7139b(C2799a.f8850b);
                    }
                } catch (Throwable e22) {
                    C2480b.m6734a("Could not get application version!", e22);
                }
            } else if ("mobi.mmdt.ott.logic.action.ACTION_ON_EXIT".equals(action)) {
                C2795a.m7133b();
            } else if ("mobi.mmdt.ott.logic.action.ACTION_ON_CHAT_CONNECTION_STATE_CHANGED".equals(action) && ((C2525a) intent.getSerializableExtra("mobi.mmdt.ott.logic.action.ACTION_ON_CHAT_CONNECTION_STATE_CHANGED")).equals(C2525a.DISCONNECTED_ON_ERROR)) {
                C2800c.m7135a().m7139b(C2799a.f8850b);
            }
        }
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        Thread thread = new Thread(new Runnable(this) {
            final /* synthetic */ StartUpService f8827b;

            public final void run() {
                if (intent == null) {
                    StartUpService.m7131f();
                } else {
                    this.f8827b.onHandleIntent(intent);
                }
            }
        });
        thread.setPriority(1);
        thread.start();
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        m7128c();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
