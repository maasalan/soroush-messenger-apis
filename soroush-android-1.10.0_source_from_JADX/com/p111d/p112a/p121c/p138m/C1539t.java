package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p114b.p116c.C1351g;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class C1539t extends DateFormat {
    protected static final String[] f4792a = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
    protected static final DateFormat f4793b;
    protected static final DateFormat f4794c;
    protected static final DateFormat f4795d;
    protected static final DateFormat f4796e;
    public static final C1539t f4797f = new C1539t();
    private static final TimeZone f4798n = TimeZone.getTimeZone("UTC");
    private static final Locale f4799o = Locale.US;
    protected transient TimeZone f4800g;
    protected final Locale f4801h;
    protected Boolean f4802i;
    protected transient DateFormat f4803j;
    protected transient DateFormat f4804k;
    protected transient DateFormat f4805l;
    protected transient DateFormat f4806m;

    static {
        DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", f4799o);
        f4793b = simpleDateFormat;
        simpleDateFormat.setTimeZone(f4798n);
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", f4799o);
        f4794c = simpleDateFormat;
        simpleDateFormat.setTimeZone(f4798n);
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", f4799o);
        f4795d = simpleDateFormat;
        simpleDateFormat.setTimeZone(f4798n);
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", f4799o);
        f4796e = simpleDateFormat;
        simpleDateFormat.setTimeZone(f4798n);
    }

    public C1539t() {
        this.f4801h = f4799o;
    }

    private C1539t(TimeZone timeZone, Locale locale, Boolean bool) {
        this.f4800g = timeZone;
        this.f4801h = locale;
        this.f4802i = bool;
    }

    private static final DateFormat m4019a(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        if (locale.equals(f4799o)) {
            dateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
            }
            if (bool != null) {
                dateFormat.setLenient(bool.booleanValue());
            }
            return dateFormat;
        }
        dateFormat = new SimpleDateFormat(str, locale);
        if (timeZone == null) {
            timeZone = f4798n;
        }
        dateFormat.setTimeZone(timeZone);
        if (bool != null) {
            dateFormat.setLenient(bool.booleanValue());
        }
        return dateFormat;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Date m4020a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r17.length();
        r3 = r2 + -1;
        r4 = r1.charAt(r3);
        r5 = 2;
        r6 = 0;
        r7 = 3;
        r8 = 1;
        r9 = 10;
        if (r2 > r9) goto L_0x0036;
    L_0x0016:
        r9 = java.lang.Character.isDigit(r4);
        if (r9 == 0) goto L_0x0036;
    L_0x001c:
        r2 = r0.f4806m;
        r3 = "yyyy-MM-dd";
        if (r2 != 0) goto L_0x0030;
    L_0x0022:
        r2 = f4796e;
        r4 = r0.f4800g;
        r9 = r0.f4801h;
        r10 = r0.f4802i;
        r2 = com.p111d.p112a.p121c.p138m.C1539t.m4019a(r2, r3, r4, r9, r10);
        r0.f4806m = r2;
    L_0x0030:
        r10 = r3;
        r3 = r1;
    L_0x0032:
        r1 = r18;
        goto L_0x0150;
    L_0x0036:
        r9 = 58;
        r10 = 90;
        if (r4 != r10) goto L_0x0069;
    L_0x003c:
        r4 = r0.f4805l;
        r10 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        if (r4 != 0) goto L_0x0050;
    L_0x0042:
        r4 = f4795d;
        r11 = r0.f4800g;
        r12 = r0.f4801h;
        r13 = r0.f4802i;
        r4 = com.p111d.p112a.p121c.p138m.C1539t.m4019a(r4, r10, r11, r12, r13);
        r0.f4805l = r4;
    L_0x0050:
        r2 = r2 + -4;
        r2 = r1.charAt(r2);
        if (r2 != r9) goto L_0x0066;
    L_0x0058:
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = ".000";
        r2.insert(r3, r1);
        r1 = r2.toString();
    L_0x0066:
        r3 = r1;
        r2 = r4;
        goto L_0x0032;
    L_0x0069:
        r3 = r17.length();
        r4 = 6;
        r11 = 45;
        r12 = 43;
        if (r3 < r4) goto L_0x0095;
    L_0x0074:
        r13 = r3 + -6;
        r13 = r1.charAt(r13);
        if (r13 == r12) goto L_0x0093;
    L_0x007c:
        if (r13 != r11) goto L_0x007f;
    L_0x007e:
        goto L_0x0093;
    L_0x007f:
        r13 = r3 + -5;
        r13 = r1.charAt(r13);
        if (r13 == r12) goto L_0x0093;
    L_0x0087:
        if (r13 != r11) goto L_0x008a;
    L_0x0089:
        goto L_0x0093;
    L_0x008a:
        r3 = r3 - r7;
        r3 = r1.charAt(r3);
        if (r3 == r12) goto L_0x0093;
    L_0x0091:
        if (r3 != r11) goto L_0x0095;
    L_0x0093:
        r3 = r8;
        goto L_0x0096;
    L_0x0095:
        r3 = r6;
    L_0x0096:
        r13 = 12;
        r14 = 84;
        r15 = 48;
        if (r3 == 0) goto L_0x0114;
    L_0x009e:
        r3 = r2 + -3;
        r10 = r1.charAt(r3);
        if (r10 != r9) goto L_0x00b4;
    L_0x00a6:
        r9 = new java.lang.StringBuilder;
        r9.<init>(r1);
        r2 = r2 - r5;
        r9.delete(r3, r2);
        r1 = r9.toString();
        goto L_0x00c9;
    L_0x00b4:
        if (r10 == r12) goto L_0x00b8;
    L_0x00b6:
        if (r10 != r11) goto L_0x00c9;
    L_0x00b8:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r1);
        r1 = "00";
        r2.append(r1);
        r1 = r2.toString();
    L_0x00c9:
        r2 = r1.length();
        r3 = r1.lastIndexOf(r14);
        r3 = r2 - r3;
        r3 = r3 - r4;
        if (r3 >= r13) goto L_0x00fc;
    L_0x00d6:
        r2 = r2 + -5;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r1);
        switch(r3) {
            case 5: goto L_0x00f3;
            case 6: goto L_0x00ee;
            case 7: goto L_0x00f8;
            case 8: goto L_0x00eb;
            case 9: goto L_0x00e8;
            case 10: goto L_0x00e5;
            case 11: goto L_0x00e1;
            default: goto L_0x00e0;
        };
    L_0x00e0:
        goto L_0x00f8;
    L_0x00e1:
        r4.insert(r2, r15);
        goto L_0x00f8;
    L_0x00e5:
        r1 = "00";
        goto L_0x00f5;
    L_0x00e8:
        r1 = "000";
        goto L_0x00f5;
    L_0x00eb:
        r1 = ".000";
        goto L_0x00f5;
    L_0x00ee:
        r1 = "00.000";
        r4.insert(r2, r1);
    L_0x00f3:
        r1 = ":00.000";
    L_0x00f5:
        r4.insert(r2, r1);
    L_0x00f8:
        r1 = r4.toString();
    L_0x00fc:
        r2 = r0.f4804k;
        r3 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        r4 = r0.f4804k;
        if (r4 != 0) goto L_0x0030;
    L_0x0104:
        r2 = f4794c;
        r4 = r0.f4800g;
        r9 = r0.f4801h;
        r10 = r0.f4802i;
        r2 = com.p111d.p112a.p121c.p138m.C1539t.m4019a(r2, r3, r4, r9, r10);
        r0.f4804k = r2;
        goto L_0x0030;
    L_0x0114:
        r3 = new java.lang.StringBuilder;
        r3.<init>(r1);
        r1 = r1.lastIndexOf(r14);
        r2 = r2 - r1;
        r2 = r2 - r8;
        if (r2 >= r13) goto L_0x0133;
    L_0x0121:
        switch(r2) {
            case 9: goto L_0x0130;
            case 10: goto L_0x012d;
            case 11: goto L_0x012a;
            default: goto L_0x0124;
        };
    L_0x0124:
        r1 = ".000";
        r3.append(r1);
        goto L_0x0133;
    L_0x012a:
        r3.append(r15);
    L_0x012d:
        r3.append(r15);
    L_0x0130:
        r3.append(r15);
    L_0x0133:
        r3.append(r10);
        r1 = r3.toString();
        r2 = r0.f4805l;
        r3 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        if (r2 != 0) goto L_0x0030;
    L_0x0140:
        r2 = f4795d;
        r4 = r0.f4800g;
        r9 = r0.f4801h;
        r10 = r0.f4802i;
        r2 = com.p111d.p112a.p121c.p138m.C1539t.m4019a(r2, r3, r4, r9, r10);
        r0.f4805l = r2;
        goto L_0x0030;
    L_0x0150:
        r2 = r2.parse(r3, r1);
        if (r2 != 0) goto L_0x0170;
    L_0x0156:
        r2 = new java.text.ParseException;
        r4 = "Can not parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)";
        r7 = new java.lang.Object[r7];
        r7[r6] = r3;
        r7[r8] = r10;
        r3 = r0.f4802i;
        r7[r5] = r3;
        r3 = java.lang.String.format(r4, r7);
        r1 = r18.getErrorIndex();
        r2.<init>(r3, r1);
        throw r2;
    L_0x0170:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.t.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private void m4021a() {
        this.f4803j = null;
        this.f4804k = null;
        this.f4805l = null;
        this.f4806m = null;
    }

    private static boolean m4022a(String str) {
        return str.length() >= 5 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-';
    }

    private Date m4023b(String str, ParsePosition parsePosition) {
        if (this.f4803j == null) {
            this.f4803j = C1539t.m4019a(f4793b, "EEE, dd MMM yyyy HH:mm:ss zzz", this.f4800g, this.f4801h, this.f4802i);
        }
        return this.f4803j.parse(str, parsePosition);
    }

    public final C1539t m4024a(Locale locale) {
        return locale.equals(this.f4801h) ? this : new C1539t(this.f4800g, locale, this.f4802i);
    }

    public final C1539t m4025a(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = f4798n;
        }
        return (timeZone == this.f4800g || timeZone.equals(this.f4800g)) ? this : new C1539t(timeZone, this.f4801h, this.f4802i);
    }

    public /* synthetic */ Object clone() {
        return new C1539t(this.f4800g, this.f4801h, this.f4802i);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (this.f4804k == null) {
            this.f4804k = C1539t.m4019a(f4794c, "yyyy-MM-dd'T'HH:mm:ss.SSSZ", this.f4800g, this.f4801h, this.f4802i);
        }
        return this.f4804k.format(date, stringBuffer, fieldPosition);
    }

    public TimeZone getTimeZone() {
        return this.f4800g;
    }

    public boolean isLenient() {
        return this.f4802i == null ? true : this.f4802i.booleanValue();
    }

    public Date parse(String str) {
        Date a;
        str = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        if (C1539t.m4022a(str)) {
            a = m4020a(str, parsePosition);
        } else {
            int length = str.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                char charAt = str.charAt(length);
                if (charAt < '0' || charAt > '9') {
                    if (length > 0 || charAt != '-') {
                        break;
                    }
                }
            }
            a = (length >= 0 || !(str.charAt(0) == '-' || C1351g.m3232c(str))) ? m4023b(str, parsePosition) : new Date(Long.parseLong(str));
        }
        if (a != null) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : f4792a) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("\", \"");
            } else {
                stringBuilder.append('\"');
            }
            stringBuilder.append(str2);
        }
        stringBuilder.append('\"');
        throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", new Object[]{str, stringBuilder.toString()}), parsePosition.getErrorIndex());
    }

    public java.util.Date parse(java.lang.String r5, java.text.ParsePosition r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = com.p111d.p112a.p121c.p138m.C1539t.m4022a(r5);
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r5 = r4.m4020a(r5, r6);	 Catch:{ ParseException -> 0x000b }
        return r5;
    L_0x000b:
        r5 = 0;
        return r5;
    L_0x000d:
        r0 = r5.length();
    L_0x0011:
        r0 = r0 + -1;
        r1 = 45;
        if (r0 < 0) goto L_0x0028;
    L_0x0017:
        r2 = r5.charAt(r0);
        r3 = 48;
        if (r2 < r3) goto L_0x0023;
    L_0x001f:
        r3 = 57;
        if (r2 <= r3) goto L_0x0011;
    L_0x0023:
        if (r0 > 0) goto L_0x0028;
    L_0x0025:
        if (r2 != r1) goto L_0x0028;
    L_0x0027:
        goto L_0x0011;
    L_0x0028:
        if (r0 >= 0) goto L_0x0041;
    L_0x002a:
        r0 = 0;
        r0 = r5.charAt(r0);
        if (r0 == r1) goto L_0x0037;
    L_0x0031:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3232c(r5);
        if (r0 == 0) goto L_0x0041;
    L_0x0037:
        r6 = new java.util.Date;
        r0 = java.lang.Long.parseLong(r5);
        r6.<init>(r0);
        return r6;
    L_0x0041:
        r5 = r4.m4023b(r5, r6);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.t.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public void setLenient(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (this.f4802i != valueOf) {
            this.f4802i = valueOf;
            m4021a();
        }
    }

    public void setTimeZone(TimeZone timeZone) {
        if (!timeZone.equals(this.f4800g)) {
            m4021a();
            this.f4800g = timeZone;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DateFormat ");
        stringBuilder.append(getClass().getName());
        String stringBuilder2 = stringBuilder.toString();
        TimeZone timeZone = this.f4800g;
        if (timeZone != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(" (timezone: ");
            stringBuilder3.append(timeZone);
            stringBuilder3.append(")");
            stringBuilder2 = stringBuilder3.toString();
        }
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(stringBuilder2);
        stringBuilder4.append("(locale: ");
        stringBuilder4.append(this.f4801h);
        stringBuilder4.append(")");
        return stringBuilder4.toString();
    }
}
