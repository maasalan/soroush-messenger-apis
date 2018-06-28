package org.jivesoftware.smackx.iot;

import java.util.logging.Logger;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.iot.provisioning.IoTProvisioningManager;

public abstract class IoTManager extends Manager {
    private static final Logger LOGGER = Logger.getLogger(IoTManager.class.getName());
    private static boolean autoEnable;
    private boolean allowNonFriends;
    private final IoTProvisioningManager ioTProvisioningManager;

    protected abstract class IoTIqRequestHandler extends AbstractIqRequestHandler {
        protected IoTIqRequestHandler(String str, String str2, Type type, Mode mode) {
            super(str, str2, type, mode);
        }

        public final IQ handleIQRequest(IQ iq) {
            if (IoTManager.this.isAllowed(iq.getFrom())) {
                return handleIoTIqRequest(iq);
            }
            Logger access$000 = IoTManager.LOGGER;
            StringBuilder stringBuilder = new StringBuilder("Ignoring IQ request ");
            stringBuilder.append(iq);
            access$000.warning(stringBuilder.toString());
            return null;
        }

        public abstract IQ handleIoTIqRequest(IQ iq);
    }

    protected IoTManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.ioTProvisioningManager = IoTProvisioningManager.getInstanceFor(xMPPConnection);
    }

    public static boolean isAutoEnableActive() {
        return autoEnable;
    }

    public static void setAutoEnableIoTManagers(boolean z) {
        autoEnable = z;
    }

    protected boolean isAllowed(i iVar) {
        return this.allowNonFriends ? true : this.ioTProvisioningManager.isMyFriend(iVar);
    }

    public void setAllowNonFriends(boolean z) {
        this.allowNonFriends = z;
    }
}
