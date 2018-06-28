package org.jivesoftware.smack;

import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.b;
import org.b.a.b.d;
import org.b.a.f;
import org.b.a.i;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.SmackException.AlreadyConnectedException;
import org.jivesoftware.smack.SmackException.AlreadyLoggedInException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.ResourceBindingNotOfferedException;
import org.jivesoftware.smack.SmackException.SecurityRequiredByClientException;
import org.jivesoftware.smack.StanzaCollector.Configuration;
import org.jivesoftware.smack.XMPPConnection.FromMode;
import org.jivesoftware.smack.XMPPException.StreamErrorException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.compression.XMPPInputOutputStream;
import org.jivesoftware.smack.debugger.SmackDebugger;
import org.jivesoftware.smack.filter.IQReplyFilter;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaIdFilter;
import org.jivesoftware.smack.iqrequest.IQRequestHandler;
import org.jivesoftware.smack.packet.Bind;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Nonza;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Type;
import org.jivesoftware.smack.packet.Session;
import org.jivesoftware.smack.packet.Session.Feature;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.StreamError.Condition;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.parsing.ParsingExceptionCallback;
import org.jivesoftware.smack.sasl.core.SASLAnonymous;
import org.jivesoftware.smack.util.BoundedThreadPoolExecutor;
import org.jivesoftware.smack.util.Objects;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smack.util.SmackExecutorThreadFactory;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.dns.HostAddress;
import org.xmlpull.v1.XmlPullParser;

public abstract class AbstractXMPPConnection implements XMPPConnection {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Logger LOGGER = Logger.getLogger(AbstractXMPPConnection.class.getName());
    private static final AtomicInteger connectionCounter = new AtomicInteger(0);
    private static boolean replyToUnknownIqDefault = true;
    private final Map<StanzaListener, ListenerWrapper> asyncRecvListeners = new LinkedHashMap();
    protected boolean authenticated = false;
    private final ExecutorService cachedExecutorService = Executors.newCachedThreadPool(new SmackExecutorThreadFactory(this, "Cached Executor"));
    private final Collection<StanzaCollector> collectors = new ConcurrentLinkedQueue();
    protected XMPPInputOutputStream compressionHandler;
    protected final ConnectionConfiguration config;
    protected boolean connected = false;
    protected final int connectionCounterValue = connectionCounter.getAndIncrement();
    protected final Set<ConnectionListener> connectionListeners = new CopyOnWriteArraySet();
    protected final Lock connectionLock = new ReentrantLock();
    protected SmackDebugger debugger = null;
    private final BoundedThreadPoolExecutor executorService = new BoundedThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, 100, new SmackExecutorThreadFactory(this, "Incoming Processor"));
    private FromMode fromMode = FromMode.OMITTED;
    private final Map<String, IQRequestHandler> getIqRequestHandler = new HashMap();
    protected String host;
    protected List<HostAddress> hostAddresses;
    private final Map<StanzaListener, InterceptorWrapper> interceptors = new HashMap();
    protected final SynchronizationPoint<Exception> lastFeaturesReceived = new SynchronizationPoint(this, "last stream features received from server");
    private long lastStanzaReceived;
    private ParsingExceptionCallback parsingExceptionCallback = SmackConfiguration.getDefaultParsingExceptionCallback();
    protected int port;
    protected Reader reader;
    private final ScheduledExecutorService removeCallbacksService = Executors.newSingleThreadScheduledExecutor(new SmackExecutorThreadFactory(this, "Remove Callbacks"));
    private long replyTimeout = ((long) SmackConfiguration.getDefaultReplyTimeout());
    private boolean replyToUnkownIq = replyToUnknownIqDefault;
    protected final SASLAuthentication saslAuthentication;
    protected final SynchronizationPoint<XMPPException> saslFeatureReceived = new SynchronizationPoint(this, "SASL mechanisms stream feature from server");
    private final Map<StanzaListener, ListenerWrapper> sendListeners = new HashMap();
    private final Map<String, IQRequestHandler> setIqRequestHandler = new HashMap();
    private final ExecutorService singleThreadedExecutorService = Executors.newSingleThreadExecutor(new SmackExecutorThreadFactory(this, "Single Threaded Executor"));
    protected final Map<String, ExtensionElement> streamFeatures = new HashMap();
    protected String streamId;
    private final Map<StanzaListener, ListenerWrapper> syncRecvListeners = new LinkedHashMap();
    protected final SynchronizationPoint<SmackException> tlsHandled = new SynchronizationPoint(this, "establishing TLS");
    private String usedPassword;
    private d usedResource;
    private String usedUsername;
    protected f user;
    protected boolean wasAuthenticated = false;
    protected Writer writer;
    private b xmppServiceDomain;

    protected static class InterceptorWrapper {
        private final StanzaFilter packetFilter;
        private final StanzaListener packetInterceptor;

        public InterceptorWrapper(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
            this.packetInterceptor = stanzaListener;
            this.packetFilter = stanzaFilter;
        }

        public boolean filterMatches(Stanza stanza) {
            if (this.packetFilter != null) {
                if (!this.packetFilter.accept(stanza)) {
                    return false;
                }
            }
            return true;
        }

        public StanzaListener getInterceptor() {
            return this.packetInterceptor;
        }
    }

    protected static class ListenerWrapper {
        private final StanzaFilter packetFilter;
        private final StanzaListener packetListener;

        public ListenerWrapper(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
            this.packetListener = stanzaListener;
            this.packetFilter = stanzaFilter;
        }

        public boolean filterMatches(Stanza stanza) {
            if (this.packetFilter != null) {
                if (!this.packetFilter.accept(stanza)) {
                    return false;
                }
            }
            return true;
        }

        public StanzaListener getListener() {
            return this.packetListener;
        }
    }

    static {
        SmackConfiguration.getVersion();
    }

    protected AbstractXMPPConnection(ConnectionConfiguration connectionConfiguration) {
        this.saslAuthentication = new SASLAuthentication(this, connectionConfiguration);
        this.config = connectionConfiguration;
        for (ConnectionCreationListener connectionCreated : XMPPConnectionRegistry.getConnectionCreationListeners()) {
            connectionCreated.connectionCreated(this);
        }
    }

    private void firePacketInterceptors(Stanza stanza) {
        List<StanzaListener> linkedList = new LinkedList();
        synchronized (this.interceptors) {
            for (InterceptorWrapper interceptorWrapper : this.interceptors.values()) {
                if (interceptorWrapper.filterMatches(stanza)) {
                    linkedList.add(interceptorWrapper.getInterceptor());
                }
            }
        }
        for (StanzaListener processStanza : linkedList) {
            try {
                processStanza.processStanza(stanza);
            } catch (Throwable e) {
                LOGGER.log(Level.SEVERE, "Packet interceptor threw exception", e);
            }
        }
    }

    public static void setReplyToUnknownIqDefault(boolean z) {
        replyToUnknownIqDefault = z;
    }

    public void addAsyncStanzaListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        if (stanzaListener == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        ListenerWrapper listenerWrapper = new ListenerWrapper(stanzaListener, stanzaFilter);
        synchronized (this.asyncRecvListeners) {
            this.asyncRecvListeners.put(stanzaListener, listenerWrapper);
        }
    }

    public void addConnectionListener(ConnectionListener connectionListener) {
        if (connectionListener != null) {
            this.connectionListeners.add(connectionListener);
        }
    }

    public void addOneTimeSyncCallback(final StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        final StanzaListener c78868 = new StanzaListener() {
            public void processStanza(Stanza stanza) {
                try {
                    stanzaListener.processStanza(stanza);
                } finally {
                    AbstractXMPPConnection.this.removeSyncStanzaListener(this);
                }
            }
        };
        addSyncStanzaListener(c78868, stanzaFilter);
        this.removeCallbacksService.schedule(new Runnable() {
            public void run() {
                AbstractXMPPConnection.this.removeSyncStanzaListener(c78868);
            }
        }, getReplyTimeout(), TimeUnit.MILLISECONDS);
    }

    public void addPacketInterceptor(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        if (stanzaListener == null) {
            throw new NullPointerException("Packet interceptor is null.");
        }
        InterceptorWrapper interceptorWrapper = new InterceptorWrapper(stanzaListener, stanzaFilter);
        synchronized (this.interceptors) {
            this.interceptors.put(stanzaListener, interceptorWrapper);
        }
    }

    @Deprecated
    public void addPacketListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        addAsyncStanzaListener(stanzaListener, stanzaFilter);
    }

    public void addPacketSendingListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        if (stanzaListener == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        ListenerWrapper listenerWrapper = new ListenerWrapper(stanzaListener, stanzaFilter);
        synchronized (this.sendListeners) {
            this.sendListeners.put(stanzaListener, listenerWrapper);
        }
    }

    protected void addStreamFeature(ExtensionElement extensionElement) {
        this.streamFeatures.put(org.b.c.b.a(extensionElement.getElementName(), extensionElement.getNamespace()), extensionElement);
    }

    public void addSyncStanzaListener(StanzaListener stanzaListener, StanzaFilter stanzaFilter) {
        if (stanzaListener == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        ListenerWrapper listenerWrapper = new ListenerWrapper(stanzaListener, stanzaFilter);
        synchronized (this.syncRecvListeners) {
            this.syncRecvListeners.put(stanzaListener, listenerWrapper);
        }
    }

    public void afterFeaturesReceived() {
    }

    public void afterSuccessfulLogin(boolean z) {
        this.authenticated = true;
        if (this.config.isDebuggerEnabled() && this.debugger != null) {
            this.debugger.userHasLogged(this.user);
        }
        callConnectionAuthenticatedListener(z);
        if (this.config.isSendPresence() && !z) {
            sendStanza(new Presence(Type.available));
        }
    }

    protected final void asyncGo(Runnable runnable) {
        this.cachedExecutorService.execute(runnable);
    }

    protected void bindResourceAndEstablishSession(d dVar) {
        LOGGER.finer("Waiting for last features to be received before continuing with resource binding");
        this.lastFeaturesReceived.checkIfSuccessOrWait();
        if (hasFeature(Bind.ELEMENT, Bind.NAMESPACE)) {
            Stanza newSet = Bind.newSet(dVar);
            this.user = ((Bind) createStanzaCollectorAndSend(new StanzaIdFilter(newSet), newSet).nextResultOrThrow()).getJid();
            this.xmppServiceDomain = this.user.t();
            Feature feature = (Feature) getFeature(Session.ELEMENT, Session.NAMESPACE);
            boolean isLegacySessionDisabled = getConfiguration().isLegacySessionDisabled();
            if (feature != null && !feature.isOptional() && !isLegacySessionDisabled) {
                newSet = new Session();
                createStanzaCollectorAndSend(new StanzaIdFilter(newSet), newSet).nextResultOrThrow();
                return;
            }
            return;
        }
        throw new ResourceBindingNotOfferedException();
    }

    protected void callConnectionAuthenticatedListener(boolean z) {
        for (ConnectionListener authenticated : this.connectionListeners) {
            try {
                authenticated.authenticated(this, z);
            } catch (Throwable e) {
                LOGGER.log(Level.SEVERE, "Exception in authenticated listener", e);
            }
        }
    }

    void callConnectionClosedListener() {
        for (ConnectionListener connectionClosed : this.connectionListeners) {
            try {
                connectionClosed.connectionClosed();
            } catch (Throwable e) {
                LOGGER.log(Level.SEVERE, "Error in listener while closing connection", e);
            }
        }
    }

    protected void callConnectionClosedOnErrorListener(Exception exception) {
        Object obj;
        if ((exception instanceof StreamErrorException) && ((StreamErrorException) exception).getStreamError().getCondition() == Condition.not_authorized && this.wasAuthenticated) {
            obj = null;
            LOGGER.log(Level.FINE, "Connection closed with not-authorized stream error after it was already authenticated. The account was likely deleted/unregistered on the server");
        } else {
            obj = 1;
        }
        if (obj != null) {
            Logger logger = LOGGER;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder("Connection ");
            stringBuilder.append(this);
            stringBuilder.append(" closed with error");
            logger.log(level, stringBuilder.toString(), exception);
        }
        for (ConnectionListener connectionClosedOnError : this.connectionListeners) {
            try {
                connectionClosedOnError.connectionClosedOnError(exception);
            } catch (Throwable e) {
                LOGGER.log(Level.SEVERE, "Error in listener while closing connection", e);
            }
        }
    }

    protected void callConnectionConnectedListener() {
        for (ConnectionListener connected : this.connectionListeners) {
            connected.connected(this);
        }
    }

    public synchronized AbstractXMPPConnection connect() {
        throwAlreadyConnectedExceptionIfAppropriate();
        this.saslAuthentication.init();
        this.saslFeatureReceived.init();
        this.lastFeaturesReceived.init();
        this.tlsHandled.init();
        this.streamId = null;
        connectInternal();
        this.tlsHandled.checkIfSuccessOrWaitOrThrow();
        this.saslFeatureReceived.checkIfSuccessOrWaitOrThrow();
        if (isSecureConnection() || getConfiguration().getSecurityMode() != SecurityMode.required) {
            this.connected = true;
            callConnectionConnectedListener();
        } else {
            shutdown();
            throw new SecurityRequiredByClientException();
        }
        return this;
    }

    public abstract void connectInternal();

    public StanzaCollector createStanzaCollector(Configuration configuration) {
        StanzaCollector stanzaCollector = new StanzaCollector(this, configuration);
        this.collectors.add(stanzaCollector);
        return stanzaCollector;
    }

    public StanzaCollector createStanzaCollector(StanzaFilter stanzaFilter) {
        return createStanzaCollector(StanzaCollector.newConfiguration().setStanzaFilter(stanzaFilter));
    }

    public StanzaCollector createStanzaCollectorAndSend(StanzaFilter stanzaFilter, Stanza stanza) {
        StanzaCollector createStanzaCollector = createStanzaCollector(stanzaFilter);
        try {
            sendStanza(stanza);
            return createStanzaCollector;
        } catch (InterruptedException e) {
            createStanzaCollector.cancel();
            throw e;
        }
    }

    public StanzaCollector createStanzaCollectorAndSend(IQ iq) {
        return createStanzaCollectorAndSend(new IQReplyFilter(iq, this), iq);
    }

    public void disconnect() {
        try {
            disconnect(new Presence(Type.unavailable));
        } catch (Throwable e) {
            LOGGER.log(Level.FINEST, "Connection is already disconnected", e);
        }
    }

    public synchronized void disconnect(Presence presence) {
        try {
            sendStanza(presence);
        } catch (Throwable e) {
            LOGGER.log(Level.FINE, "Was interrupted while sending unavailable presence. Continuing to disconnect the connection", e);
        }
        shutdown();
        callConnectionClosedListener();
    }

    protected void finalize() {
        Logger logger = LOGGER;
        StringBuilder stringBuilder = new StringBuilder("finalizing ");
        stringBuilder.append(this);
        stringBuilder.append(": Shutting down executor services");
        logger.fine(stringBuilder.toString());
        try {
            this.executorService.shutdownNow();
            this.cachedExecutorService.shutdown();
            this.removeCallbacksService.shutdownNow();
            this.singleThreadedExecutorService.shutdownNow();
        } catch (Throwable th) {
            LOGGER.log(Level.WARNING, "finalize() threw trhowable", th);
        } finally {
            super.finalize();
        }
    }

    protected void firePacketSendingListeners(final Stanza stanza) {
        final List linkedList = new LinkedList();
        synchronized (this.sendListeners) {
            for (ListenerWrapper listenerWrapper : this.sendListeners.values()) {
                if (listenerWrapper.filterMatches(stanza)) {
                    linkedList.add(listenerWrapper.getListener());
                }
            }
        }
        if (!linkedList.isEmpty()) {
            asyncGo(new Runnable() {
                public void run() {
                    for (StanzaListener processStanza : linkedList) {
                        try {
                            processStanza.processStanza(stanza);
                        } catch (Throwable e) {
                            AbstractXMPPConnection.LOGGER.log(Level.WARNING, "Sending listener threw exception", e);
                        }
                    }
                }
            });
        }
    }

    public ConnectionConfiguration getConfiguration() {
        return this.config;
    }

    public int getConnectionCounter() {
        return this.connectionCounterValue;
    }

    protected Lock getConnectionLock() {
        return this.connectionLock;
    }

    public <F extends ExtensionElement> F getFeature(String str, String str2) {
        return (ExtensionElement) this.streamFeatures.get(org.b.c.b.a(str, str2));
    }

    public FromMode getFromMode() {
        return this.fromMode;
    }

    public String getHost() {
        return this.host;
    }

    public long getLastStanzaReceived() {
        return this.lastStanzaReceived;
    }

    public long getPacketReplyTimeout() {
        return getReplyTimeout();
    }

    public ParsingExceptionCallback getParsingExceptionCallback() {
        return this.parsingExceptionCallback;
    }

    public int getPort() {
        return this.port;
    }

    public long getReplyTimeout() {
        return this.replyTimeout;
    }

    protected SASLAuthentication getSASLAuthentication() {
        return this.saslAuthentication;
    }

    public b getServiceName() {
        return getXMPPServiceDomain();
    }

    public String getStreamId() {
        return !isConnected() ? null : this.streamId;
    }

    public final String getUsedSaslMechansism() {
        return this.saslAuthentication.getNameOfLastUsedSaslMechansism();
    }

    public final f getUser() {
        return this.user;
    }

    public b getXMPPServiceDomain() {
        return this.xmppServiceDomain != null ? this.xmppServiceDomain : this.config.getXMPPServiceDomain();
    }

    public boolean hasFeature(String str, String str2) {
        return getFeature(str, str2) != null;
    }

    protected void initDebugger() {
        if (this.reader != null) {
            if (this.writer != null) {
                if (this.config.isDebuggerEnabled()) {
                    if (this.debugger == null) {
                        this.debugger = SmackConfiguration.createDebugger(this, this.writer, this.reader);
                    }
                    if (this.debugger == null) {
                        LOGGER.severe("Debugging enabled but could not find debugger class");
                        return;
                    } else {
                        this.reader = this.debugger.newConnectionReader(this.reader);
                        this.writer = this.debugger.newConnectionWriter(this.writer);
                    }
                }
                return;
            }
        }
        throw new NullPointerException("Reader or writer isn't initialized.");
    }

    protected void invokeStanzaCollectorsAndNotifyRecvListeners(final Stanza stanza) {
        if (stanza instanceof IQ) {
            final IQ iq = (IQ) stanza;
            IQ.Type type = iq.getType();
            switch (type) {
                case set:
                case get:
                    IQRequestHandler iQRequestHandler;
                    String a = org.b.c.b.a(iq.getChildElementName(), iq.getChildElementNamespace());
                    switch (type) {
                        case set:
                            synchronized (this.setIqRequestHandler) {
                                iQRequestHandler = (IQRequestHandler) this.setIqRequestHandler.get(a);
                            }
                        case get:
                            synchronized (this.getIqRequestHandler) {
                                iQRequestHandler = (IQRequestHandler) this.getIqRequestHandler.get(a);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Should only encounter IQ type 'get' or 'set'");
                    }
                    if (iQRequestHandler == null) {
                        if (this.replyToUnkownIq) {
                            try {
                                sendStanza(IQ.createErrorResponse(iq, XMPPError.getBuilder(XMPPError.Condition.service_unavailable)));
                                break;
                            } catch (Throwable e) {
                                LOGGER.log(Level.WARNING, "Exception while sending error IQ to unkown IQ request", e);
                                break;
                            }
                        }
                        return;
                    }
                    ExecutorService executorService = null;
                    switch (iQRequestHandler.getMode()) {
                        case sync:
                            executorService = this.singleThreadedExecutorService;
                            break;
                        case async:
                            executorService = this.cachedExecutorService;
                            break;
                        default:
                            break;
                    }
                    executorService.execute(new Runnable() {
                        public void run() {
                            Stanza handleIQRequest = iQRequestHandler.handleIQRequest(iq);
                            if (handleIQRequest != null) {
                                try {
                                    AbstractXMPPConnection.this.sendStanza(handleIQRequest);
                                } catch (Throwable e) {
                                    AbstractXMPPConnection.LOGGER.log(Level.WARNING, "Exception while sending response to IQ request", e);
                                }
                            }
                        }
                    });
                    return;
                default:
                    break;
            }
        }
        final Collection<StanzaListener> linkedList = new LinkedList();
        synchronized (this.asyncRecvListeners) {
            for (ListenerWrapper listenerWrapper : this.asyncRecvListeners.values()) {
                if (listenerWrapper.filterMatches(stanza)) {
                    linkedList.add(listenerWrapper.getListener());
                }
            }
        }
        for (final StanzaListener stanzaListener : linkedList) {
            asyncGo(new Runnable() {
                public void run() {
                    try {
                        stanzaListener.processStanza(stanza);
                    } catch (Throwable e) {
                        AbstractXMPPConnection.LOGGER.log(Level.SEVERE, "Exception in async packet listener", e);
                    }
                }
            });
        }
        for (StanzaCollector processStanza : this.collectors) {
            processStanza.processStanza(stanza);
        }
        linkedList.clear();
        synchronized (this.syncRecvListeners) {
            for (ListenerWrapper listenerWrapper2 : this.syncRecvListeners.values()) {
                if (listenerWrapper2.filterMatches(stanza)) {
                    linkedList.add(listenerWrapper2.getListener());
                }
            }
        }
        this.singleThreadedExecutorService.execute(new Runnable() {
            public void run() {
                for (StanzaListener processStanza : linkedList) {
                    try {
                        processStanza.processStanza(stanza);
                    } catch (Throwable e) {
                        AbstractXMPPConnection.LOGGER.log(Level.WARNING, "Got not connected exception, aborting", e);
                        return;
                    } catch (Throwable e2) {
                        AbstractXMPPConnection.LOGGER.log(Level.SEVERE, "Exception in packet listener", e2);
                    }
                }
            }
        });
    }

    public final boolean isAnonymous() {
        return isAuthenticated() && SASLAnonymous.NAME.equals(getUsedSaslMechansism());
    }

    public final boolean isAuthenticated() {
        return this.authenticated;
    }

    public final boolean isConnected() {
        return this.connected;
    }

    public abstract boolean isSecureConnection();

    public abstract boolean isUsingCompression();

    public synchronized void login() {
        login(this.usedUsername != null ? this.usedUsername : this.config.getUsername(), this.usedPassword != null ? this.usedPassword : this.config.getPassword(), this.usedResource != null ? this.usedResource : this.config.getResource());
    }

    public synchronized void login(CharSequence charSequence, String str) {
        login(charSequence, str, this.config.getResource());
    }

    public synchronized void login(CharSequence charSequence, String str, d dVar) {
        if (!this.config.allowNullOrEmptyUsername) {
            StringUtils.requireNotNullOrEmpty(charSequence, "Username must not be null or empty");
        }
        throwNotConnectedExceptionIfAppropriate("Did you call connect() before login()?");
        throwAlreadyLoggedInExceptionIfAppropriate();
        this.usedUsername = charSequence != null ? charSequence.toString() : null;
        this.usedPassword = str;
        this.usedResource = dVar;
        loginInternal(this.usedUsername, this.usedPassword, this.usedResource);
    }

    public abstract void loginInternal(String str, String str2, d dVar);

    protected void notifyReconnection() {
        for (ConnectionListener reconnectionSuccessful : this.connectionListeners) {
            try {
                reconnectionSuccessful.reconnectionSuccessful();
            } catch (Throwable e) {
                LOGGER.log(Level.WARNING, "notifyReconnection()", e);
            }
        }
    }

    protected void parseAndProcessStanza(XmlPullParser xmlPullParser) {
        Stanza parseStanza;
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        try {
            parseStanza = PacketParserUtils.parseStanza(xmlPullParser);
        } catch (Exception e) {
            UnparseableStanza unparseableStanza = new UnparseableStanza(PacketParserUtils.parseContentDepth(xmlPullParser, depth), e);
            ParsingExceptionCallback parsingExceptionCallback = getParsingExceptionCallback();
            if (parsingExceptionCallback != null) {
                parsingExceptionCallback.handleUnparsableStanza(unparseableStanza);
            }
            parseStanza = null;
        }
        ParserUtils.assertAtEndTag(xmlPullParser);
        if (parseStanza != null) {
            processStanza(parseStanza);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void parseFeatures(org.xmlpull.v1.XmlPullParser r9) {
        /*
        r8 = this;
        r0 = r8.streamFeatures;
        r0.clear();
        r0 = r9.getDepth();
    L_0x0009:
        r1 = r9.next();
        r2 = 3;
        r3 = 2;
        if (r1 != r3) goto L_0x008f;
    L_0x0011:
        r4 = r9.getDepth();
        r5 = r0 + 1;
        if (r4 != r5) goto L_0x008f;
    L_0x0019:
        r1 = 0;
        r4 = r9.getName();
        r5 = r9.getNamespace();
        r6 = -1;
        r7 = r4.hashCode();
        switch(r7) {
            case -676919238: goto L_0x0052;
            case 3023933: goto L_0x0048;
            case 1316817241: goto L_0x003e;
            case 1431984486: goto L_0x0034;
            case 1984987798: goto L_0x002b;
            default: goto L_0x002a;
        };
    L_0x002a:
        goto L_0x005c;
    L_0x002b:
        r3 = "session";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x005c;
    L_0x0033:
        goto L_0x005d;
    L_0x0034:
        r2 = "compression";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x005c;
    L_0x003c:
        r2 = 4;
        goto L_0x005d;
    L_0x003e:
        r2 = "starttls";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x005c;
    L_0x0046:
        r2 = 0;
        goto L_0x005d;
    L_0x0048:
        r2 = "bind";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x005c;
    L_0x0050:
        r2 = r3;
        goto L_0x005d;
    L_0x0052:
        r2 = "mechanisms";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x005c;
    L_0x005a:
        r2 = 1;
        goto L_0x005d;
    L_0x005c:
        r2 = r6;
    L_0x005d:
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x007a;
            case 2: goto L_0x0077;
            case 3: goto L_0x0072;
            case 4: goto L_0x006d;
            default: goto L_0x0060;
        };
    L_0x0060:
        r2 = org.jivesoftware.smack.provider.ProviderManager.getStreamFeatureProvider(r4, r5);
        if (r2 == 0) goto L_0x0088;
    L_0x0066:
        r1 = r2.parse(r9);
        r1 = (org.jivesoftware.smack.packet.ExtensionElement) r1;
        goto L_0x0088;
    L_0x006d:
        r1 = org.jivesoftware.smack.util.PacketParserUtils.parseCompressionFeature(r9);
        goto L_0x0088;
    L_0x0072:
        r1 = org.jivesoftware.smack.util.PacketParserUtils.parseSessionFeature(r9);
        goto L_0x0088;
    L_0x0077:
        r1 = org.jivesoftware.smack.packet.Bind.Feature.INSTANCE;
        goto L_0x0088;
    L_0x007a:
        r1 = new org.jivesoftware.smack.packet.Mechanisms;
        r2 = org.jivesoftware.smack.util.PacketParserUtils.parseMechanisms(r9);
        r1.<init>(r2);
        goto L_0x0088;
    L_0x0084:
        r1 = org.jivesoftware.smack.util.PacketParserUtils.parseStartTlsFeature(r9);
    L_0x0088:
        if (r1 == 0) goto L_0x0009;
    L_0x008a:
        r8.addStreamFeature(r1);
        goto L_0x0009;
    L_0x008f:
        if (r1 != r2) goto L_0x0009;
    L_0x0091:
        r1 = r9.getDepth();
        if (r1 == r0) goto L_0x0099;
    L_0x0097:
        goto L_0x0009;
    L_0x0099:
        r9 = "mechanisms";
        r0 = "urn:ietf:params:xml:ns:xmpp-sasl";
        r9 = r8.hasFeature(r9, r0);
        if (r9 == 0) goto L_0x00c1;
    L_0x00a3:
        r9 = "starttls";
        r0 = "urn:ietf:params:xml:ns:xmpp-tls";
        r9 = r8.hasFeature(r9, r0);
        if (r9 == 0) goto L_0x00b7;
    L_0x00ad:
        r9 = r8.config;
        r9 = r9.getSecurityMode();
        r0 = org.jivesoftware.smack.ConnectionConfiguration.SecurityMode.disabled;
        if (r9 != r0) goto L_0x00c1;
    L_0x00b7:
        r9 = r8.tlsHandled;
        r9.reportSuccess();
        r9 = r8.saslFeatureReceived;
        r9.reportSuccess();
    L_0x00c1:
        r9 = "bind";
        r0 = "urn:ietf:params:xml:ns:xmpp-bind";
        r9 = r8.hasFeature(r9, r0);
        if (r9 == 0) goto L_0x00e2;
    L_0x00cb:
        r9 = "compression";
        r0 = "http://jabber.org/protocol/compress";
        r9 = r8.hasFeature(r9, r0);
        if (r9 == 0) goto L_0x00dd;
    L_0x00d5:
        r9 = r8.config;
        r9 = r9.isCompressionEnabled();
        if (r9 != 0) goto L_0x00e2;
    L_0x00dd:
        r9 = r8.lastFeaturesReceived;
        r9.reportSuccess();
    L_0x00e2:
        r8.afterFeaturesReceived();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.AbstractXMPPConnection.parseFeatures(org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.util.List<org.jivesoftware.smack.util.dns.HostAddress> populateHostAddresses() {
        /*
        r5 = this;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r1 = r5.config;
        r1 = r1.hostAddress;
        r2 = 1;
        if (r1 == 0) goto L_0x0021;
    L_0x000c:
        r1 = new java.util.ArrayList;
        r1.<init>(r2);
        r5.hostAddresses = r1;
        r1 = new org.jivesoftware.smack.util.dns.HostAddress;
        r2 = r5.config;
        r2 = r2.port;
        r3 = r5.config;
        r3 = r3.hostAddress;
        r1.<init>(r2, r3);
        goto L_0x0046;
    L_0x0021:
        r1 = r5.config;
        r1 = r1.host;
        if (r1 == 0) goto L_0x004c;
    L_0x0027:
        r1 = new java.util.ArrayList;
        r1.<init>(r2);
        r5.hostAddresses = r1;
        r1 = org.jivesoftware.smack.util.DNSUtil.getDNSResolver();
        r2 = r5.config;
        r2 = r2.host;
        r3 = r5.config;
        r3 = r3.port;
        r4 = r5.config;
        r4 = r4.getDnssecMode();
        r1 = r1.lookupHostAddress(r2, r3, r0, r4);
        if (r1 == 0) goto L_0x0062;
    L_0x0046:
        r2 = r5.hostAddresses;
        r2.add(r1);
        return r0;
    L_0x004c:
        r1 = r5.config;
        r1 = r1.getXMPPServiceDomain();
        r1 = r1.toString();
        r2 = r5.config;
        r2 = r2.getDnssecMode();
        r1 = org.jivesoftware.smack.util.DNSUtil.resolveXMPPServiceDomain(r1, r0, r2);
        r5.hostAddresses = r1;
    L_0x0062:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.AbstractXMPPConnection.populateHostAddresses():java.util.List<org.jivesoftware.smack.util.dns.HostAddress>");
    }

    protected void processStanza(final Stanza stanza) {
        this.lastStanzaReceived = System.currentTimeMillis();
        this.executorService.executeBlocking(new Runnable() {
            public void run() {
                AbstractXMPPConnection.this.invokeStanzaCollectorsAndNotifyRecvListeners(stanza);
            }
        });
    }

    public IQRequestHandler registerIQRequestHandler(IQRequestHandler iQRequestHandler) {
        String a = org.b.c.b.a(iQRequestHandler.getElement(), iQRequestHandler.getNamespace());
        switch (iQRequestHandler.getType()) {
            case set:
                synchronized (this.setIqRequestHandler) {
                    iQRequestHandler = (IQRequestHandler) this.setIqRequestHandler.put(a, iQRequestHandler);
                }
                return iQRequestHandler;
            case get:
                synchronized (this.getIqRequestHandler) {
                    iQRequestHandler = (IQRequestHandler) this.getIqRequestHandler.put(a, iQRequestHandler);
                }
                return iQRequestHandler;
            default:
                throw new IllegalArgumentException("Only IQ type of 'get' and 'set' allowed");
        }
    }

    public boolean removeAsyncStanzaListener(StanzaListener stanzaListener) {
        boolean z;
        synchronized (this.asyncRecvListeners) {
            z = this.asyncRecvListeners.remove(stanzaListener) != null;
        }
        return z;
    }

    public void removeConnectionListener(ConnectionListener connectionListener) {
        this.connectionListeners.remove(connectionListener);
    }

    public void removePacketInterceptor(StanzaListener stanzaListener) {
        synchronized (this.interceptors) {
            this.interceptors.remove(stanzaListener);
        }
    }

    @Deprecated
    public boolean removePacketListener(StanzaListener stanzaListener) {
        return removeAsyncStanzaListener(stanzaListener);
    }

    public void removePacketSendingListener(StanzaListener stanzaListener) {
        synchronized (this.sendListeners) {
            this.sendListeners.remove(stanzaListener);
        }
    }

    public void removeStanzaCollector(StanzaCollector stanzaCollector) {
        this.collectors.remove(stanzaCollector);
    }

    public boolean removeSyncStanzaListener(StanzaListener stanzaListener) {
        boolean z;
        synchronized (this.syncRecvListeners) {
            z = this.syncRecvListeners.remove(stanzaListener) != null;
        }
        return z;
    }

    protected final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.removeCallbacksService.schedule(runnable, j, timeUnit);
    }

    public void sendIqWithResponseCallback(IQ iq, StanzaListener stanzaListener) {
        sendIqWithResponseCallback(iq, stanzaListener, null);
    }

    public void sendIqWithResponseCallback(IQ iq, StanzaListener stanzaListener, ExceptionCallback exceptionCallback) {
        sendIqWithResponseCallback(iq, stanzaListener, exceptionCallback, getReplyTimeout());
    }

    public void sendIqWithResponseCallback(IQ iq, StanzaListener stanzaListener, ExceptionCallback exceptionCallback, long j) {
        sendStanzaWithResponseCallback(iq, new IQReplyFilter(iq, this), stanzaListener, exceptionCallback, j);
    }

    public abstract void sendNonza(Nonza nonza);

    @Deprecated
    public void sendPacket(Stanza stanza) {
        sendStanza(stanza);
    }

    public void sendStanza(Stanza stanza) {
        i iVar;
        Objects.requireNonNull(stanza, "Stanza must not be null");
        throwNotConnectedExceptionIfAppropriate();
        switch (this.fromMode) {
            case OMITTED:
                iVar = null;
                break;
            case USER:
                iVar = getUser();
                break;
            default:
                break;
        }
        stanza.setFrom(iVar);
        firePacketInterceptors(stanza);
        sendStanzaInternal(stanza);
    }

    public abstract void sendStanzaInternal(Stanza stanza);

    public void sendStanzaWithResponseCallback(Stanza stanza, StanzaFilter stanzaFilter, StanzaListener stanzaListener) {
        sendStanzaWithResponseCallback(stanza, stanzaFilter, stanzaListener, null);
    }

    public void sendStanzaWithResponseCallback(Stanza stanza, StanzaFilter stanzaFilter, StanzaListener stanzaListener, ExceptionCallback exceptionCallback) {
        sendStanzaWithResponseCallback(stanza, stanzaFilter, stanzaListener, exceptionCallback, getReplyTimeout());
    }

    public void sendStanzaWithResponseCallback(Stanza stanza, final StanzaFilter stanzaFilter, final StanzaListener stanzaListener, final ExceptionCallback exceptionCallback, long j) {
        Objects.requireNonNull(stanza, "stanza must not be null");
        Objects.requireNonNull(stanzaFilter, "replyFilter must not be null");
        Objects.requireNonNull(stanzaListener, "callback must not be null");
        final StanzaListener c78856 = new StanzaListener() {
            public void processStanza(Stanza stanza) {
                if (AbstractXMPPConnection.this.removeAsyncStanzaListener(this)) {
                    try {
                        XMPPErrorException.ifHasErrorThenThrow(stanza);
                        stanzaListener.processStanza(stanza);
                    } catch (Exception e) {
                        if (exceptionCallback != null) {
                            exceptionCallback.processException(e);
                        }
                    }
                }
            }
        };
        this.removeCallbacksService.schedule(new Runnable() {
            public void run() {
                if (AbstractXMPPConnection.this.removeAsyncStanzaListener(c78856) && exceptionCallback != null) {
                    exceptionCallback.processException(!AbstractXMPPConnection.this.isConnected() ? new NotConnectedException(AbstractXMPPConnection.this, stanzaFilter) : NoResponseException.newWith(AbstractXMPPConnection.this, stanzaFilter));
                }
            }
        }, j, TimeUnit.MILLISECONDS);
        addAsyncStanzaListener(c78856, stanzaFilter);
        sendStanza(stanza);
    }

    public void setFromMode(FromMode fromMode) {
        this.fromMode = fromMode;
    }

    public void setPacketReplyTimeout(long j) {
        setReplyTimeout(j);
    }

    public void setParsingExceptionCallback(ParsingExceptionCallback parsingExceptionCallback) {
        this.parsingExceptionCallback = parsingExceptionCallback;
    }

    public void setReplyTimeout(long j) {
        this.replyTimeout = j;
    }

    public void setReplyToUnknownIq(boolean z) {
        this.replyToUnkownIq = z;
    }

    protected void setWasAuthenticated() {
        if (!this.wasAuthenticated) {
            this.wasAuthenticated = this.authenticated;
        }
    }

    public abstract void shutdown();

    public void throwAlreadyConnectedExceptionIfAppropriate() {
        if (isConnected()) {
            throw new AlreadyConnectedException();
        }
    }

    public void throwAlreadyLoggedInExceptionIfAppropriate() {
        if (isAuthenticated()) {
            throw new AlreadyLoggedInException();
        }
    }

    public void throwNotConnectedExceptionIfAppropriate() {
        throwNotConnectedExceptionIfAppropriate(null);
    }

    protected void throwNotConnectedExceptionIfAppropriate(String str) {
        if (!isConnected()) {
            throw new NotConnectedException(str);
        }
    }

    public final String toString() {
        f user = getUser();
        String obj = user == null ? "not-authenticated" : user.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append(obj);
        stringBuilder.append("] (");
        stringBuilder.append(getConnectionCounter());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public IQRequestHandler unregisterIQRequestHandler(String str, String str2, IQ.Type type) {
        str = org.b.c.b.a(str, str2);
        IQRequestHandler iQRequestHandler;
        switch (type) {
            case set:
                synchronized (this.setIqRequestHandler) {
                    iQRequestHandler = (IQRequestHandler) this.setIqRequestHandler.remove(str);
                }
                return iQRequestHandler;
            case get:
                synchronized (this.getIqRequestHandler) {
                    iQRequestHandler = (IQRequestHandler) this.getIqRequestHandler.remove(str);
                }
                return iQRequestHandler;
            default:
                throw new IllegalArgumentException("Only IQ type of 'get' and 'set' allowed");
        }
    }

    public final IQRequestHandler unregisterIQRequestHandler(IQRequestHandler iQRequestHandler) {
        return unregisterIQRequestHandler(iQRequestHandler.getElement(), iQRequestHandler.getNamespace(), iQRequestHandler.getType());
    }
}
