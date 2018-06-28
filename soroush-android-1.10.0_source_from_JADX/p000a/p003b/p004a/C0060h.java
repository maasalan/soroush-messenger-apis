package p000a.p003b.p004a;

public abstract class C0060h extends IllegalStateException {
    protected final String f260a;

    public static class C4651a extends C0060h {
        private final byte[] f12772b;

        public C4651a(String str, byte[] bArr) {
            super(str);
            this.f12772b = bArr;
        }

        public final String getMessage() {
            StringBuilder stringBuilder = new StringBuilder("The DNS name '");
            stringBuilder.append(this.a);
            stringBuilder.append("' exceeds the maximum name length of 255 octets by ");
            stringBuilder.append(this.f12772b.length - 255);
            stringBuilder.append(" octets.");
            return stringBuilder.toString();
        }
    }

    public static class C4652b extends C0060h {
        private final String f12773b;

        public C4652b(String str, String str2) {
            super(str);
            this.f12773b = str2;
        }

        public final String getMessage() {
            StringBuilder stringBuilder = new StringBuilder("The DNS name '");
            stringBuilder.append(this.a);
            stringBuilder.append("' contains the label '");
            stringBuilder.append(this.f12773b);
            stringBuilder.append("' which exceeds the maximum label length of 63 octets by ");
            stringBuilder.append(this.f12773b.length() - 63);
            stringBuilder.append(" octets.");
            return stringBuilder.toString();
        }
    }

    protected C0060h(String str) {
        this.f260a = str;
    }
}
