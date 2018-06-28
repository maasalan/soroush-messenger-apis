package org.jivesoftware.smackx.bob;

import org.jivesoftware.smack.util.StringUtils;

public class BoBHash {
    private final String cid;
    private final String hash;
    private final String hashType;

    public BoBHash(String str, String str2) {
        this.hash = (String) StringUtils.requireNotNullOrEmpty(str, "hash must not be null or empty");
        this.hashType = (String) StringUtils.requireNotNullOrEmpty(str2, "hashType must not be null or empty");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.hashType);
        stringBuilder.append('+');
        stringBuilder.append(this.hash);
        stringBuilder.append("@bob.xmpp.org");
        this.cid = stringBuilder.toString();
    }

    public static BoBHash fromCid(String str) {
        return new BoBHash(str.substring(str.indexOf("+") + 1, str.indexOf("@bob.xmpp.org")), str.substring(0, str.indexOf("+")));
    }

    public static BoBHash fromSrc(String str) {
        return new BoBHash(str.substring(str.indexOf("+") + 1, str.indexOf("@bob.xmpp.org")), str.substring(str.lastIndexOf("cid:") + 4, str.indexOf("+")));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BoBHash)) {
            return false;
        }
        return this.cid.equals(((BoBHash) obj).cid);
    }

    public String getCid() {
        return this.cid;
    }

    public String getHash() {
        return this.hash;
    }

    public String getHashType() {
        return this.hashType;
    }

    public int hashCode() {
        return this.cid.hashCode();
    }

    public String toSrc() {
        StringBuilder stringBuilder = new StringBuilder("cid:");
        stringBuilder.append(getCid());
        return stringBuilder.toString();
    }
}
