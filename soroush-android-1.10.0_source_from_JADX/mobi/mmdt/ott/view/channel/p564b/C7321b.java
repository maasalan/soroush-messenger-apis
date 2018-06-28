package mobi.mmdt.ott.view.channel.p564b;

import java.util.concurrent.ConcurrentHashMap;
import mobi.mmdt.ott.R;

public final class C7321b extends C7174a {
    private static ConcurrentHashMap<Integer, Integer> f21073e;
    public boolean f21074a;
    public int f21075b;
    public String f21076c;
    public String f21077d;
    private int f21078f;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f21073e = concurrentHashMap;
        concurrentHashMap.put(Integer.valueOf(-101), Integer.valueOf(R.drawable.ic_service_owghat));
        f21073e.put(Integer.valueOf(-102), Integer.valueOf(R.drawable.ic_service_charge));
        f21073e.put(Integer.valueOf(-103), Integer.valueOf(R.drawable.ic_service_bill));
        f21073e.put(Integer.valueOf(-104), Integer.valueOf(R.drawable.ic_service_weather));
        f21073e.put(Integer.valueOf(-1), Integer.valueOf(R.drawable.ic_services));
        f21073e.put(Integer.valueOf(-105), Integer.valueOf(R.drawable.ic_location_map));
    }

    public final int m19586b() {
        return f21073e.containsKey(Integer.valueOf(this.f21075b)) ? ((Integer) f21073e.get(Integer.valueOf(this.f21075b))).intValue() : this.f21078f;
    }
}
