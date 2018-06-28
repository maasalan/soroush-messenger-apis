package org.jivesoftware.smack.sasl.provided;

import javax.security.auth.callback.CallbackHandler;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.MD5;
import org.jivesoftware.smack.util.StringUtils;

public class SASLDigestMD5Mechanism extends SASLMechanism {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String INITAL_NONCE = "00000001";
    public static final String NAME = "DIGEST-MD5";
    private static final String QOP_VALUE = "auth";
    private static boolean verifyServerResponse = true;
    private String cnonce;
    private String digestUri;
    private String hex_hashed_a1;
    private String nonce;
    private State state = State.INITIAL;

    static /* synthetic */ class C77561 {
        static final /* synthetic */ int[] f24832xa1fe489b = new int[State.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.State.values();
            r0 = r0.length;
            r0 = new int[r0];
            f24832xa1fe489b = r0;
            r0 = f24832xa1fe489b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.State.INITIAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f24832xa1fe489b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.State.RESPONSE_SENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.1.<clinit>():void");
        }
    }

    private enum DigestType {
        ClientResponse,
        ServerResponse
    }

    private enum State {
        INITIAL,
        RESPONSE_SENT,
        VALID_SERVER_RESPONSE
    }

    private String calcResponse(DigestType digestType) {
        StringBuilder stringBuilder = new StringBuilder();
        if (digestType == DigestType.ClientResponse) {
            stringBuilder.append("AUTHENTICATE");
        }
        stringBuilder.append(':');
        stringBuilder.append(this.digestUri);
        String encodeHex = StringUtils.encodeHex(MD5.bytes(stringBuilder.toString()));
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.hex_hashed_a1);
        stringBuilder2.append(':');
        stringBuilder2.append(this.nonce);
        stringBuilder2.append(':');
        stringBuilder2.append(INITAL_NONCE);
        stringBuilder2.append(':');
        stringBuilder2.append(this.cnonce);
        stringBuilder2.append(':');
        stringBuilder2.append("auth");
        stringBuilder2.append(':');
        stringBuilder2.append(encodeHex);
        return StringUtils.encodeHex(MD5.bytes(stringBuilder2.toString()));
    }

    public static String quoteBackslash(String str) {
        return str.replace("\\", "\\\\");
    }

    public static void setVerifyServerResponse(boolean z) {
        verifyServerResponse = z;
    }

    protected void authenticateInternal(CallbackHandler callbackHandler) {
        throw new UnsupportedOperationException("CallbackHandler not (yet) supported");
    }

    public boolean authzidSupported() {
        return true;
    }

    public void checkIfSuccessfulOrThrow() {
        if (verifyServerResponse && this.state != State.VALID_SERVER_RESPONSE) {
            throw new SmackException("DIGEST-MD5 no valid server response");
        }
    }

    protected byte[] evaluateChallenge(byte[] r9) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:54:0x01d1 in {3, 9, 16, 17, 18, 21, 25, 26, 28, 36, 37, 43, 44, 48, 51, 52, 53, 57} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r8 = this;
        r0 = r9.length;
        if (r0 != 0) goto L_0x000b;
    L_0x0003:
        r9 = new org.jivesoftware.smack.SmackException;
        r0 = "Initial challenge has zero length";
        r9.<init>(r0);
        throw r9;
    L_0x000b:
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x01d2 }
        r1 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x01d2 }
        r0.<init>(r9, r1);	 Catch:{ UnsupportedEncodingException -> 0x01d2 }
        r9 = ",";
        r9 = r0.split(r9);
        r0 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.C77561.f24832xa1fe489b;
        r1 = r8.state;
        r1 = r1.ordinal();
        r0 = r0[r1];
        r1 = 0;
        r2 = 1;
        r3 = 0;
        switch(r0) {
            case 1: goto L_0x0072;
            case 2: goto L_0x002e;
            default: goto L_0x0028;
        };
    L_0x0028:
        r9 = new java.lang.IllegalStateException;
        r9.<init>();
        throw r9;
    L_0x002e:
        r0 = verifyServerResponse;
        if (r0 == 0) goto L_0x006d;
    L_0x0032:
        r0 = r9.length;
        r4 = r3;
    L_0x0034:
        if (r4 >= r0) goto L_0x004e;
    L_0x0036:
        r5 = r9[r4];
        r6 = "=";
        r5 = r5.split(r6);
        r6 = r5[r3];
        r5 = r5[r2];
        r7 = "rspauth";
        r6 = r7.equals(r6);
        if (r6 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x004f;
    L_0x004b:
        r4 = r4 + 1;
        goto L_0x0034;
    L_0x004e:
        r5 = r1;
    L_0x004f:
        if (r5 != 0) goto L_0x0059;
    L_0x0051:
        r9 = new org.jivesoftware.smack.SmackException;
        r0 = "No server response received while performing DIGEST-MD5 authentication";
        r9.<init>(r0);
        throw r9;
    L_0x0059:
        r9 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.DigestType.ServerResponse;
        r9 = r8.calcResponse(r9);
        r9 = r5.equals(r9);
        if (r9 != 0) goto L_0x006d;
    L_0x0065:
        r9 = new org.jivesoftware.smack.SmackException;
        r0 = "Invalid server response  while performing DIGEST-MD5 authentication";
        r9.<init>(r0);
        throw r9;
    L_0x006d:
        r9 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.State.VALID_SERVER_RESPONSE;
    L_0x006f:
        r8.state = r9;
        return r1;
    L_0x0072:
        r0 = r9.length;
        r1 = r3;
    L_0x0074:
        if (r1 >= r0) goto L_0x00d8;
    L_0x0076:
        r4 = r9[r1];
        r5 = "=";
        r4 = r4.split(r5);
        r5 = r4[r3];
        r6 = "^\\s+";
        r7 = "";
        r5 = r5.replaceFirst(r6, r7);
        r4 = r4[r2];
        r6 = "nonce";
        r6 = r6.equals(r5);
        if (r6 == 0) goto L_0x00a9;
    L_0x0092:
        r5 = r8.nonce;
        if (r5 == 0) goto L_0x009e;
    L_0x0096:
        r9 = new org.jivesoftware.smack.SmackException;
        r0 = "Nonce value present multiple times";
        r9.<init>(r0);
        throw r9;
    L_0x009e:
        r5 = "\"";
        r6 = "";
        r4 = r4.replace(r5, r6);
        r8.nonce = r4;
        goto L_0x00d5;
    L_0x00a9:
        r6 = "qop";
        r5 = r6.equals(r5);
        if (r5 == 0) goto L_0x00d5;
    L_0x00b1:
        r5 = "\"";
        r6 = "";
        r4 = r4.replace(r5, r6);
        r5 = "auth";
        r5 = r4.equals(r5);
        if (r5 != 0) goto L_0x00d5;
    L_0x00c1:
        r9 = new org.jivesoftware.smack.SmackException;
        r0 = new java.lang.StringBuilder;
        r1 = "Unsupported qop operation: ";
        r0.<init>(r1);
        r0.append(r4);
        r0 = r0.toString();
        r9.<init>(r0);
        throw r9;
    L_0x00d5:
        r1 = r1 + 1;
        goto L_0x0074;
    L_0x00d8:
        r9 = r8.nonce;
        if (r9 != 0) goto L_0x00e4;
    L_0x00dc:
        r9 = new org.jivesoftware.smack.SmackException;
        r0 = "nonce value not present in initial challenge";
        r9.<init>(r0);
        throw r9;
    L_0x00e4:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = r8.authenticationId;
        r9.append(r0);
        r0 = 58;
        r9.append(r0);
        r1 = r8.serviceName;
        r9.append(r1);
        r9.append(r0);
        r1 = r8.password;
        r9.append(r1);
        r9 = r9.toString();
        r9 = org.jivesoftware.smack.util.MD5.bytes(r9);
        r1 = 32;
        r1 = org.jivesoftware.smack.util.StringUtils.randomString(r1);
        r8.cnonce = r1;
        r1 = new java.lang.StringBuilder;
        r2 = ":";
        r1.<init>(r2);
        r2 = r8.nonce;
        r1.append(r2);
        r1.append(r0);
        r0 = r8.cnonce;
        r1.append(r0);
        r0 = r1.toString();
        r0 = org.jivesoftware.smack.sasl.SASLMechanism.toBytes(r0);
        r9 = org.jivesoftware.smack.util.ByteUtils.concact(r9, r0);
        r0 = new java.lang.StringBuilder;
        r1 = "xmpp/";
        r0.<init>(r1);
        r1 = r8.serviceName;
        r0.append(r1);
        r0 = r0.toString();
        r8.digestUri = r0;
        r9 = org.jivesoftware.smack.util.MD5.bytes(r9);
        r9 = org.jivesoftware.smack.util.StringUtils.encodeHex(r9);
        r8.hex_hashed_a1 = r9;
        r9 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.DigestType.ClientResponse;
        r9 = r8.calcResponse(r9);
        r0 = r8.authorizationId;
        r1 = 34;
        if (r0 != 0) goto L_0x015b;
    L_0x0158:
        r0 = "";
        goto L_0x016e;
    L_0x015b:
        r0 = new java.lang.StringBuilder;
        r2 = ",authzid=\"";
        r0.<init>(r2);
        r2 = r8.authorizationId;
        r0.append(r2);
        r0.append(r1);
        r0 = r0.toString();
    L_0x016e:
        r2 = new java.lang.StringBuilder;
        r3 = "username=\"";
        r2.<init>(r3);
        r3 = r8.authenticationId;
        r3 = quoteBackslash(r3);
        r2.append(r3);
        r2.append(r1);
        r2.append(r0);
        r0 = ",realm=\"";
        r2.append(r0);
        r0 = r8.serviceName;
        r2.append(r0);
        r2.append(r1);
        r0 = ",nonce=\"";
        r2.append(r0);
        r0 = r8.nonce;
        r2.append(r0);
        r2.append(r1);
        r0 = ",cnonce=\"";
        r2.append(r0);
        r0 = r8.cnonce;
        r2.append(r0);
        r2.append(r1);
        r0 = ",nc=00000001,qop=auth,digest-uri=\"";
        r2.append(r0);
        r0 = r8.digestUri;
        r2.append(r0);
        r2.append(r1);
        r0 = ",response=";
        r2.append(r0);
        r2.append(r9);
        r9 = ",charset=utf-8";
        r2.append(r9);
        r9 = r2.toString();
        r1 = org.jivesoftware.smack.sasl.SASLMechanism.toBytes(r9);
        r9 = org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.State.RESPONSE_SENT;
        goto L_0x006f;
        return r1;
    L_0x01d2:
        r9 = move-exception;
        r0 = new java.lang.AssertionError;
        r0.<init>(r9);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.sasl.provided.SASLDigestMD5Mechanism.evaluateChallenge(byte[]):byte[]");
    }

    protected byte[] getAuthenticationText() {
        return null;
    }

    public String getName() {
        return "DIGEST-MD5";
    }

    public int getPriority() {
        return 210;
    }

    public SASLDigestMD5Mechanism newInstance() {
        return new SASLDigestMD5Mechanism();
    }
}
