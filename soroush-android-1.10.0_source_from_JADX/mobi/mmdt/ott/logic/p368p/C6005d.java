package mobi.mmdt.ott.logic.p368p;

import android.content.Intent;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.p281e.p282a.C2635a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.call.CallActivity;
import mobi.mmdt.ott.view.conversation.C3290a;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCall.State;
import org.linphone.core.LinphoneCore.RegistrationState;
import org.linphone.customized.CustomizedCallManager.AudioAction;
import org.linphone.customized.ICustomizedListener;
import p000a.p001a.p002a.C0005c;

public final class C6005d implements ICustomizedListener {
    public final String onAudioStateChanged(AudioAction audioAction, boolean z) {
        return null;
    }

    public final String onCallStateChanged(LinphoneCall linphoneCall, State state, String str) {
        StringBuilder stringBuilder = new StringBuilder("Call State: ");
        stringBuilder.append(state);
        C2480b.m6732a(stringBuilder.toString());
        C2881b c2881b = state.equals(State.CallEnd) ? C2881b.f9006n : state.equals(State.CallIncomingEarlyMedia) ? C2881b.f9009q : state.equals(State.CallReleased) ? C2881b.f9011s : state.equals(State.CallUpdatedByRemote) ? C2881b.f9008p : state.equals(State.CallUpdating) ? C2881b.f9010r : state.equals(State.Connected) ? C2881b.f8999g : state.equals(State.Error) ? C2881b.f9005m : state.equals(State.Idle) ? C2881b.f8993a : state.equals(State.IncomingReceived) ? C2881b.f8994b : state.equals(State.OutgoingEarlyMedia) ? C2881b.f8998f : state.equals(State.OutgoingInit) ? C2881b.f8995c : state.equals(State.OutgoingProgress) ? C2881b.f8996d : state.equals(State.OutgoingRinging) ? C2881b.f8997e : state.equals(State.Paused) ? C2881b.f9002j : state.equals(State.PausedByRemote) ? C2881b.f9007o : state.equals(State.Pausing) ? C2881b.f9001i : state.equals(State.Refered) ? C2881b.f9004l : state.equals(State.Resuming) ? C2881b.f9003k : state.equals(State.StreamsRunning) ? C2881b.f9000h : null;
        if (c2881b == C2881b.f8994b) {
            C6004c.m13279a();
            String d = C6004c.m13280d();
            Intent intent = new Intent(MyApplication.m12952b(), CallActivity.class);
            intent.putExtra("key_contact_user_id_string", d);
            intent.putExtra("key_start_mode", C3290a.RINGING.ordinal());
            intent.setFlags(268435456);
            MyApplication.m12952b().startActivity(intent);
        }
        if (!state.equals(State.CallReleased)) {
            C0005c.m0a().m9d(new C2635a(c2881b, str, null));
        }
        return null;
    }

    public final String onRegistrationStateChanged(RegistrationState registrationState, String str) {
        StringBuilder stringBuilder = new StringBuilder("onRegistrationStateChanged    : ");
        stringBuilder.append(registrationState.toString());
        C2480b.m6742f(stringBuilder.toString());
        if (registrationState.equals(RegistrationState.RegistrationFailed)) {
            C2535a.m6888a().m6969s(true);
        }
        return null;
    }
}
