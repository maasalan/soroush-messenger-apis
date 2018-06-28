package org.jivesoftware.smackx.mam;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import org.b.a.f;
import org.b.a.i;
import org.b.c.a;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.StanzaCollector;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.filter.IQReplyFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.forward.packet.Forwarded;
import org.jivesoftware.smackx.mam.element.MamElements.MamResultExtension;
import org.jivesoftware.smackx.mam.element.MamFinIQ;
import org.jivesoftware.smackx.mam.element.MamPrefsIQ;
import org.jivesoftware.smackx.mam.element.MamPrefsIQ.DefaultBehavior;
import org.jivesoftware.smackx.mam.element.MamQueryIQ;
import org.jivesoftware.smackx.mam.filter.MamResultFilter;
import org.jivesoftware.smackx.rsm.packet.RSMSet;
import org.jivesoftware.smackx.rsm.packet.RSMSet.PageDirection;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.jivesoftware.smackx.xdata.packet.DataForm;

public final class MamManager extends Manager {
    private static final Map<XMPPConnection, Map<i, MamManager>> INSTANCES = new WeakHashMap();
    private final i archiveAddress;

    public static final class MamPrefsResult {
        public final DataForm form;
        public final MamPrefsIQ mamPrefs;

        private MamPrefsResult(MamPrefsIQ mamPrefsIQ, DataForm dataForm) {
            this.mamPrefs = mamPrefsIQ;
            this.form = dataForm;
        }
    }

    public static final class MamQueryResult {
        private final DataForm form;
        public final List<Forwarded> forwardedMessages;
        public final MamFinIQ mamFin;
        private final String node;

        private MamQueryResult(List<Forwarded> list, MamFinIQ mamFinIQ, String str, DataForm dataForm) {
            this.forwardedMessages = list;
            this.mamFin = mamFinIQ;
            this.node = str;
            this.form = dataForm;
        }
    }

    static class C79371 implements ConnectionCreationListener {
        C79371() {
        }

        public final void connectionCreated(XMPPConnection xMPPConnection) {
            MamManager.getInstanceFor(xMPPConnection);
        }
    }

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new C79371());
    }

    private MamManager(XMPPConnection xMPPConnection, i iVar) {
        super(xMPPConnection);
        this.archiveAddress = iVar;
    }

    private static void addAdditionalFields(List<FormField> list, DataForm dataForm) {
        if (list != null) {
            for (FormField addField : list) {
                dataForm.addField(addField);
            }
        }
    }

    private static void addEnd(Date date, DataForm dataForm) {
        if (date != null) {
            FormField formField = new FormField("end");
            formField.addValue(a.a(date));
            dataForm.addField(formField);
        }
    }

    private static void addResultsLimit(Integer num, MamQueryIQ mamQueryIQ) {
        if (num != null) {
            mamQueryIQ.addExtension(new RSMSet(num.intValue()));
        }
    }

    private static void addStart(Date date, DataForm dataForm) {
        if (date != null) {
            FormField formField = new FormField("start");
            formField.addValue(a.a(date));
            dataForm.addField(formField);
        }
    }

    private static void addWithJid(i iVar, DataForm dataForm) {
        if (iVar != null) {
            FormField formField = new FormField("with");
            formField.addValue(iVar.toString());
            dataForm.addField(formField);
        }
    }

    private void ensureMamQueryResultMatchesThisManager(MamQueryResult mamQueryResult) {
        Object obj;
        i from;
        f user = connection().getUser();
        CharSequence b = user != null ? user.b() : null;
        if (this.archiveAddress != null) {
            if (!this.archiveAddress.a(b)) {
                obj = null;
                from = mamQueryResult.mamFin.getFrom();
                if (from == null) {
                    if (from.a(this.archiveAddress)) {
                    }
                    if (obj != null || !from.a(b)) {
                        StringBuilder stringBuilder = new StringBuilder("The given MamQueryResult is from the MAM archive '");
                        stringBuilder.append(from);
                        stringBuilder.append("' whereas this MamManager is responsible for '");
                        stringBuilder.append(this.archiveAddress);
                        stringBuilder.append('\'');
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    return;
                } else if (obj == null) {
                    StringBuilder stringBuilder2 = new StringBuilder("The given MamQueryResult is from the local entity (user) MAM archive, whereas this MamManager is responsible for '");
                    stringBuilder2.append(this.archiveAddress);
                    stringBuilder2.append('\'');
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
            }
        }
        obj = 1;
        from = mamQueryResult.mamFin.getFrom();
        if (from == null) {
            if (obj == null) {
                StringBuilder stringBuilder22 = new StringBuilder("The given MamQueryResult is from the local entity (user) MAM archive, whereas this MamManager is responsible for '");
                stringBuilder22.append(this.archiveAddress);
                stringBuilder22.append('\'');
                throw new IllegalArgumentException(stringBuilder22.toString());
            }
        } else if (from.a(this.archiveAddress)) {
            if (obj != null) {
            }
            StringBuilder stringBuilder3 = new StringBuilder("The given MamQueryResult is from the MAM archive '");
            stringBuilder3.append(from);
            stringBuilder3.append("' whereas this MamManager is responsible for '");
            stringBuilder3.append(this.archiveAddress);
            stringBuilder3.append('\'');
            throw new IllegalArgumentException(stringBuilder3.toString());
        }
    }

    public static MamManager getInstanceFor(XMPPConnection xMPPConnection) {
        return getInstanceFor(xMPPConnection, null);
    }

    public static synchronized MamManager getInstanceFor(XMPPConnection xMPPConnection, i iVar) {
        MamManager mamManager;
        synchronized (MamManager.class) {
            Map map = (Map) INSTANCES.get(xMPPConnection);
            if (map == null) {
                map = new HashMap();
                INSTANCES.put(xMPPConnection, map);
            }
            mamManager = (MamManager) map.get(iVar);
            if (mamManager == null) {
                mamManager = new MamManager(xMPPConnection, iVar);
                map.put(iVar, mamManager);
            }
        }
        return mamManager;
    }

    private static DataForm getNewMamForm() {
        FormField formField = new FormField(FormField.FORM_TYPE);
        formField.setType(Type.hidden);
        formField.addValue("urn:xmpp:mam:1");
        DataForm dataForm = new DataForm(DataForm.Type.submit);
        dataForm.addField(formField);
        return dataForm;
    }

    private MamQueryResult page(MamQueryResult mamQueryResult, RSMSet rSMSet) {
        ensureMamQueryResultMatchesThisManager(mamQueryResult);
        return page(mamQueryResult.node, mamQueryResult.form, rSMSet);
    }

    private MamQueryResult queryArchive(MamQueryIQ mamQueryIQ) {
        XMPPConnection authenticatedConnectionOrThrow = getAuthenticatedConnectionOrThrow();
        StanzaCollector createStanzaCollector = authenticatedConnectionOrThrow.createStanzaCollector(new IQReplyFilter(mamQueryIQ, authenticatedConnectionOrThrow));
        StanzaCollector createStanzaCollector2 = authenticatedConnectionOrThrow.createStanzaCollector(StanzaCollector.newConfiguration().setStanzaFilter(new MamResultFilter(mamQueryIQ)).setCollectorToReset(createStanzaCollector));
        try {
            authenticatedConnectionOrThrow.sendStanza(mamQueryIQ);
            MamFinIQ mamFinIQ = (MamFinIQ) createStanzaCollector.nextResultOrThrow();
            List arrayList = new ArrayList(createStanzaCollector2.getCollectedCount());
            while (true) {
                Message message = (Message) createStanzaCollector2.pollResult();
                if (message == null) {
                    return new MamQueryResult(arrayList, mamFinIQ, mamQueryIQ.getNode(), DataForm.from(mamQueryIQ));
                }
                arrayList.add(MamResultExtension.from(message).getForwarded());
            }
        } finally {
            createStanzaCollector.cancel();
            createStanzaCollector2.cancel();
        }
    }

    private MamPrefsResult queryMamPrefs(MamPrefsIQ mamPrefsIQ) {
        return new MamPrefsResult((MamPrefsIQ) getAuthenticatedConnectionOrThrow().createStanzaCollectorAndSend(mamPrefsIQ).nextResultOrThrow(), DataForm.from(mamPrefsIQ));
    }

    public final boolean isSupportedByServer() {
        return ServiceDiscoveryManager.getInstanceFor(connection()).serverSupportsFeature("urn:xmpp:mam:1");
    }

    public final MamQueryResult mostRecentPage(i iVar, int i) {
        return pageBefore(iVar, "", i);
    }

    public final MamQueryResult page(String str, DataForm dataForm, RSMSet rSMSet) {
        MamQueryIQ mamQueryIQ = new MamQueryIQ(UUID.randomUUID().toString(), str, dataForm);
        mamQueryIQ.setType(IQ.Type.set);
        mamQueryIQ.setTo(this.archiveAddress);
        mamQueryIQ.addExtension(rSMSet);
        return queryArchive(mamQueryIQ);
    }

    public final MamQueryResult page(DataForm dataForm, RSMSet rSMSet) {
        return page(null, dataForm, rSMSet);
    }

    public final MamQueryResult pageAfter(i iVar, String str, int i) {
        RSMSet rSMSet = new RSMSet(str, null, -1, -1, null, i, null, -1);
        DataForm newMamForm = getNewMamForm();
        addWithJid(iVar, newMamForm);
        return page(null, newMamForm, rSMSet);
    }

    public final MamQueryResult pageBefore(i iVar, String str, int i) {
        RSMSet rSMSet = new RSMSet(null, str, -1, -1, null, i, null, -1);
        DataForm newMamForm = getNewMamForm();
        addWithJid(iVar, newMamForm);
        return page(null, newMamForm, rSMSet);
    }

    public final MamQueryResult pageNext(MamQueryResult mamQueryResult, int i) {
        return page(mamQueryResult, new RSMSet(i, mamQueryResult.mamFin.getRSMSet().getLast(), PageDirection.after));
    }

    public final MamQueryResult pagePrevious(MamQueryResult mamQueryResult, int i) {
        return page(mamQueryResult, new RSMSet(i, mamQueryResult.mamFin.getRSMSet().getFirst(), PageDirection.before));
    }

    public final MamQueryResult queryArchive(Integer num) {
        return queryArchive(null, num, null, null, null, null);
    }

    public final MamQueryResult queryArchive(Integer num, Date date, Date date2, i iVar, List<FormField> list) {
        return queryArchive(null, num, date, date2, iVar, list);
    }

    public final MamQueryResult queryArchive(String str, Integer num, Date date, Date date2, i iVar, List<FormField> list) {
        DataForm dataForm;
        MamQueryIQ mamQueryIQ;
        String uuid = UUID.randomUUID().toString();
        if (date == null && date2 == null && iVar == null) {
            if (list == null) {
                dataForm = null;
                mamQueryIQ = new MamQueryIQ(uuid, str, dataForm);
                mamQueryIQ.setType(IQ.Type.set);
                mamQueryIQ.setTo(this.archiveAddress);
                addResultsLimit(num, mamQueryIQ);
                return queryArchive(mamQueryIQ);
            }
        }
        DataForm newMamForm = getNewMamForm();
        addStart(date, newMamForm);
        addEnd(date2, newMamForm);
        addWithJid(iVar, newMamForm);
        addAdditionalFields(list, newMamForm);
        dataForm = newMamForm;
        mamQueryIQ = new MamQueryIQ(uuid, str, dataForm);
        mamQueryIQ.setType(IQ.Type.set);
        mamQueryIQ.setTo(this.archiveAddress);
        addResultsLimit(num, mamQueryIQ);
        return queryArchive(mamQueryIQ);
    }

    public final MamQueryResult queryArchive(Date date, Date date2) {
        return queryArchive(null, null, date, date2, null, null);
    }

    public final MamQueryResult queryArchive(List<FormField> list) {
        return queryArchive(null, null, null, null, null, list);
    }

    public final MamQueryResult queryArchive(i iVar) {
        return queryArchive(null, null, null, null, iVar, null);
    }

    public final MamQueryResult queryArchiveWithEndDate(Date date) {
        return queryArchive(null, null, null, date, null, null);
    }

    public final MamQueryResult queryArchiveWithStartDate(Date date) {
        return queryArchive(null, null, date, null, null, null);
    }

    public final MamPrefsResult retrieveArchivingPreferences() {
        return queryMamPrefs(new MamPrefsIQ());
    }

    public final List<FormField> retrieveFormFields() {
        return retrieveFormFields(null);
    }

    public final List<FormField> retrieveFormFields(String str) {
        IQ mamQueryIQ = new MamQueryIQ(UUID.randomUUID().toString(), str, null);
        mamQueryIQ.setTo(this.archiveAddress);
        return ((MamQueryIQ) connection().createStanzaCollectorAndSend(mamQueryIQ).nextResultOrThrow()).getDataForm().getFields();
    }

    public final MamPrefsResult updateArchivingPreferences(List<i> list, List<i> list2, DefaultBehavior defaultBehavior) {
        Objects.requireNonNull(defaultBehavior, "Default behavior must be set");
        return queryMamPrefs(new MamPrefsIQ(list, list2, defaultBehavior));
    }
}
