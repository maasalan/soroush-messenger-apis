package com.liulishuo.filedownloader.p205h;

public class C2173a {
    private static void m5963a(String str, Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(", but the download service isn't connected yet.\nYou can use FileDownloader#isServiceConnected() to check whether the service has been connected, \nbesides you can use following functions easier to control your code invoke after the service has been connected: \n1. FileDownloader#bindService(Runnable)\n2. FileDownloader#insureServiceBind()\n3. FileDownloader#insureServiceBindAsync()");
        C2182d.m5984d(C2173a.class, stringBuilder.toString(), objArr);
    }

    public static boolean m5964a(int i) {
        C2173a.m5963a("request pause the task[%d] in the download service", Integer.valueOf(i));
        return false;
    }

    public static boolean m5965a(String str, String str2, boolean z) {
        C2173a.m5963a("request start the task([%s], [%s], [%B]) in the download service", str, str2, Boolean.valueOf(z));
        return false;
    }

    public static byte m5966b(int i) {
        C2173a.m5963a("request get the status for the task[%d] in the download service", Integer.valueOf(i));
        return (byte) 0;
    }
}
