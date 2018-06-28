package mobi.mmdt.ott.provider.p387i;

public final class C2992c {
    public long f9379a;
    public String f9380b;
    public String f9381c;
    public String f9382d;
    public String f9383e;
    public Integer f9384f;
    public int f9385g;
    public String f9386h;
    public int f9387i;
    public int f9388j;
    public String f9389k;
    public boolean f9390l;

    public static class C2991a {
        public C2992c f9378a = new C2992c();

        public final C2991a m7471a(int i) {
            this.f9378a.f9385g = i;
            return this;
        }

        public final C2991a m7472a(long j) {
            this.f9378a.f9379a = j;
            return this;
        }

        public final C2991a m7473a(Integer num) {
            this.f9378a.f9384f = num;
            return this;
        }

        public final C2991a m7474a(String str) {
            this.f9378a.f9380b = str;
            return this;
        }

        public final C2991a m7475b(int i) {
            this.f9378a.f9387i = i;
            return this;
        }

        public final C2991a m7476b(String str) {
            this.f9378a.f9381c = str;
            return this;
        }

        public final C2991a m7477c(int i) {
            this.f9378a.f9388j = i;
            return this;
        }

        public final C2991a m7478c(String str) {
            this.f9378a.f9382d = str;
            return this;
        }

        public final C2991a m7479d(String str) {
            this.f9378a.f9383e = str;
            return this;
        }

        public final C2991a m7480e(String str) {
            this.f9378a.f9386h = str;
            return this;
        }

        public final C2991a m7481f(String str) {
            this.f9378a.f9389k = str;
            return this;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9379a == ((C2992c) obj).f9379a;
    }

    public final int hashCode() {
        return (int) (this.f9379a ^ (this.f9379a >>> 32));
    }
}
