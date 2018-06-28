package p000a.p003b.p004a.p007c;

import java.util.Collections;
import java.util.List;
import p000a.p003b.p004a.C0049f.C4646a;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.C0076k;
import p000a.p003b.p004a.p014i.C0061g;
import p000a.p003b.p004a.p014i.C4656e;
import p000a.p003b.p004a.p014i.C4665q;

public abstract class C0034g {

    public static class C4632a extends C0034g {
        private final int f12740a;
        private final String f12741b;
        private final Exception f12742c;
        private final C0076k<? extends C0061g> f12743d;

        public C4632a(C4646a c4646a, String str, C0076k<? extends C0061g> c0076k, Exception exception) {
            this.f12740a = c4646a.f196e;
            this.f12741b = str;
            this.f12743d = c0076k;
            this.f12742c = exception;
        }

        public final String mo5a() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f12741b);
            stringBuilder.append(" algorithm ");
            stringBuilder.append(this.f12740a);
            stringBuilder.append(" threw exception while verifying ");
            stringBuilder.append(this.f12743d.f340a);
            stringBuilder.append(": ");
            stringBuilder.append(this.f12742c);
            return stringBuilder.toString();
        }
    }

    public static class C4633b extends C0034g {
        private final String f12744a;
        private final String f12745b;
        private final C0076k<? extends C0061g> f12746c;

        public C4633b(byte b, String str, C0076k<? extends C0061g> c0076k) {
            this.f12744a = Integer.toString(b & 255);
            this.f12745b = str;
            this.f12746c = c0076k;
        }

        public final String mo5a() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f12745b);
            stringBuilder.append(" algorithm ");
            stringBuilder.append(this.f12744a);
            stringBuilder.append(" required to verify ");
            stringBuilder.append(this.f12746c.f340a);
            stringBuilder.append(" is unknown or not supported by platform");
            return stringBuilder.toString();
        }
    }

    public static class C4634c extends C0034g {
        private final C0076k<C4656e> f12747a;

        public C4634c(C0076k<C4656e> c0076k) {
            this.f12747a = c0076k;
        }

        public final String mo5a() {
            StringBuilder stringBuilder = new StringBuilder("Zone ");
            stringBuilder.append(this.f12747a.f340a.f184d);
            stringBuilder.append(" is in list of known SEPs, but DNSKEY from response mismatches!");
            return stringBuilder.toString();
        }
    }

    public static class C4635d extends C0034g {
        private final C0065j f12748a;
        private final C0076k<? extends C0061g> f12749b;

        public C4635d(C0065j c0065j, C0076k<? extends C0061g> c0076k) {
            this.f12748a = c0065j;
            this.f12749b = c0076k;
        }

        public final String mo5a() {
            StringBuilder stringBuilder = new StringBuilder("NSEC ");
            stringBuilder.append(this.f12749b.f340a);
            stringBuilder.append(" does nat match question for ");
            stringBuilder.append(this.f12748a.f272b);
            stringBuilder.append(" at ");
            stringBuilder.append(this.f12748a.f271a);
            return stringBuilder.toString();
        }
    }

    public static class C4636e extends C0034g {
        static final /* synthetic */ boolean f12750a = true;
        private final C0065j f12751b;
        private final List<C4665q> f12752c;

        static {
            Class cls = C0034g.class;
        }

        public C4636e(C0065j c0065j, List<C4665q> list) {
            this.f12751b = c0065j;
            if (f12750a || !list.isEmpty()) {
                this.f12752c = Collections.unmodifiableList(list);
                return;
            }
            throw new AssertionError();
        }

        public final String mo5a() {
            StringBuilder stringBuilder = new StringBuilder("No currently active signatures were attached to answer on question for ");
            stringBuilder.append(this.f12751b.f272b);
            stringBuilder.append(" at ");
            stringBuilder.append(this.f12751b.f271a);
            return stringBuilder.toString();
        }
    }

    public static class C4637f extends C0034g {
        public final String mo5a() {
            return "No secure entry point was found for the root zone (\"Did you forget to configure a root SEP?\")";
        }
    }

    public static class C4638g extends C0034g {
        private final String f12753a;

        public C4638g(String str) {
            this.f12753a = str;
        }

        public final String mo5a() {
            StringBuilder stringBuilder = new StringBuilder("No secure entry point was found for zone ");
            stringBuilder.append(this.f12753a);
            return stringBuilder.toString();
        }
    }

    public static class C4639h extends C0034g {
        private final C0065j f12754a;

        public C4639h(C0065j c0065j) {
            this.f12754a = c0065j;
        }

        public final String mo5a() {
            StringBuilder stringBuilder = new StringBuilder("No signatures were attached to answer on question for ");
            stringBuilder.append(this.f12754a.f272b);
            stringBuilder.append(" at ");
            stringBuilder.append(this.f12754a.f271a);
            return stringBuilder.toString();
        }
    }

    public static class C4640i extends C0034g {
        private final String f12755a;

        public C4640i(String str) {
            this.f12755a = str;
        }

        public final String mo5a() {
            StringBuilder stringBuilder = new StringBuilder("No trust anchor was found for zone ");
            stringBuilder.append(this.f12755a);
            stringBuilder.append(". Try enabling DLV");
            return stringBuilder.toString();
        }
    }

    public abstract String mo5a();

    public boolean equals(Object obj) {
        return (obj instanceof C0034g) && ((C0034g) obj).mo5a().equals(mo5a());
    }

    public int hashCode() {
        return mo5a().hashCode();
    }

    public String toString() {
        return mo5a();
    }
}
