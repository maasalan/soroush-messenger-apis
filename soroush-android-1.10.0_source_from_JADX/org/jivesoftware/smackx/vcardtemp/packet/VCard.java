package org.jivesoftware.smackx.vcardtemp.packet;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.e;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smack.util.stringencoder.Base64;
import org.jivesoftware.smackx.vcardtemp.VCardManager;

public class VCard extends IQ {
    private static final String DEFAULT_MIME_TYPE = "image/jpeg";
    public static final String ELEMENT = "vCard";
    private static final Logger LOGGER = Logger.getLogger(VCard.class.getName());
    public static final String NAMESPACE = "vcard-temp";
    private String emailHome;
    private String emailWork;
    private String firstName;
    private Map<String, String> homeAddr = new HashMap();
    private Map<String, String> homePhones = new HashMap();
    private String lastName;
    private String middleName;
    private String organization;
    private String organizationUnit;
    private Map<String, String> otherSimpleFields = new HashMap();
    private Map<String, String> otherUnescapableFields = new HashMap();
    private String photoBinval;
    private String photoMimeType;
    private String prefix;
    private String suffix;
    private Map<String, String> workAddr = new HashMap();
    private Map<String, String> workPhones = new HashMap();

    public VCard() {
        super("vCard", "vcard-temp");
    }

    private void copyFieldsFrom(VCard vCard) {
        for (Field field : VCard.class.getDeclaredFields()) {
            if (field.getDeclaringClass() == VCard.class && !Modifier.isFinal(field.getModifiers())) {
                try {
                    field.setAccessible(true);
                    field.set(this, field.get(vCard));
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder("This cannot happen:");
                    stringBuilder.append(field);
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        }
    }

    public static byte[] getBytes(URL url) {
        File file = new File(url.getPath());
        return file.exists() ? getFileBytes(file) : null;
    }

    private static byte[] getFileBytes(File file) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                if (bufferedInputStream.read(bArr) != length) {
                    throw new IOException("Entire file not read");
                }
                bufferedInputStream.close();
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw th;
        }
    }

    private boolean hasContent() {
        if (!hasNameField() && !hasOrganizationFields() && this.emailHome == null && this.emailWork == null && this.otherSimpleFields.size() <= 0 && this.otherUnescapableFields.size() <= 0 && this.homeAddr.size() <= 0 && this.homePhones.size() <= 0 && this.workAddr.size() <= 0 && this.workPhones.size() <= 0) {
            if (this.photoBinval == null) {
                return false;
            }
        }
        return true;
    }

    private boolean hasNameField() {
        if (this.firstName == null && this.lastName == null && this.middleName == null && this.prefix == null) {
            if (this.suffix == null) {
                return false;
            }
        }
        return true;
    }

    private boolean hasOrganizationFields() {
        if (this.organization == null) {
            if (this.organizationUnit == null) {
                return false;
            }
        }
        return true;
    }

    private void updateFN() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.firstName != null) {
            stringBuilder.append(StringUtils.escapeForXml(this.firstName));
            stringBuilder.append(' ');
        }
        if (this.middleName != null) {
            stringBuilder.append(StringUtils.escapeForXml(this.middleName));
            stringBuilder.append(' ');
        }
        if (this.lastName != null) {
            stringBuilder.append(StringUtils.escapeForXml(this.lastName));
        }
        setField("FN", stringBuilder.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCard vCard = (VCard) obj;
        if (this.emailHome != null) {
            if (!this.emailHome.equals(vCard.emailHome)) {
                return false;
            }
        } else if (vCard.emailHome != null) {
            return false;
        }
        if (this.emailWork != null) {
            if (!this.emailWork.equals(vCard.emailWork)) {
                return false;
            }
        } else if (vCard.emailWork != null) {
            return false;
        }
        if (this.firstName != null) {
            if (!this.firstName.equals(vCard.firstName)) {
                return false;
            }
        } else if (vCard.firstName != null) {
            return false;
        }
        if (!this.homeAddr.equals(vCard.homeAddr) || !this.homePhones.equals(vCard.homePhones)) {
            return false;
        }
        if (this.lastName != null) {
            if (!this.lastName.equals(vCard.lastName)) {
                return false;
            }
        } else if (vCard.lastName != null) {
            return false;
        }
        if (this.middleName != null) {
            if (!this.middleName.equals(vCard.middleName)) {
                return false;
            }
        } else if (vCard.middleName != null) {
            return false;
        }
        if (this.organization != null) {
            if (!this.organization.equals(vCard.organization)) {
                return false;
            }
        } else if (vCard.organization != null) {
            return false;
        }
        if (this.organizationUnit != null) {
            if (!this.organizationUnit.equals(vCard.organizationUnit)) {
                return false;
            }
        } else if (vCard.organizationUnit != null) {
            return false;
        }
        if (!this.otherSimpleFields.equals(vCard.otherSimpleFields) || !this.workAddr.equals(vCard.workAddr)) {
            return false;
        }
        if (this.photoBinval != null) {
            if (!this.photoBinval.equals(vCard.photoBinval)) {
                return false;
            }
        } else if (vCard.photoBinval != null) {
            return false;
        }
        return this.workPhones.equals(vCard.workPhones);
    }

    public String getAddressFieldHome(String str) {
        return (String) this.homeAddr.get(str);
    }

    public String getAddressFieldWork(String str) {
        return (String) this.workAddr.get(str);
    }

    public byte[] getAvatar() {
        return this.photoBinval == null ? null : Base64.decode(this.photoBinval);
    }

    public String getAvatarHash() {
        byte[] avatar = getAvatar();
        if (avatar == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(StringUtils.SHA1);
            instance.update(avatar);
            return StringUtils.encodeHex(instance.digest());
        } catch (Throwable e) {
            LOGGER.log(Level.SEVERE, "Failed to get message digest", e);
            return null;
        }
    }

    public String getAvatarMimeType() {
        return this.photoMimeType;
    }

    public String getEmailHome() {
        return this.emailHome;
    }

    public String getEmailWork() {
        return this.emailWork;
    }

    public String getField(String str) {
        return (String) this.otherSimpleFields.get(str);
    }

    public String getFirstName() {
        return this.firstName;
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        if (hasContent()) {
            String str;
            iQChildElementXmlStringBuilder.rightAngleBracket();
            if (hasNameField()) {
                iQChildElementXmlStringBuilder.openElement("N");
                iQChildElementXmlStringBuilder.optElement("FAMILY", this.lastName);
                iQChildElementXmlStringBuilder.optElement("GIVEN", this.firstName);
                iQChildElementXmlStringBuilder.optElement("MIDDLE", this.middleName);
                iQChildElementXmlStringBuilder.optElement("PREFIX", this.prefix);
                iQChildElementXmlStringBuilder.optElement("SUFFIX", this.suffix);
                iQChildElementXmlStringBuilder.closeElement("N");
            }
            if (hasOrganizationFields()) {
                iQChildElementXmlStringBuilder.openElement("ORG");
                iQChildElementXmlStringBuilder.optElement("ORGNAME", this.organization);
                iQChildElementXmlStringBuilder.optElement("ORGUNIT", this.organizationUnit);
                iQChildElementXmlStringBuilder.closeElement("ORG");
            }
            for (Entry entry : this.otherSimpleFields.entrySet()) {
                iQChildElementXmlStringBuilder.optElement((String) entry.getKey(), (String) entry.getValue());
            }
            for (Entry entry2 : this.otherUnescapableFields.entrySet()) {
                str = (String) entry2.getValue();
                if (str != null) {
                    iQChildElementXmlStringBuilder.openElement((String) entry2.getKey());
                    iQChildElementXmlStringBuilder.append((CharSequence) str);
                    iQChildElementXmlStringBuilder.closeElement((String) entry2.getKey());
                }
            }
            if (this.photoBinval != null) {
                iQChildElementXmlStringBuilder.openElement("PHOTO");
                iQChildElementXmlStringBuilder.escapedElement("BINVAL", this.photoBinval);
                iQChildElementXmlStringBuilder.element("TYPE", this.photoMimeType);
                iQChildElementXmlStringBuilder.closeElement("PHOTO");
            }
            if (this.emailWork != null) {
                iQChildElementXmlStringBuilder.openElement("EMAIL");
                iQChildElementXmlStringBuilder.emptyElement("WORK");
                iQChildElementXmlStringBuilder.emptyElement("INTERNET");
                iQChildElementXmlStringBuilder.emptyElement("PREF");
                iQChildElementXmlStringBuilder.element("USERID", this.emailWork);
                iQChildElementXmlStringBuilder.closeElement("EMAIL");
            }
            if (this.emailHome != null) {
                iQChildElementXmlStringBuilder.openElement("EMAIL");
                iQChildElementXmlStringBuilder.emptyElement("HOME");
                iQChildElementXmlStringBuilder.emptyElement("INTERNET");
                iQChildElementXmlStringBuilder.emptyElement("PREF");
                iQChildElementXmlStringBuilder.element("USERID", this.emailHome);
                iQChildElementXmlStringBuilder.closeElement("EMAIL");
            }
            for (Entry entry22 : this.workPhones.entrySet()) {
                str = (String) entry22.getValue();
                if (str != null) {
                    iQChildElementXmlStringBuilder.openElement("TEL");
                    iQChildElementXmlStringBuilder.emptyElement("WORK");
                    iQChildElementXmlStringBuilder.emptyElement((String) entry22.getKey());
                    iQChildElementXmlStringBuilder.element("NUMBER", str);
                    iQChildElementXmlStringBuilder.closeElement("TEL");
                }
            }
            for (Entry entry222 : this.homePhones.entrySet()) {
                str = (String) entry222.getValue();
                if (str != null) {
                    iQChildElementXmlStringBuilder.openElement("TEL");
                    iQChildElementXmlStringBuilder.emptyElement("HOME");
                    iQChildElementXmlStringBuilder.emptyElement((String) entry222.getKey());
                    iQChildElementXmlStringBuilder.element("NUMBER", str);
                    iQChildElementXmlStringBuilder.closeElement("TEL");
                }
            }
            if (!this.workAddr.isEmpty()) {
                iQChildElementXmlStringBuilder.openElement("ADR");
                iQChildElementXmlStringBuilder.emptyElement("WORK");
                for (Entry entry2222 : this.workAddr.entrySet()) {
                    str = (String) entry2222.getValue();
                    if (str != null) {
                        iQChildElementXmlStringBuilder.element((String) entry2222.getKey(), str);
                    }
                }
                iQChildElementXmlStringBuilder.closeElement("ADR");
            }
            if (!this.homeAddr.isEmpty()) {
                iQChildElementXmlStringBuilder.openElement("ADR");
                iQChildElementXmlStringBuilder.emptyElement("HOME");
                for (Entry entry22222 : this.homeAddr.entrySet()) {
                    str = (String) entry22222.getValue();
                    if (str != null) {
                        iQChildElementXmlStringBuilder.element((String) entry22222.getKey(), str);
                    }
                }
                iQChildElementXmlStringBuilder.closeElement("ADR");
            }
            return iQChildElementXmlStringBuilder;
        }
        iQChildElementXmlStringBuilder.setEmptyElement();
        return iQChildElementXmlStringBuilder;
    }

    public String getJabberId() {
        return (String) this.otherSimpleFields.get("JABBERID");
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getNickName() {
        return (String) this.otherSimpleFields.get("NICKNAME");
    }

    public String getOrganization() {
        return this.organization;
    }

    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    public String getPhoneHome(String str) {
        return (String) this.homePhones.get(str);
    }

    public String getPhoneWork(String str) {
        return (String) this.workPhones.get(str);
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = 29 * ((((((((((((((((((((((this.homePhones.hashCode() * 29) + this.workPhones.hashCode()) * 29) + this.homeAddr.hashCode()) * 29) + this.workAddr.hashCode()) * 29) + (this.firstName != null ? this.firstName.hashCode() : 0)) * 29) + (this.lastName != null ? this.lastName.hashCode() : 0)) * 29) + (this.middleName != null ? this.middleName.hashCode() : 0)) * 29) + (this.emailHome != null ? this.emailHome.hashCode() : 0)) * 29) + (this.emailWork != null ? this.emailWork.hashCode() : 0)) * 29) + (this.organization != null ? this.organization.hashCode() : 0)) * 29) + (this.organizationUnit != null ? this.organizationUnit.hashCode() : 0)) * 29) + this.otherSimpleFields.hashCode());
        if (this.photoBinval != null) {
            i = this.photoBinval.hashCode();
        }
        return hashCode + i;
    }

    @Deprecated
    public void load(XMPPConnection xMPPConnection) {
        load(xMPPConnection, null);
    }

    @Deprecated
    public void load(XMPPConnection xMPPConnection, e eVar) {
        copyFieldsFrom(VCardManager.getInstanceFor(xMPPConnection).loadVCard(eVar));
    }

    public void removeAvatar() {
        this.photoBinval = null;
        this.photoMimeType = null;
    }

    @Deprecated
    public void save(XMPPConnection xMPPConnection) {
        VCardManager.getInstanceFor(xMPPConnection).saveVCard(this);
    }

    public void setAddressFieldHome(String str, String str2) {
        this.homeAddr.put(str, str2);
    }

    public void setAddressFieldWork(String str, String str2) {
        this.workAddr.put(str, str2);
    }

    public void setAvatar(String str, String str2) {
        this.photoBinval = str;
        this.photoMimeType = str2;
    }

    public void setAvatar(URL url) {
        byte[] bArr = new byte[0];
        try {
            bArr = getBytes(url);
        } catch (Throwable e) {
            Logger logger = LOGGER;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder("Error getting bytes from URL: ");
            stringBuilder.append(url);
            logger.log(level, stringBuilder.toString(), e);
        }
        setAvatar(bArr);
    }

    public void setAvatar(byte[] bArr) {
        setAvatar(bArr, DEFAULT_MIME_TYPE);
    }

    public void setAvatar(byte[] bArr, String str) {
        if (bArr == null) {
            removeAvatar();
        } else {
            setAvatar(Base64.encodeToString(bArr), str);
        }
    }

    public void setEmailHome(String str) {
        this.emailHome = str;
    }

    public void setEmailWork(String str) {
        this.emailWork = str;
    }

    @Deprecated
    public void setEncodedImage(String str) {
        setAvatar(str, DEFAULT_MIME_TYPE);
    }

    public void setField(String str, String str2) {
        setField(str, str2, false);
    }

    public void setField(String str, String str2, boolean z) {
        (!z ? this.otherSimpleFields : this.otherUnescapableFields).put(str, str2);
    }

    public void setFirstName(String str) {
        this.firstName = str;
        updateFN();
    }

    public void setJabberId(String str) {
        this.otherSimpleFields.put("JABBERID", str);
    }

    public void setLastName(String str) {
        this.lastName = str;
        updateFN();
    }

    public void setMiddleName(String str) {
        this.middleName = str;
        updateFN();
    }

    public void setNickName(String str) {
        this.otherSimpleFields.put("NICKNAME", str);
    }

    public void setOrganization(String str) {
        this.organization = str;
    }

    public void setOrganizationUnit(String str) {
        this.organizationUnit = str;
    }

    public void setPhoneHome(String str, String str2) {
        this.homePhones.put(str, str2);
    }

    public void setPhoneWork(String str, String str2) {
        this.workPhones.put(str, str2);
    }

    public void setPrefix(String str) {
        this.prefix = str;
        updateFN();
    }

    public void setSuffix(String str) {
        this.suffix = str;
        updateFN();
    }
}
