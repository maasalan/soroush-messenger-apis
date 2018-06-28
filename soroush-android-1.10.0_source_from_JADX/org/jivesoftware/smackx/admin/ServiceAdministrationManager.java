package org.jivesoftware.smackx.admin;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.b.a.c.a;
import org.b.a.e;
import org.b.a.i;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smackx.commands.AdHocCommandManager;
import org.jivesoftware.smackx.commands.RemoteCommand;
import org.jivesoftware.smackx.xdata.Form;

public class ServiceAdministrationManager extends Manager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String COMMAND_NODE = "http://jabber.org/protocol/admin";
    private static final String COMMAND_NODE_HASHSIGN = "http://jabber.org/protocol/admin#";
    private static final Map<XMPPConnection, ServiceAdministrationManager> INSTANCES = new WeakHashMap();
    private final AdHocCommandManager adHocCommandManager;

    public ServiceAdministrationManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        this.adHocCommandManager = AdHocCommandManager.getAddHocCommandsManager(xMPPConnection);
    }

    public static synchronized ServiceAdministrationManager getInstanceFor(XMPPConnection xMPPConnection) {
        ServiceAdministrationManager serviceAdministrationManager;
        synchronized (ServiceAdministrationManager.class) {
            serviceAdministrationManager = (ServiceAdministrationManager) INSTANCES.get(xMPPConnection);
            if (serviceAdministrationManager == null) {
                serviceAdministrationManager = new ServiceAdministrationManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, serviceAdministrationManager);
            }
        }
        return serviceAdministrationManager;
    }

    public RemoteCommand addUser() {
        return addUser(connection().getServiceName());
    }

    public RemoteCommand addUser(i iVar) {
        return this.adHocCommandManager.getRemoteCommand(iVar, "http://jabber.org/protocol/admin#add-user");
    }

    public void addUser(e eVar, String str) {
        RemoteCommand addUser = addUser();
        addUser.execute();
        Form createAnswerForm = addUser.getForm().createAnswerForm();
        createAnswerForm.getField("accountjid").addValue(eVar.toString());
        createAnswerForm.getField("password").addValue(str);
        createAnswerForm.getField("password-verify").addValue(str);
        addUser.next(createAnswerForm);
    }

    public RemoteCommand deleteUser() {
        return deleteUser(connection().getServiceName());
    }

    public RemoteCommand deleteUser(i iVar) {
        return this.adHocCommandManager.getRemoteCommand(iVar, "http://jabber.org/protocol/admin#delete-user");
    }

    public void deleteUser(Set<e> set) {
        RemoteCommand deleteUser = deleteUser();
        deleteUser.execute();
        Form createAnswerForm = deleteUser.getForm().createAnswerForm();
        createAnswerForm.getField("accountjids").addValues(a.a(set));
        deleteUser.next(createAnswerForm);
    }

    public void deleteUser(e eVar) {
        deleteUser(Collections.singleton(eVar));
    }
}
