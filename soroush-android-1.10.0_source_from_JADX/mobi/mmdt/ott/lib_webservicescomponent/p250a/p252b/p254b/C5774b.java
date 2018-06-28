package mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p254b;

import mobi.mmdt.ott.lib_webservicescomponent.p250a.p252b.p253a.C2548a;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5784f;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5786h;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5787i;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5790l;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5793o;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.C5800v;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.aa;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ad;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.al;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ap;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.aq;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.ar;
import mobi.mmdt.ott.lib_webservicescomponent.p256c.au;
import org.json.JSONObject;

public abstract class C5774b implements C2549a {
    public final C2548a mo2162a(JSONObject jSONObject, JSONObject jSONObject2) {
        int parseInt = Integer.parseInt(jSONObject.getString("ResultCode"));
        if (!(parseInt == 321 || parseInt == 322)) {
            if (parseInt != 324) {
                if (parseInt == 315) {
                    throw new ad(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                } else if (parseInt == 301) {
                    throw new ap(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                } else if (parseInt == 310) {
                    throw new C5784f(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                } else {
                    if (parseInt != 311) {
                        if (parseInt != 320) {
                            if (parseInt == 330) {
                                throw new C5790l(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                            } else if (parseInt == 335) {
                                throw new al(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                            } else if (parseInt == 410) {
                                throw new C5786h(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                            } else if (parseInt == 601) {
                                throw new aq(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                            } else {
                                if (parseInt != 316) {
                                    if (parseInt != 312) {
                                        if (parseInt != 313) {
                                            if (parseInt != 314) {
                                                if (parseInt == 950) {
                                                    throw new C5800v(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                                                }
                                                throw new au(jSONObject.getInt("ResultCode"), jSONObject.getString("ResultMessage"), jSONObject2);
                                            }
                                        }
                                        throw new C5793o(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                                    }
                                }
                                throw new ar(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                            }
                        }
                    }
                    throw new aa(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
                }
            }
        }
        throw new C5787i(parseInt, jSONObject.getString("ResultMessage"), jSONObject2);
    }
}
