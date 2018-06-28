package com.p085c.p086a.p089c.p092b;

import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1182c;

public abstract class C1144h {
    public static final C1144h f3689a = new C51411();
    public static final C1144h f3690b = new C51422();
    public static final C1144h f3691c = new C51433();
    public static final C1144h f3692d = new C51444();
    public static final C1144h f3693e = new C51455();

    static class C51411 extends C1144h {
        C51411() {
        }

        public final boolean mo1167a() {
            return true;
        }

        public final boolean mo1168a(C1102a c1102a) {
            return c1102a == C1102a.REMOTE;
        }

        public final boolean mo1169a(boolean z, C1102a c1102a, C1182c c1182c) {
            return (c1102a == C1102a.RESOURCE_DISK_CACHE || c1102a == C1102a.MEMORY_CACHE) ? false : true;
        }

        public final boolean mo1170b() {
            return true;
        }
    }

    static class C51422 extends C1144h {
        C51422() {
        }

        public final boolean mo1167a() {
            return false;
        }

        public final boolean mo1168a(C1102a c1102a) {
            return false;
        }

        public final boolean mo1169a(boolean z, C1102a c1102a, C1182c c1182c) {
            return false;
        }

        public final boolean mo1170b() {
            return false;
        }
    }

    static class C51433 extends C1144h {
        C51433() {
        }

        public final boolean mo1167a() {
            return false;
        }

        public final boolean mo1168a(C1102a c1102a) {
            return (c1102a == C1102a.DATA_DISK_CACHE || c1102a == C1102a.MEMORY_CACHE) ? false : true;
        }

        public final boolean mo1169a(boolean z, C1102a c1102a, C1182c c1182c) {
            return false;
        }

        public final boolean mo1170b() {
            return true;
        }
    }

    static class C51444 extends C1144h {
        C51444() {
        }

        public final boolean mo1167a() {
            return true;
        }

        public final boolean mo1168a(C1102a c1102a) {
            return false;
        }

        public final boolean mo1169a(boolean z, C1102a c1102a, C1182c c1182c) {
            return (c1102a == C1102a.RESOURCE_DISK_CACHE || c1102a == C1102a.MEMORY_CACHE) ? false : true;
        }

        public final boolean mo1170b() {
            return false;
        }
    }

    static class C51455 extends C1144h {
        C51455() {
        }

        public final boolean mo1167a() {
            return true;
        }

        public final boolean mo1168a(C1102a c1102a) {
            return c1102a == C1102a.REMOTE;
        }

        public final boolean mo1169a(boolean z, C1102a c1102a, C1182c c1182c) {
            return ((z && c1102a == C1102a.DATA_DISK_CACHE) || c1102a == C1102a.LOCAL) && c1182c == C1182c.TRANSFORMED;
        }

        public final boolean mo1170b() {
            return true;
        }
    }

    public abstract boolean mo1167a();

    public abstract boolean mo1168a(C1102a c1102a);

    public abstract boolean mo1169a(boolean z, C1102a c1102a, C1182c c1182c);

    public abstract boolean mo1170b();
}
