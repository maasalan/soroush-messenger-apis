package com.p067a.p070b.p071a;

import com.p067a.p070b.C0986j;
import com.p067a.p070b.C0994p;
import com.p067a.p070b.C0994p.C0992a;
import com.p067a.p070b.C0994p.C0993b;
import com.p067a.p070b.C0997u;
import com.p067a.p070b.C5061l;
import org.json.JSONObject;

public class C6439h extends C5056i<JSONObject> {
    public C6439h(int i, String str, C0993b<JSONObject> c0993b, C0992a c0992a) {
        super(i, str, null, c0993b, c0992a);
    }

    public C6439h(int i, String str, String str2, C0993b<JSONObject> c0993b, C0992a c0992a) {
        super(i, str, str2, c0993b, c0992a);
    }

    public C6439h(int i, String str, JSONObject jSONObject, C0993b<JSONObject> c0993b, C0992a c0992a) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), c0993b, c0992a);
    }

    public C6439h(String str, C0993b<JSONObject> c0993b, C0992a c0992a) {
        super(0, str, null, c0993b, c0992a);
    }

    public C6439h(String str, JSONObject jSONObject, C0993b<JSONObject> c0993b, C0992a c0992a) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, (C0993b) c0993b, c0992a);
    }

    protected C0994p<JSONObject> parseNetworkResponse(C0986j c0986j) {
        C0997u c5061l;
        try {
            return new C0994p(new JSONObject(new String(c0986j.f3171b, C0972e.m2430a(c0986j.f3172c, "utf-8"))), C0972e.m2429a(c0986j));
        } catch (Throwable e) {
            c5061l = new C5061l(e);
            return C0994p.m2445a(c5061l);
        } catch (Throwable e2) {
            c5061l = new C5061l(e2);
            return C0994p.m2445a(c5061l);
        }
    }
}
