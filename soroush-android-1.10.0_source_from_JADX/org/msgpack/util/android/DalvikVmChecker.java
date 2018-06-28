package org.msgpack.util.android;

public final class DalvikVmChecker {
    private static final boolean isDalvikVm;

    static {
        try {
            isDalvikVm = System.getProperty("java.vm.name").equals("Dalvik");
        } catch (Throwable th) {
            isDalvikVm = false;
        }
    }

    public static boolean isDalvikVm() {
        return isDalvikVm;
    }
}
