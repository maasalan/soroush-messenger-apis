package mobi.mmdt.ott.logic.vas.pray.praytimes;

import android.app.IntentService;
import android.content.Intent;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.vas.pray.C2922a;

public class SetAlarmService extends IntentService {
    public SetAlarmService() {
        super(SetAlarmService.class.getName());
    }

    protected void onHandleIntent(Intent intent) {
        C2480b.m6732a("onHandleIntentPray Time Set Alarm Every day");
        C2933d a = C2933d.m7313a();
        C2922a.m7297a();
        a.m7318a(C2922a.m7303g());
    }
}
