package org.jivesoftware.smack.sasl.core;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.security.auth.callback.CallbackHandler;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.b.c.a.a;
import org.b.c.a.c;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.util.ByteUtils;
import org.jivesoftware.smack.util.SHA1;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.stringencoder.Base64;

public abstract class ScramMechanism extends SASLMechanism {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final a<String, Keys> CACHE = new c(10);
    private static final byte[] CLIENT_KEY_BYTES = SASLMechanism.toBytes("Client Key");
    private static final byte[] ONE = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    private static final int RANDOM_ASCII_BYTE_COUNT = 32;
    private static final ThreadLocal<SecureRandom> SECURE_RANDOM = new C77541();
    private static final byte[] SERVER_KEY_BYTES = SASLMechanism.toBytes("Server Key");
    private String clientFirstMessageBare;
    private String clientRandomAscii;
    private final ScramHmac scramHmac;
    private byte[] serverSignature;
    private State state = State.INITIAL;

    static class C77541 extends ThreadLocal<SecureRandom> {
        C77541() {
        }

        protected final SecureRandom initialValue() {
            return new SecureRandom();
        }
    }

    private static class Keys {
        private final byte[] clientKey;
        private final byte[] serverKey;

        public Keys(byte[] bArr, byte[] bArr2) {
            this.clientKey = bArr;
            this.serverKey = bArr2;
        }
    }

    private enum State {
        INITIAL,
        AUTH_TEXT_SENT,
        RESPONSE_SENT,
        VALID_SERVER_RESPONSE
    }

    protected ScramMechanism(ScramHmac scramHmac) {
        this.scramHmac = scramHmac;
    }

    private static String escape(String str) {
        StringBuilder stringBuilder = new StringBuilder((int) (((double) str.length()) * 1.1d));
        for (int i = 0; i < str.length(); i++) {
            String str2;
            char charAt = str.charAt(i);
            if (charAt == ',') {
                str2 = "=2C";
            } else if (charAt != '=') {
                stringBuilder.append(charAt);
            } else {
                str2 = "=3D";
            }
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }

    private final byte[] getCBindInput() {
        byte[] channelBindingData = getChannelBindingData();
        byte[] toBytes = SASLMechanism.toBytes(getGS2Header());
        return channelBindingData == null ? toBytes : ByteUtils.concact(toBytes, channelBindingData);
    }

    private final String getGS2Header() {
        String str = "";
        if (this.authorizationId != null) {
            StringBuilder stringBuilder = new StringBuilder("a=");
            stringBuilder.append(this.authorizationId);
            str = stringBuilder.toString();
        }
        String channelBindingName = getChannelBindingName();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(channelBindingName);
        stringBuilder2.append(',');
        stringBuilder2.append(str);
        stringBuilder2.append(",");
        return stringBuilder2.toString();
    }

    private byte[] hi(java.lang.String r6, byte[] r7, int r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0030 }
        r6 = r6.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x0030 }
        r0 = ONE;
        r7 = org.jivesoftware.smack.util.ByteUtils.concact(r7, r0);
        r7 = r5.hmac(r6, r7);
        r0 = r7.clone();
        r0 = (byte[]) r0;
        r1 = 1;
    L_0x0017:
        if (r1 >= r8) goto L_0x002f;
    L_0x0019:
        r7 = r5.hmac(r6, r7);
        r2 = 0;
    L_0x001e:
        r3 = r7.length;
        if (r2 >= r3) goto L_0x002c;
    L_0x0021:
        r3 = r0[r2];
        r4 = r7[r2];
        r3 = r3 ^ r4;
        r3 = (byte) r3;
        r0[r2] = r3;
        r2 = r2 + 1;
        goto L_0x001e;
    L_0x002c:
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x002f:
        return r0;
    L_0x0030:
        r6 = new java.lang.AssertionError;
        r6.<init>();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.sasl.core.ScramMechanism.hi(java.lang.String, byte[], int):byte[]");
    }

    private byte[] hmac(byte[] bArr, byte[] bArr2) {
        try {
            return this.scramHmac.hmac(bArr, bArr2);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getName());
            stringBuilder.append(" Exception");
            throw new SmackException(stringBuilder.toString(), e);
        }
    }

    private static boolean isPrintableNonCommaAsciiChar(char c) {
        return c != ',' && c > ' ' && c < '';
    }

    private static Map<Character, String> parseAttributes(String str) {
        if (str.length() == 0) {
            return Collections.emptyMap();
        }
        String[] split = str.split(",");
        Map<Character, String> hashMap = new HashMap(split.length, BallPulseIndicator.SCALE);
        for (String str2 : split) {
            if (str2.length() < 3) {
                StringBuilder stringBuilder = new StringBuilder("Invalid Key-Value pair: ");
                stringBuilder.append(str2);
                throw new SmackException(stringBuilder.toString());
            }
            char charAt = str2.charAt(0);
            if (str2.charAt(1) != '=') {
                stringBuilder = new StringBuilder("Invalid Key-Value pair: ");
                stringBuilder.append(str2);
                throw new SmackException(stringBuilder.toString());
            }
            hashMap.put(Character.valueOf(charAt), str2.substring(2));
        }
        return hashMap;
    }

    protected void authenticateInternal(CallbackHandler callbackHandler) {
        throw new UnsupportedOperationException("CallbackHandler not (yet) supported");
    }

    public boolean authzidSupported() {
        return true;
    }

    public void checkIfSuccessfulOrThrow() {
        if (this.state != State.VALID_SERVER_RESPONSE) {
            throw new SmackException("SCRAM-SHA1 is missing valid server response");
        }
    }

    protected byte[] evaluateChallenge(byte[] bArr) {
        try {
            String str = new String(bArr, StringUtils.UTF8);
            StringBuilder stringBuilder;
            switch (this.state) {
                case AUTH_TEXT_SENT:
                    Map parseAttributes = parseAttributes(str);
                    String str2 = (String) parseAttributes.get(Character.valueOf('r'));
                    if (str2 == null) {
                        throw new SmackException("Server random ASCII is null");
                    } else if (str2.length() <= this.clientRandomAscii.length()) {
                        throw new SmackException("Server random ASCII is shorter then client random ASCII");
                    } else {
                        int i = 0;
                        if (str2.substring(0, this.clientRandomAscii.length()).equals(this.clientRandomAscii)) {
                            String str3 = (String) parseAttributes.get(Character.valueOf('i'));
                            if (str3 == null) {
                                throw new SmackException("Iterations attribute not set");
                            }
                            try {
                                int parseInt = Integer.parseInt(str3);
                                String str4 = (String) parseAttributes.get(Character.valueOf('s'));
                                if (str4 == null) {
                                    throw new SmackException("SALT not send");
                                }
                                byte[] hmac;
                                StringBuilder stringBuilder2 = new StringBuilder("c=");
                                stringBuilder2.append(Base64.encodeToString(getCBindInput()));
                                String stringBuilder3 = stringBuilder2.toString();
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append(stringBuilder3);
                                stringBuilder4.append(",r=");
                                stringBuilder4.append(str2);
                                str2 = stringBuilder4.toString();
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(this.clientFirstMessageBare);
                                stringBuilder2.append(',');
                                stringBuilder2.append(str);
                                stringBuilder2.append(',');
                                stringBuilder2.append(str2);
                                byte[] toBytes = SASLMechanism.toBytes(stringBuilder2.toString());
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(this.password);
                                stringBuilder2.append(',');
                                stringBuilder2.append(str4);
                                stringBuilder2.append(',');
                                stringBuilder2.append(getName());
                                stringBuilder3 = stringBuilder2.toString();
                                Keys keys = (Keys) CACHE.a(stringBuilder3);
                                if (keys == null) {
                                    bArr = hi(SASLMechanism.saslPrep(this.password), Base64.decode(str4), parseInt);
                                    hmac = hmac(bArr, SERVER_KEY_BYTES);
                                    bArr = hmac(bArr, CLIENT_KEY_BYTES);
                                    CACHE.put(stringBuilder3, new Keys(bArr, hmac));
                                } else {
                                    hmac = keys.serverKey;
                                    bArr = keys.clientKey;
                                }
                                this.serverSignature = hmac(hmac, toBytes);
                                toBytes = hmac(SHA1.bytes(bArr), toBytes);
                                hmac = new byte[bArr.length];
                                while (i < hmac.length) {
                                    hmac[i] = (byte) (bArr[i] ^ toBytes[i]);
                                    i++;
                                }
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(str2);
                                stringBuilder.append(",p=");
                                stringBuilder.append(Base64.encodeToString(hmac));
                                str4 = stringBuilder.toString();
                                this.state = State.RESPONSE_SENT;
                                return SASLMechanism.toBytes(str4);
                            } catch (Throwable e) {
                                throw new SmackException("Exception parsing iterations", e);
                            }
                        }
                        throw new SmackException("Received client random ASCII does not match client random ASCII");
                    }
                case RESPONSE_SENT:
                    stringBuilder = new StringBuilder("v=");
                    stringBuilder.append(Base64.encodeToString(this.serverSignature));
                    if (stringBuilder.toString().equals(str)) {
                        this.state = State.VALID_SERVER_RESPONSE;
                        return null;
                    }
                    throw new SmackException("Server final message does not match calculated one");
                default:
                    throw new SmackException("Invalid state");
            }
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    protected byte[] getAuthenticationText() {
        this.clientRandomAscii = getRandomAscii();
        String saslPrep = SASLMechanism.saslPrep(this.authenticationId);
        StringBuilder stringBuilder = new StringBuilder("n=");
        stringBuilder.append(escape(saslPrep));
        stringBuilder.append(",r=");
        stringBuilder.append(this.clientRandomAscii);
        this.clientFirstMessageBare = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(getGS2Header());
        stringBuilder2.append(this.clientFirstMessageBare);
        saslPrep = stringBuilder2.toString();
        this.state = State.AUTH_TEXT_SENT;
        return SASLMechanism.toBytes(saslPrep);
    }

    protected byte[] getChannelBindingData() {
        return null;
    }

    protected String getChannelBindingName() {
        if (this.sslSession != null) {
            ConnectionConfiguration connectionConfiguration = this.connectionConfiguration;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getName());
            stringBuilder.append("-PLUS");
            if (connectionConfiguration.isEnabledSaslMechanism(stringBuilder.toString())) {
                return "y";
            }
        }
        return "n";
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder("SCRAM-");
        stringBuilder.append(this.scramHmac.getHmacName());
        return stringBuilder.toString();
    }

    String getRandomAscii() {
        char[] cArr = new char[32];
        Random random = (Random) SECURE_RANDOM.get();
        int i = 0;
        while (i < 32) {
            char nextInt = (char) random.nextInt(128);
            if (isPrintableNonCommaAsciiChar(nextInt)) {
                int i2 = i + 1;
                cArr[i] = nextInt;
                i = i2;
            }
        }
        return new String(cArr);
    }
}
