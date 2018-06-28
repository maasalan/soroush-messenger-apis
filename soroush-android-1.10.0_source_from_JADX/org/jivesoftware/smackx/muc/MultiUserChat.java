package org.jivesoftware.smackx.muc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.b.d;
import org.b.a.e;
import org.b.a.f;
import org.b.a.g;
import org.b.a.i;
import org.b.c.a.b;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.PresenceListener;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.StanzaCollector;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.chat.Chat;
import org.jivesoftware.smack.chat.ChatManager;
import org.jivesoftware.smack.chat.ChatMessageListener;
import org.jivesoftware.smack.filter.AndFilter;
import org.jivesoftware.smack.filter.FromMatchesFilter;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.MessageWithSubjectFilter;
import org.jivesoftware.smack.filter.NotFilter;
import org.jivesoftware.smack.filter.OrFilter;
import org.jivesoftware.smack.filter.PresenceTypeFilter;
import org.jivesoftware.smack.filter.StanzaExtensionFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaIdFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.filter.ToMatchesFilter;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Mode;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo.Identity;
import org.jivesoftware.smackx.iqregister.packet.Registration;
import org.jivesoftware.smackx.muc.MucEnterConfiguration.Builder;
import org.jivesoftware.smackx.muc.MultiUserChatException.MissingMucCreationAcknowledgeException;
import org.jivesoftware.smackx.muc.MultiUserChatException.MucAlreadyJoinedException;
import org.jivesoftware.smackx.muc.MultiUserChatException.MucNotJoinedException;
import org.jivesoftware.smackx.muc.MultiUserChatException.NotAMucServiceException;
import org.jivesoftware.smackx.muc.filter.MUCUserStatusCodeFilter;
import org.jivesoftware.smackx.muc.packet.Destroy;
import org.jivesoftware.smackx.muc.packet.MUCAdmin;
import org.jivesoftware.smackx.muc.packet.MUCItem;
import org.jivesoftware.smackx.muc.packet.MUCOwner;
import org.jivesoftware.smackx.muc.packet.MUCUser;
import org.jivesoftware.smackx.muc.packet.MUCUser.Decline;
import org.jivesoftware.smackx.muc.packet.MUCUser.Invite;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.packet.DataForm.Type;

public class MultiUserChat {
    private static final StanzaFilter DECLINE_FILTER = new AndFilter(MessageTypeFilter.NORMAL, new StanzaExtensionFilter("x", MUCUser.NAMESPACE));
    private static final b<org.b.a.b, Void> KNOWN_MUC_SERVICES = new b(100, 86400000);
    private static final Logger LOGGER = Logger.getLogger(MultiUserChat.class.getName());
    private final XMPPConnection connection;
    private final StanzaListener declinesListener;
    private final StanzaFilter fromRoomFilter;
    private final StanzaFilter fromRoomGroupchatFilter;
    private final Set<InvitationRejectionListener> invitationRejectionListeners = new CopyOnWriteArraySet();
    private boolean joined = false;
    private StanzaCollector messageCollector;
    private final StanzaListener messageListener;
    private final Set<MessageListener> messageListeners = new CopyOnWriteArraySet();
    private final MultiUserChatManager multiUserChatManager;
    private d nickname;
    private final Map<f, Presence> occupantsMap = new ConcurrentHashMap();
    private final Set<ParticipantStatusListener> participantStatusListeners = new CopyOnWriteArraySet();
    private final StanzaListener presenceInterceptor;
    private final Set<PresenceListener> presenceInterceptors = new CopyOnWriteArraySet();
    private final StanzaListener presenceListener;
    private final Set<PresenceListener> presenceListeners = new CopyOnWriteArraySet();
    private final e room;
    private String subject;
    private final StanzaListener subjectListener;
    private final Set<SubjectUpdatedListener> subjectUpdatedListeners = new CopyOnWriteArraySet();
    private final Set<UserStatusListener> userStatusListeners = new CopyOnWriteArraySet();

    public class MucCreateConfigFormHandle {
        public MucConfigFormManager getConfigFormManager() {
            return MultiUserChat.this.getConfigFormManager();
        }

        public void makeInstant() {
            MultiUserChat.this.sendConfigurationForm(new Form(Type.submit));
        }
    }

    class C79381 implements StanzaListener {
        C79381() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            for (MessageListener processMessage : MultiUserChat.this.messageListeners) {
                processMessage.processMessage(message);
            }
        }
    }

    class C79392 implements StanzaListener {
        C79392() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            f p = message.getFrom().p();
            if (p == null) {
                Logger access$100 = MultiUserChat.LOGGER;
                StringBuilder stringBuilder = new StringBuilder("Message subject not changed by a full JID: ");
                stringBuilder.append(message.getFrom());
                access$100.warning(stringBuilder.toString());
                return;
            }
            MultiUserChat.this.subject = message.getSubject();
            for (SubjectUpdatedListener subjectUpdated : MultiUserChat.this.subjectUpdatedListeners) {
                subjectUpdated.subjectUpdated(MultiUserChat.this.subject, p);
            }
        }
    }

    class C79403 implements StanzaListener {
        C79403() {
        }

        public void processStanza(Stanza stanza) {
            Presence presence = (Presence) stanza;
            f p = presence.getFrom().p();
            if (p == null) {
                Logger access$100 = MultiUserChat.LOGGER;
                StringBuilder stringBuilder = new StringBuilder("Presence not from a full JID: ");
                stringBuilder.append(presence.getFrom());
                access$100.warning(stringBuilder.toString());
                return;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(MultiUserChat.this.room);
            stringBuilder2.append("/");
            stringBuilder2.append(MultiUserChat.this.nickname);
            String stringBuilder3 = stringBuilder2.toString();
            boolean a = presence.getFrom().a(stringBuilder3);
            MUCUser from;
            switch (presence.getType()) {
                case available:
                    Presence presence2 = (Presence) MultiUserChat.this.occupantsMap.put(p, presence);
                    if (presence2 == null) {
                        if (!a) {
                            for (ParticipantStatusListener joined : MultiUserChat.this.participantStatusListeners) {
                                joined.joined(p);
                            }
                            break;
                        }
                    }
                    MUCUser from2 = MUCUser.from(presence2);
                    MUCAffiliation affiliation = from2.getItem().getAffiliation();
                    MUCRole role = from2.getItem().getRole();
                    from = MUCUser.from(stanza);
                    MUCAffiliation affiliation2 = from.getItem().getAffiliation();
                    MultiUserChat.this.checkRoleModifications(role, from.getItem().getRole(), a, p);
                    MultiUserChat.this.checkAffiliationModifications(affiliation, affiliation2, a, p);
                    break;
                    break;
                case unavailable:
                    MultiUserChat.this.occupantsMap.remove(p);
                    from = MUCUser.from(stanza);
                    if (from == null || !from.hasStatus()) {
                        if (!a) {
                            for (ParticipantStatusListener joined2 : MultiUserChat.this.participantStatusListeners) {
                                joined2.left(p);
                            }
                            break;
                        }
                    }
                    MultiUserChat.this.checkPresenceCode(from.getStatus(), presence.getFrom().a(stringBuilder3), from, p);
                    break;
                    break;
                default:
                    break;
            }
            for (PresenceListener processPresence : MultiUserChat.this.presenceListeners) {
                processPresence.processPresence(presence);
            }
        }
    }

    class C79414 implements StanzaListener {
        C79414() {
        }

        public void processStanza(Stanza stanza) {
            Message message = (Message) stanza;
            Decline decline = MUCUser.from(stanza).getDecline();
            if (decline != null) {
                MultiUserChat.this.fireInvitationRejectionListeners(message, decline);
            }
        }
    }

    class C79425 implements StanzaListener {
        C79425() {
        }

        public void processStanza(Stanza stanza) {
            Presence presence = (Presence) stanza;
            for (PresenceListener processPresence : MultiUserChat.this.presenceInterceptors) {
                processPresence.processPresence(presence);
            }
        }
    }

    MultiUserChat(XMPPConnection xMPPConnection, e eVar, MultiUserChatManager multiUserChatManager) {
        this.connection = xMPPConnection;
        this.room = eVar;
        this.multiUserChatManager = multiUserChatManager;
        this.fromRoomFilter = FromMatchesFilter.create(eVar);
        this.fromRoomGroupchatFilter = new AndFilter(this.fromRoomFilter, MessageTypeFilter.GROUPCHAT);
        this.messageListener = new C79381();
        this.subjectListener = new C79392();
        this.presenceListener = new C79403();
        this.declinesListener = new C79414();
        this.presenceInterceptor = new C79425();
    }

    private void changeAffiliationByAdmin(Collection<? extends i> collection, MUCAffiliation mUCAffiliation) {
        IQ mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(IQ.Type.set);
        for (i mUCItem : collection) {
            mUCAdmin.addItem(new MUCItem(mUCAffiliation, mUCItem));
        }
        this.connection.createStanzaCollectorAndSend(mUCAdmin).nextResultOrThrow();
    }

    private void changeAffiliationByAdmin(i iVar, MUCAffiliation mUCAffiliation) {
        changeAffiliationByAdmin(iVar, mUCAffiliation, null);
    }

    private void changeAffiliationByAdmin(i iVar, MUCAffiliation mUCAffiliation, String str) {
        IQ mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(IQ.Type.set);
        mUCAdmin.addItem(new MUCItem(mUCAffiliation, iVar, str));
        this.connection.createStanzaCollectorAndSend(mUCAdmin).nextResultOrThrow();
    }

    private void changeRole(Collection<d> collection, MUCRole mUCRole) {
        IQ mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(IQ.Type.set);
        for (d mUCItem : collection) {
            mUCAdmin.addItem(new MUCItem(mUCRole, mUCItem));
        }
        this.connection.createStanzaCollectorAndSend(mUCAdmin).nextResultOrThrow();
    }

    private void changeRole(d dVar, MUCRole mUCRole, String str) {
        IQ mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(IQ.Type.set);
        mUCAdmin.addItem(new MUCItem(mUCRole, dVar, str));
        this.connection.createStanzaCollectorAndSend(mUCAdmin).nextResultOrThrow();
    }

    private void checkAffiliationModifications(MUCAffiliation mUCAffiliation, MUCAffiliation mUCAffiliation2, boolean z, f fVar) {
        if (!MUCAffiliation.owner.equals(mUCAffiliation) || MUCAffiliation.owner.equals(mUCAffiliation2)) {
            if (!MUCAffiliation.admin.equals(mUCAffiliation) || MUCAffiliation.admin.equals(mUCAffiliation2)) {
                if (MUCAffiliation.member.equals(mUCAffiliation) && !MUCAffiliation.member.equals(mUCAffiliation2)) {
                    if (z) {
                        for (UserStatusListener membershipRevoked : this.userStatusListeners) {
                            membershipRevoked.membershipRevoked();
                        }
                    } else {
                        for (ParticipantStatusListener membershipRevoked2 : this.participantStatusListeners) {
                            membershipRevoked2.membershipRevoked(fVar);
                        }
                    }
                }
            } else if (z) {
                for (UserStatusListener membershipRevoked3 : this.userStatusListeners) {
                    membershipRevoked3.adminRevoked();
                }
            } else {
                for (ParticipantStatusListener membershipRevoked22 : this.participantStatusListeners) {
                    membershipRevoked22.adminRevoked(fVar);
                }
            }
        } else if (z) {
            for (UserStatusListener membershipRevoked32 : this.userStatusListeners) {
                membershipRevoked32.ownershipRevoked();
            }
        } else {
            for (ParticipantStatusListener membershipRevoked222 : this.participantStatusListeners) {
                membershipRevoked222.ownershipRevoked(fVar);
            }
        }
        if (MUCAffiliation.owner.equals(mUCAffiliation) || !MUCAffiliation.owner.equals(mUCAffiliation2)) {
            if (MUCAffiliation.admin.equals(mUCAffiliation) || !MUCAffiliation.admin.equals(mUCAffiliation2)) {
                if (!MUCAffiliation.member.equals(mUCAffiliation) && MUCAffiliation.member.equals(mUCAffiliation2)) {
                    if (z) {
                        for (UserStatusListener membershipGranted : this.userStatusListeners) {
                            membershipGranted.membershipGranted();
                        }
                        return;
                    }
                    for (ParticipantStatusListener membershipGranted2 : this.participantStatusListeners) {
                        membershipGranted2.membershipGranted(fVar);
                    }
                }
            } else if (z) {
                for (UserStatusListener membershipGranted3 : this.userStatusListeners) {
                    membershipGranted3.adminGranted();
                }
            } else {
                for (ParticipantStatusListener membershipGranted22 : this.participantStatusListeners) {
                    membershipGranted22.adminGranted(fVar);
                }
            }
        } else if (z) {
            for (UserStatusListener membershipGranted32 : this.userStatusListeners) {
                membershipGranted32.ownershipGranted();
            }
        } else {
            for (ParticipantStatusListener membershipGranted222 : this.participantStatusListeners) {
                membershipGranted222.ownershipGranted(fVar);
            }
        }
    }

    private void checkPresenceCode(Set<Status> set, boolean z, MUCUser mUCUser, f fVar) {
        if (set.contains(Status.KICKED_307)) {
            if (z) {
                this.joined = false;
                for (UserStatusListener kicked : this.userStatusListeners) {
                    kicked.kicked(mUCUser.getItem().getActor(), mUCUser.getItem().getReason());
                }
                this.occupantsMap.clear();
                this.nickname = null;
                userHasLeft();
            } else {
                for (ParticipantStatusListener kicked2 : this.participantStatusListeners) {
                    kicked2.kicked(fVar, mUCUser.getItem().getActor(), mUCUser.getItem().getReason());
                }
            }
        }
        if (set.contains(Status.BANNED_301)) {
            if (z) {
                this.joined = false;
                for (UserStatusListener kicked3 : this.userStatusListeners) {
                    kicked3.banned(mUCUser.getItem().getActor(), mUCUser.getItem().getReason());
                }
                this.occupantsMap.clear();
                this.nickname = null;
                userHasLeft();
            } else {
                for (ParticipantStatusListener kicked22 : this.participantStatusListeners) {
                    kicked22.banned(fVar, mUCUser.getItem().getActor(), mUCUser.getItem().getReason());
                }
            }
        }
        if (set.contains(Status.REMOVED_AFFIL_CHANGE_321) && z) {
            this.joined = false;
            for (UserStatusListener membershipRevoked : this.userStatusListeners) {
                membershipRevoked.membershipRevoked();
            }
            this.occupantsMap.clear();
            this.nickname = null;
            userHasLeft();
        }
        if (set.contains(Status.NEW_NICKNAME_303)) {
            for (ParticipantStatusListener nicknameChanged : this.participantStatusListeners) {
                nicknameChanged.nicknameChanged(fVar, mUCUser.getItem().getNick());
            }
        }
        if (mUCUser.getDestroy() != null) {
            MultiUserChat multiUserChat = this.multiUserChatManager.getMultiUserChat(mUCUser.getDestroy().getJid());
            for (UserStatusListener roomDestroyed : this.userStatusListeners) {
                roomDestroyed.roomDestroyed(multiUserChat, mUCUser.getDestroy().getReason());
            }
            this.occupantsMap.clear();
            this.nickname = null;
            userHasLeft();
        }
    }

    private void checkRoleModifications(MUCRole mUCRole, MUCRole mUCRole2, boolean z, f fVar) {
        if ((MUCRole.visitor.equals(mUCRole) || MUCRole.none.equals(mUCRole)) && MUCRole.participant.equals(mUCRole2)) {
            if (z) {
                for (UserStatusListener voiceGranted : this.userStatusListeners) {
                    voiceGranted.voiceGranted();
                }
            } else {
                for (ParticipantStatusListener voiceGranted2 : this.participantStatusListeners) {
                    voiceGranted2.voiceGranted(fVar);
                }
            }
        } else if (MUCRole.participant.equals(mUCRole) && (MUCRole.visitor.equals(mUCRole2) || MUCRole.none.equals(mUCRole2))) {
            if (z) {
                for (UserStatusListener voiceGranted3 : this.userStatusListeners) {
                    voiceGranted3.voiceRevoked();
                }
            } else {
                for (ParticipantStatusListener voiceGranted22 : this.participantStatusListeners) {
                    voiceGranted22.voiceRevoked(fVar);
                }
            }
        }
        if (MUCRole.moderator.equals(mUCRole) || !MUCRole.moderator.equals(mUCRole2)) {
            if (MUCRole.moderator.equals(mUCRole) && !MUCRole.moderator.equals(mUCRole2)) {
                if (MUCRole.visitor.equals(mUCRole2) || MUCRole.none.equals(mUCRole2)) {
                    if (z) {
                        for (UserStatusListener voiceRevoked : this.userStatusListeners) {
                            voiceRevoked.voiceRevoked();
                        }
                    } else {
                        for (ParticipantStatusListener voiceRevoked2 : this.participantStatusListeners) {
                            voiceRevoked2.voiceRevoked(fVar);
                        }
                    }
                }
                if (z) {
                    for (UserStatusListener voiceRevoked3 : this.userStatusListeners) {
                        voiceRevoked3.moderatorRevoked();
                    }
                    return;
                }
                for (ParticipantStatusListener voiceRevoked22 : this.participantStatusListeners) {
                    voiceRevoked22.moderatorRevoked(fVar);
                }
            }
            return;
        }
        if (MUCRole.visitor.equals(mUCRole) || MUCRole.none.equals(mUCRole)) {
            if (z) {
                for (UserStatusListener voiceRevoked32 : this.userStatusListeners) {
                    voiceRevoked32.voiceGranted();
                }
            } else {
                for (ParticipantStatusListener voiceRevoked222 : this.participantStatusListeners) {
                    voiceRevoked222.voiceGranted(fVar);
                }
            }
        }
        if (z) {
            for (UserStatusListener voiceRevoked322 : this.userStatusListeners) {
                voiceRevoked322.moderatorGranted();
            }
            return;
        }
        for (ParticipantStatusListener voiceRevoked2222 : this.participantStatusListeners) {
            voiceRevoked2222.moderatorGranted(fVar);
        }
    }

    private Presence enter(MucEnterConfiguration mucEnterConfiguration) {
        org.b.a.b t = this.room.t();
        if (!KNOWN_MUC_SERVICES.containsKey(t)) {
            if (this.multiUserChatManager.providesMucService(t)) {
                KNOWN_MUC_SERVICES.put(t, null);
            } else {
                throw new NotAMucServiceException(this);
            }
        }
        Stanza joinPresence = mucEnterConfiguration.getJoinPresence(this);
        this.connection.addSyncStanzaListener(this.messageListener, this.fromRoomGroupchatFilter);
        this.connection.addSyncStanzaListener(this.presenceListener, new AndFilter(this.fromRoomFilter, StanzaTypeFilter.PRESENCE));
        this.connection.addSyncStanzaListener(this.subjectListener, new AndFilter(this.fromRoomFilter, MessageWithSubjectFilter.INSTANCE, new NotFilter(MessageTypeFilter.ERROR)));
        this.connection.addSyncStanzaListener(this.declinesListener, DECLINE_FILTER);
        this.connection.addPacketInterceptor(this.presenceInterceptor, new AndFilter(ToMatchesFilter.create(this.room), StanzaTypeFilter.PRESENCE));
        this.messageCollector = this.connection.createStanzaCollector(this.fromRoomGroupchatFilter);
        StanzaFilter[] stanzaFilterArr = new StanzaFilter[2];
        stanzaFilterArr[0] = StanzaTypeFilter.PRESENCE;
        r6 = new StanzaFilter[2];
        r6[0] = new AndFilter(FromMatchesFilter.createBare(getRoom()), MUCUserStatusCodeFilter.STATUS_110_PRESENCE_TO_SELF);
        r6[1] = new AndFilter(FromMatchesFilter.createFull(joinPresence.getTo()), new StanzaIdFilter(joinPresence), PresenceTypeFilter.ERROR);
        stanzaFilterArr[1] = new OrFilter(r6);
        try {
            Presence presence = (Presence) this.connection.createStanzaCollectorAndSend(new AndFilter(stanzaFilterArr), joinPresence).nextResultOrThrow(mucEnterConfiguration.getTimeout());
            this.nickname = presence.getFrom().p().c();
            this.joined = true;
            this.multiUserChatManager.addJoinedRoom(this.room);
            return presence;
        } catch (NotConnectedException e) {
            removeConnectionCallbacks();
            throw e;
        }
    }

    private void fireInvitationRejectionListeners(Message message, Decline decline) {
        e from = decline.getFrom();
        String reason = decline.getReason();
        synchronized (this.invitationRejectionListeners) {
            InvitationRejectionListener[] invitationRejectionListenerArr = new InvitationRejectionListener[this.invitationRejectionListeners.size()];
            this.invitationRejectionListeners.toArray(invitationRejectionListenerArr);
        }
        for (InvitationRejectionListener invitationDeclined : invitationRejectionListenerArr) {
            invitationDeclined.invitationDeclined(from, reason, message, decline);
        }
    }

    private List<Affiliate> getAffiliatesByAdmin(MUCAffiliation mUCAffiliation) {
        IQ mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(IQ.Type.get);
        mUCAdmin.addItem(new MUCItem(mUCAffiliation));
        MUCAdmin mUCAdmin2 = (MUCAdmin) this.connection.createStanzaCollectorAndSend(mUCAdmin).nextResultOrThrow();
        List<Affiliate> arrayList = new ArrayList();
        for (MUCItem affiliate : mUCAdmin2.getItems()) {
            arrayList.add(new Affiliate(affiliate));
        }
        return arrayList;
    }

    private List<Occupant> getOccupants(MUCRole mUCRole) {
        IQ mUCAdmin = new MUCAdmin();
        mUCAdmin.setTo(this.room);
        mUCAdmin.setType(IQ.Type.get);
        mUCAdmin.addItem(new MUCItem(mUCRole));
        MUCAdmin mUCAdmin2 = (MUCAdmin) this.connection.createStanzaCollectorAndSend(mUCAdmin).nextResultOrThrow();
        List<Occupant> arrayList = new ArrayList();
        for (MUCItem occupant : mUCAdmin2.getItems()) {
            arrayList.add(new Occupant(occupant));
        }
        return arrayList;
    }

    private void removeConnectionCallbacks() {
        this.connection.removeSyncStanzaListener(this.messageListener);
        this.connection.removeSyncStanzaListener(this.presenceListener);
        this.connection.removeSyncStanzaListener(this.declinesListener);
        this.connection.removePacketInterceptor(this.presenceInterceptor);
        if (this.messageCollector != null) {
            this.messageCollector.cancel();
            this.messageCollector = null;
        }
    }

    private synchronized void userHasLeft() {
        this.multiUserChatManager.removeJoinedRoom(this.room);
        removeConnectionCallbacks();
    }

    public boolean addInvitationRejectionListener(InvitationRejectionListener invitationRejectionListener) {
        return this.invitationRejectionListeners.add(invitationRejectionListener);
    }

    public boolean addMessageListener(MessageListener messageListener) {
        return this.messageListeners.add(messageListener);
    }

    public boolean addParticipantListener(PresenceListener presenceListener) {
        return this.presenceListeners.add(presenceListener);
    }

    public boolean addParticipantStatusListener(ParticipantStatusListener participantStatusListener) {
        return this.participantStatusListeners.add(participantStatusListener);
    }

    public void addPresenceInterceptor(PresenceListener presenceListener) {
        this.presenceInterceptors.add(presenceListener);
    }

    public boolean addSubjectUpdatedListener(SubjectUpdatedListener subjectUpdatedListener) {
        return this.subjectUpdatedListeners.add(subjectUpdatedListener);
    }

    public boolean addUserStatusListener(UserStatusListener userStatusListener) {
        return this.userStatusListeners.add(userStatusListener);
    }

    public void banUser(i iVar, String str) {
        changeAffiliationByAdmin(iVar, MUCAffiliation.outcast, str);
    }

    public void banUsers(Collection<? extends i> collection) {
        changeAffiliationByAdmin((Collection) collection, MUCAffiliation.outcast);
    }

    public void changeAvailabilityStatus(String str, Mode mode) {
        StringUtils.requireNotNullOrEmpty(this.nickname, "Nickname must not be null or blank.");
        if (this.joined) {
            Stanza presence = new Presence(Presence.Type.available);
            presence.setStatus(str);
            presence.setMode(mode);
            presence.setTo(org.b.a.a.d.a(this.room, this.nickname));
            this.connection.sendStanza(presence);
            return;
        }
        throw new MucNotJoinedException(this);
    }

    public synchronized void changeNickname(d dVar) {
        StringUtils.requireNotNullOrEmpty(dVar, "Nickname must not be null or blank.");
        if (this.joined) {
            i a = org.b.a.a.d.a(this.room, dVar);
            Stanza presence = new Presence(Presence.Type.available);
            presence.setTo(a);
            this.connection.createStanzaCollectorAndSend(new AndFilter(FromMatchesFilter.createFull(a), new StanzaTypeFilter(Presence.class)), presence).nextResultOrThrow();
            this.nickname = dVar;
        } else {
            throw new MucNotJoinedException(this);
        }
    }

    public void changeSubject(final String str) {
        Stanza createMessage = createMessage();
        createMessage.setSubject(str);
        this.connection.createStanzaCollectorAndSend(new AndFilter(this.fromRoomGroupchatFilter, new StanzaFilter() {
            public boolean accept(Stanza stanza) {
                return str.equals(((Message) stanza).getSubject());
            }
        }), createMessage).nextResultOrThrow();
    }

    public synchronized MucCreateConfigFormHandle create(d dVar) {
        MucCreateConfigFormHandle createOrJoin;
        if (this.joined) {
            throw new MucAlreadyJoinedException();
        }
        createOrJoin = createOrJoin(dVar);
        if (createOrJoin == null) {
            leave();
            throw new MissingMucCreationAcknowledgeException();
        }
        return createOrJoin;
    }

    public Message createMessage() {
        return new Message(this.room, Message.Type.groupchat);
    }

    public synchronized MucCreateConfigFormHandle createOrJoin(d dVar) {
        return createOrJoin(getEnterConfigurationBuilder(dVar).build());
    }

    @Deprecated
    public MucCreateConfigFormHandle createOrJoin(d dVar, String str, DiscussionHistory discussionHistory, long j) {
        return createOrJoin(getEnterConfigurationBuilder(dVar).withPassword(str).timeoutAfter(j).build());
    }

    public synchronized MucCreateConfigFormHandle createOrJoin(MucEnterConfiguration mucEnterConfiguration) {
        if (this.joined) {
            throw new MucAlreadyJoinedException();
        }
        MUCUser from = MUCUser.from(enter(mucEnterConfiguration));
        if (from == null || !from.getStatus().contains(Status.ROOM_CREATED_201)) {
            return null;
        }
        return new MucCreateConfigFormHandle();
    }

    public org.jivesoftware.smackx.muc.MultiUserChat.MucCreateConfigFormHandle createOrJoinIfNecessary(org.b.a.b.d r3, java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.isJoined();
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r3 = r2.getEnterConfigurationBuilder(r3);
        r3 = r3.withPassword(r4);
        r3 = r3.build();
        r3 = r2.createOrJoin(r3);	 Catch:{ MucAlreadyJoinedException -> 0x0019 }
        return r3;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.muc.MultiUserChat.createOrJoinIfNecessary(org.b.a.b.d, java.lang.String):org.jivesoftware.smackx.muc.MultiUserChat$MucCreateConfigFormHandle");
    }

    public Chat createPrivateChat(f fVar, ChatMessageListener chatMessageListener) {
        return ChatManager.getInstanceFor(this.connection).createChat(fVar, chatMessageListener);
    }

    public void destroy(String str, e eVar) {
        IQ mUCOwner = new MUCOwner();
        mUCOwner.setTo(this.room);
        mUCOwner.setType(IQ.Type.set);
        mUCOwner.setDestroy(new Destroy(eVar, str));
        this.connection.createStanzaCollectorAndSend(mUCOwner).nextResultOrThrow();
        this.occupantsMap.clear();
        this.nickname = null;
        this.joined = false;
        userHasLeft();
    }

    public List<Affiliate> getAdmins() {
        return getAffiliatesByAdmin(MUCAffiliation.admin);
    }

    public MucConfigFormManager getConfigFormManager() {
        return new MucConfigFormManager(this);
    }

    public Form getConfigurationForm() {
        IQ mUCOwner = new MUCOwner();
        mUCOwner.setTo(this.room);
        mUCOwner.setType(IQ.Type.get);
        return Form.getFormFrom((IQ) this.connection.createStanzaCollectorAndSend(mUCOwner).nextResultOrThrow());
    }

    public Builder getEnterConfigurationBuilder(d dVar) {
        return new Builder(dVar, this.connection.getReplyTimeout());
    }

    public List<Affiliate> getMembers() {
        return getAffiliatesByAdmin(MUCAffiliation.member);
    }

    public List<Occupant> getModerators() {
        return getOccupants(MUCRole.moderator);
    }

    public d getNickname() {
        return this.nickname;
    }

    public Occupant getOccupant(f fVar) {
        Presence occupantPresence = getOccupantPresence(fVar);
        return occupantPresence != null ? new Occupant(occupantPresence) : null;
    }

    public Presence getOccupantPresence(f fVar) {
        return (Presence) this.occupantsMap.get(fVar);
    }

    public List<f> getOccupants() {
        return new ArrayList(this.occupantsMap.keySet());
    }

    public int getOccupantsCount() {
        return this.occupantsMap.size();
    }

    public List<Affiliate> getOutcasts() {
        return getAffiliatesByAdmin(MUCAffiliation.outcast);
    }

    public List<Affiliate> getOwners() {
        return getAffiliatesByAdmin(MUCAffiliation.owner);
    }

    public List<Occupant> getParticipants() {
        return getOccupants(MUCRole.participant);
    }

    public Form getRegistrationForm() {
        IQ registration = new Registration();
        registration.setType(IQ.Type.get);
        registration.setTo(this.room);
        return Form.getFormFrom((IQ) this.connection.createStanzaCollectorAndSend(registration).nextResultOrThrow());
    }

    public String getReservedNickname() {
        try {
            Iterator it = ServiceDiscoveryManager.getInstanceFor(this.connection).discoverInfo(this.room, "x-roomuser-item").getIdentities().iterator();
            if (it.hasNext()) {
                return ((Identity) it.next()).getName();
            }
        } catch (Throwable e) {
            LOGGER.log(Level.SEVERE, "Error retrieving room nickname", e);
        }
        return null;
    }

    public e getRoom() {
        return this.room;
    }

    public String getSubject() {
        return this.subject;
    }

    public void grantAdmin(Collection<? extends i> collection) {
        changeAffiliationByAdmin((Collection) collection, MUCAffiliation.admin);
    }

    public void grantAdmin(i iVar) {
        changeAffiliationByAdmin(iVar, MUCAffiliation.admin);
    }

    public void grantMembership(Collection<? extends i> collection) {
        changeAffiliationByAdmin((Collection) collection, MUCAffiliation.member);
    }

    public void grantMembership(i iVar) {
        changeAffiliationByAdmin(iVar, MUCAffiliation.member, null);
    }

    public void grantModerator(Collection<d> collection) {
        changeRole(collection, MUCRole.moderator);
    }

    public void grantModerator(d dVar) {
        changeRole(dVar, MUCRole.moderator, null);
    }

    public void grantOwnership(Collection<? extends i> collection) {
        changeAffiliationByAdmin((Collection) collection, MUCAffiliation.owner);
    }

    public void grantOwnership(i iVar) {
        changeAffiliationByAdmin(iVar, MUCAffiliation.owner, null);
    }

    public void grantVoice(Collection<d> collection) {
        changeRole(collection, MUCRole.participant);
    }

    public void grantVoice(d dVar) {
        changeRole(dVar, MUCRole.participant, null);
    }

    public void invite(e eVar, String str) {
        invite(new Message(), eVar, str);
    }

    public void invite(Message message, e eVar, String str) {
        message.setTo(this.room);
        ExtensionElement mUCUser = new MUCUser();
        mUCUser.setInvite(new Invite(str, eVar));
        message.addExtension(mUCUser);
        this.connection.sendStanza(message);
    }

    public boolean isJoined() {
        return this.joined;
    }

    public void join(d dVar) {
        join(getEnterConfigurationBuilder(dVar).build());
    }

    public void join(d dVar, String str) {
        join(getEnterConfigurationBuilder(dVar).withPassword(str).build());
    }

    @Deprecated
    public void join(d dVar, String str, DiscussionHistory discussionHistory, long j) {
        join(getEnterConfigurationBuilder(dVar).withPassword(str).timeoutAfter(j).build());
    }

    public synchronized void join(MucEnterConfiguration mucEnterConfiguration) {
        if (this.joined) {
            leave();
        }
        enter(mucEnterConfiguration);
    }

    public void kickParticipant(d dVar, String str) {
        changeRole(dVar, MUCRole.none, str);
    }

    public synchronized void leave() {
        if (this.joined) {
            Stanza presence = new Presence(Presence.Type.unavailable);
            presence.setTo(org.b.a.a.d.a(this.room, this.nickname));
            this.connection.sendStanza(presence);
            this.occupantsMap.clear();
            this.nickname = null;
            this.joined = false;
            userHasLeft();
        }
    }

    public Message nextMessage() {
        if (this.messageCollector != null) {
            return (Message) this.messageCollector.nextResult();
        }
        throw new MucNotJoinedException(this);
    }

    public Message nextMessage(long j) {
        if (this.messageCollector != null) {
            return (Message) this.messageCollector.nextResult(j);
        }
        throw new MucNotJoinedException(this);
    }

    public Message pollMessage() {
        if (this.messageCollector != null) {
            return (Message) this.messageCollector.pollResult();
        }
        throw new MucNotJoinedException(this);
    }

    public boolean removeInvitationRejectionListener(InvitationRejectionListener invitationRejectionListener) {
        return this.invitationRejectionListeners.remove(invitationRejectionListener);
    }

    public boolean removeMessageListener(MessageListener messageListener) {
        return this.messageListeners.remove(messageListener);
    }

    public boolean removeParticipantListener(PresenceListener presenceListener) {
        return this.presenceListeners.remove(presenceListener);
    }

    public boolean removeParticipantStatusListener(ParticipantStatusListener participantStatusListener) {
        return this.participantStatusListeners.remove(participantStatusListener);
    }

    public void removePresenceInterceptor(StanzaListener stanzaListener) {
        this.presenceInterceptors.remove(stanzaListener);
    }

    public boolean removeSubjectUpdatedListener(SubjectUpdatedListener subjectUpdatedListener) {
        return this.subjectUpdatedListeners.remove(subjectUpdatedListener);
    }

    public boolean removeUserStatusListener(UserStatusListener userStatusListener) {
        return this.userStatusListeners.remove(userStatusListener);
    }

    public void requestVoice() {
        ExtensionElement dataForm = new DataForm(Type.submit);
        FormField formField = new FormField(FormField.FORM_TYPE);
        formField.addValue("http://jabber.org/protocol/muc#request");
        dataForm.addField(formField);
        formField = new FormField("muc#role");
        formField.setType(FormField.Type.text_single);
        formField.setLabel("Requested role");
        formField.addValue("participant");
        dataForm.addField(formField);
        Stanza message = new Message(this.room);
        message.addExtension(dataForm);
        this.connection.sendStanza(message);
    }

    public void revokeAdmin(Collection<? extends i> collection) {
        changeAffiliationByAdmin((Collection) collection, MUCAffiliation.admin);
    }

    public void revokeAdmin(g gVar) {
        changeAffiliationByAdmin((i) gVar, MUCAffiliation.member);
    }

    public void revokeMembership(Collection<? extends i> collection) {
        changeAffiliationByAdmin((Collection) collection, MUCAffiliation.none);
    }

    public void revokeMembership(i iVar) {
        changeAffiliationByAdmin(iVar, MUCAffiliation.none, null);
    }

    public void revokeModerator(Collection<d> collection) {
        changeRole(collection, MUCRole.participant);
    }

    public void revokeModerator(d dVar) {
        changeRole(dVar, MUCRole.participant, null);
    }

    public void revokeOwnership(Collection<? extends i> collection) {
        changeAffiliationByAdmin((Collection) collection, MUCAffiliation.admin);
    }

    public void revokeOwnership(i iVar) {
        changeAffiliationByAdmin(iVar, MUCAffiliation.admin, null);
    }

    public void revokeVoice(Collection<d> collection) {
        changeRole(collection, MUCRole.visitor);
    }

    public void revokeVoice(d dVar) {
        changeRole(dVar, MUCRole.visitor, null);
    }

    public void sendConfigurationForm(Form form) {
        IQ mUCOwner = new MUCOwner();
        mUCOwner.setTo(this.room);
        mUCOwner.setType(IQ.Type.set);
        mUCOwner.addExtension(form.getDataFormToSend());
        this.connection.createStanzaCollectorAndSend(mUCOwner).nextResultOrThrow();
    }

    public void sendMessage(String str) {
        Stanza createMessage = createMessage();
        createMessage.setBody(str);
        this.connection.sendStanza(createMessage);
    }

    public void sendMessage(Message message) {
        message.setTo(this.room);
        message.setType(Message.Type.groupchat);
        this.connection.sendStanza(message);
    }

    public void sendRegistrationForm(Form form) {
        IQ registration = new Registration();
        registration.setType(IQ.Type.set);
        registration.setTo(this.room);
        registration.addExtension(form.getDataFormToSend());
        this.connection.createStanzaCollectorAndSend(registration).nextResultOrThrow();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MUC: ");
        stringBuilder.append(this.room);
        stringBuilder.append("(");
        stringBuilder.append(this.connection.getUser());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
