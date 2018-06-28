package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.support.v4.app.ai.C0378a;

final class ah {
    static RemoteInput[] m740a(C0378a[] c0378aArr) {
        if (c0378aArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[c0378aArr.length];
        for (int i = 0; i < c0378aArr.length; i++) {
            C0378a c0378a = c0378aArr[i];
            remoteInputArr[i] = new Builder(c0378a.mo227a()).setLabel(c0378a.mo228b()).setChoices(c0378a.mo229c()).setAllowFreeFormInput(c0378a.mo231e()).addExtras(c0378a.mo232f()).build();
        }
        return remoteInputArr;
    }
}
