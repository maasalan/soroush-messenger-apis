package mobi.mmdt.ott.logic.vas.pray;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.C2565c;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2918a;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2919b;
import mobi.mmdt.ott.logic.vas.pray.p376a.C2921d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.tools.C4522p;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.util.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class C2922a {
    private static C2922a f9102a;
    private ArrayList<C2921d> f9103b = null;
    private HashMap<String, C2921d> f9104c;

    private class C2918a implements Comparator<C2921d> {
        final /* synthetic */ C2922a f9082a;

        private C2918a(C2922a c2922a) {
            this.f9082a = c2922a;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C2921d) obj).f9100b.compareTo(((C2921d) obj2).f9100b);
        }
    }

    private C2922a() {
    }

    public static C2922a m7297a() {
        if (f9102a == null) {
            f9102a = new C2922a();
        }
        return f9102a;
    }

    public static void m7298a(C2918a c2918a) {
        String stringBuilder;
        if (c2918a != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(c2918a.f9085c);
            stringBuilder2.append(";");
            stringBuilder2.append(c2918a.f9084b);
            stringBuilder2.append(";");
            stringBuilder2.append(c2918a.f9086d.f9089a);
            stringBuilder2.append(";");
            stringBuilder2.append(c2918a.f9086d.f9090b);
            stringBuilder2.append(";");
            stringBuilder2.append(c2918a.f9083a);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = null;
        }
        C2535a.m6888a().f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_PRAY_TIME_CITY", stringBuilder).apply();
    }

    public static ArrayList<String> m7299b() {
        ArrayList c = C2922a.m7300c();
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object trim;
            C2918a c2918a = (C2918a) it.next();
            if (c2918a != null) {
                trim = (C2535a.m6888a().m6919b().equalsIgnoreCase(C2565c.FA.toString()) ? c2918a.f9085c : c2918a.f9084b).trim();
            } else {
                trim = C4522p.m8236a(R.string.no_thing);
            }
            arrayList.add(trim);
        }
        return arrayList;
    }

    public static ArrayList<C2918a> m7300c() {
        File file = new File(C2791c.m7109a().f8821g, "cities.txt");
        ArrayList<C2918a> arrayList = new ArrayList();
        arrayList.add(null);
        try {
            JSONArray jSONArray = new JSONObject(C2468a.m6698a(file)).getJSONArray("Cities");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new C2918a(jSONObject.getString("Id"), jSONObject.getString("PId"), jSONObject.getString("EName"), jSONObject.getString("Name"), new C2919b(jSONObject.getDouble("Lat"), jSONObject.getDouble("Lon"))));
            }
        } catch (IOException e) {
            e.printStackTrace();
            C2480b.m6736b("error in get city json file");
        } catch (JSONException e2) {
            e2.printStackTrace();
            return arrayList;
        }
        return arrayList;
    }

    public static String[] m7301e() {
        String string = C2535a.m6888a().f8278a.getString("mobi.mmdt.ott.model.pref.KEY_PRAY_TIME_CITY", null);
        return string != null ? string.split(";") : null;
    }

    public static String m7302f() {
        return C2922a.m7301e() == null ? null : C2535a.m6888a().m6919b().equalsIgnoreCase("fa") ? C2922a.m7301e()[0] : C2922a.m7301e()[1];
    }

    public static C2919b m7303g() {
        return C2922a.m7301e() == null ? null : new C2919b(Double.valueOf(Double.parseDouble(C2922a.m7301e()[2])).doubleValue(), Double.valueOf(Double.parseDouble(C2922a.m7301e()[3])).doubleValue());
    }

    private java.util.ArrayList<mobi.mmdt.ott.logic.vas.pray.p376a.C2921d> m7304h() {
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
        r8 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new java.util.HashMap;
        r1.<init>();
        r8.f9104c = r1;
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0016 }
        r2 = mobi.mmdt.ott.logic.vas.pray.C2922a.m7305i();	 Catch:{ JSONException -> 0x0016 }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x0016 }
        goto L_0x001b;
    L_0x0016:
        r1 = move-exception;
        r1.printStackTrace();
        r1 = 0;
    L_0x001b:
        r2 = r1.keys();
    L_0x001f:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0049;
    L_0x0025:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = r1.getJSONObject(r3);	 Catch:{ JSONException -> 0x001f }
        r5 = new mobi.mmdt.ott.logic.vas.pray.a.d;	 Catch:{ JSONException -> 0x001f }
        r6 = "ENName";	 Catch:{ JSONException -> 0x001f }
        r6 = r4.getString(r6);	 Catch:{ JSONException -> 0x001f }
        r7 = "Name";	 Catch:{ JSONException -> 0x001f }
        r4 = r4.getString(r7);	 Catch:{ JSONException -> 0x001f }
        r5.<init>(r3, r6, r4);	 Catch:{ JSONException -> 0x001f }
        r0.add(r5);	 Catch:{ JSONException -> 0x001f }
        r4 = r8.f9104c;	 Catch:{ JSONException -> 0x001f }
        r4.put(r3, r5);	 Catch:{ JSONException -> 0x001f }
        goto L_0x001f;
    L_0x0049:
        r1 = new mobi.mmdt.ott.logic.vas.pray.a$a;
        r2 = 0;
        r1.<init>();
        java.util.Collections.sort(r0, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.vas.pray.a.h():java.util.ArrayList<mobi.mmdt.ott.logic.vas.pray.a.d>");
    }

    private static String m7305i() {
        InputStream openRawResource = MyApplication.m12952b().getResources().openRawResource(R.raw.provinces);
        Object stringWriter = new StringWriter();
        char[] cArr = new char[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE];
        try {
            Reader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, StringUtils.UTF8));
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    break;
                }
                stringWriter.write(cArr, 0, read);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return stringWriter.toString();
        } catch (IOException e2) {
            e2.printStackTrace();
            return stringWriter.toString();
        } finally {
            try {
                openRawResource.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return stringWriter.toString();
    }

    public final ArrayList<String> m7306d() {
        if (this.f9103b == null) {
            this.f9103b = m7304h();
        }
        ArrayList arrayList = this.f9103b;
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2921d c2921d = (C2921d) it.next();
            arrayList2.add((C2535a.m6888a().m6919b().equalsIgnoreCase("fa") ? c2921d.f9100b : c2921d.f9099a).trim());
        }
        return arrayList2;
    }
}
