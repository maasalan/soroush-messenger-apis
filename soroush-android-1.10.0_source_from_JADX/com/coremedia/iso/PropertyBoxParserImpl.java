package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.UserBox;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class PropertyBoxParserImpl extends AbstractBoxParser {
    static String[] EMPTY_STRING_ARRAY = new String[0];
    StringBuilder buildLookupStrings = new StringBuilder();
    String clazzName;
    Pattern constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");
    Properties mapping;
    String[] param;

    public PropertyBoxParserImpl(Properties properties) {
        this.mapping = properties;
    }

    public PropertyBoxParserImpl(String... strArr) {
        InputStream resourceAsStream = getClass().getResourceAsStream("/isoparser-default.properties");
        try {
            this.mapping = new Properties();
            this.mapping.load(resourceAsStream);
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                contextClassLoader = ClassLoader.getSystemClassLoader();
            }
            Enumeration resources = contextClassLoader.getResources("isoparser-custom.properties");
            while (resources.hasMoreElements()) {
                InputStream openStream = FirebasePerfUrlConnection.openStream((URL) resources.nextElement());
                try {
                    this.mapping.load(openStream);
                    openStream.close();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    openStream.close();
                }
            }
            for (String resourceAsStream2 : strArr) {
                this.mapping.load(getClass().getResourceAsStream(resourceAsStream2));
            }
            try {
                resourceAsStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    public Box createBox(String str, byte[] bArr, String str2) {
        invoke(str, bArr, str2);
        try {
            Class cls = Class.forName(this.clazzName);
            if (this.param.length <= 0) {
                return (Box) cls.newInstance();
            }
            Class[] clsArr = new Class[this.param.length];
            Object[] objArr = new Object[this.param.length];
            for (int i = 0; i < this.param.length; i++) {
                if ("userType".equals(this.param[i])) {
                    objArr[i] = bArr;
                    clsArr[i] = byte[].class;
                } else if (IjkMediaMeta.IJKM_KEY_TYPE.equals(this.param[i])) {
                    objArr[i] = str;
                    clsArr[i] = String.class;
                } else if ("parent".equals(this.param[i])) {
                    objArr[i] = str2;
                    clsArr[i] = String.class;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("No such param: ");
                    stringBuilder.append(this.param[i]);
                    throw new InternalError(stringBuilder.toString());
                }
            }
            return (Box) cls.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        } catch (Throwable e22) {
            throw new RuntimeException(e22);
        } catch (Throwable e222) {
            throw new RuntimeException(e222);
        } catch (Throwable e2222) {
            throw new RuntimeException(e2222);
        }
    }

    public void invoke(String str, byte[] bArr, String str2) {
        Object property;
        if (bArr == null) {
            property = this.mapping.getProperty(str);
            if (property == null) {
                StringBuilder stringBuilder = this.buildLookupStrings;
                stringBuilder.append(str2);
                stringBuilder.append('-');
                stringBuilder.append(str);
                String stringBuilder2 = stringBuilder.toString();
                this.buildLookupStrings.setLength(0);
                property = this.mapping.getProperty(stringBuilder2);
            }
        } else if (UserBox.TYPE.equals(str)) {
            Properties properties = this.mapping;
            StringBuilder stringBuilder3 = new StringBuilder("uuid[");
            stringBuilder3.append(Hex.encodeHex(bArr).toUpperCase());
            stringBuilder3.append("]");
            property = properties.getProperty(stringBuilder3.toString());
            if (property == null) {
                properties = this.mapping;
                stringBuilder3 = new StringBuilder(String.valueOf(str2));
                stringBuilder3.append("-uuid[");
                stringBuilder3.append(Hex.encodeHex(bArr).toUpperCase());
                stringBuilder3.append("]");
                property = properties.getProperty(stringBuilder3.toString());
            }
            if (property == null) {
                property = this.mapping.getProperty(UserBox.TYPE);
            }
        } else {
            throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
        }
        if (property == null) {
            property = this.mapping.getProperty("default");
        }
        if (property == null) {
            StringBuilder stringBuilder4 = new StringBuilder("No box object found for ");
            stringBuilder4.append(str);
            throw new RuntimeException(stringBuilder4.toString());
        } else if (property.endsWith(")")) {
            Matcher matcher = this.constuctorPattern.matcher(property);
            if (matcher.matches()) {
                this.clazzName = matcher.group(1);
                String[] split = matcher.group(2).length() == 0 ? EMPTY_STRING_ARRAY : matcher.group(2).length() > 0 ? matcher.group(2).split(",") : new String[0];
                this.param = split;
                return;
            }
            stringBuilder = new StringBuilder("Cannot work with that constructor: ");
            stringBuilder.append(property);
            throw new RuntimeException(stringBuilder.toString());
        } else {
            this.param = EMPTY_STRING_ARRAY;
            this.clazzName = property;
        }
    }
}
