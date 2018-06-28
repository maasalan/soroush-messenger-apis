package mobi.mmdt.ott.view.components.fileselector;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.C2482c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.fileselector.p406a.C6832a;
import mobi.mmdt.ott.view.components.fileselector.p565b.C7178a;
import mobi.mmdt.ott.view.components.fileselector.p565b.C7324b;
import mobi.mmdt.ott.view.components.fileselector.p565b.C7325c;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6090a extends C3150a implements C3126i, C3159b {
    C6833b f16309a;
    LinearLayoutManager f16310b;
    boolean f16311c;
    private int f16312e = 1;
    private RelativeLayout f16313f;
    private TextView f16314g;
    private RecyclerView f16315h;
    private C3157c f16316i;
    private FileFilter f16317j;
    private String f16318k;
    private int f16319l = 0;
    private int f16320m = 10;
    private FrameLayout f16321n;
    private LinearLayout f16322o;
    private View f16323p;
    private ImageView f16324q;
    private TextView f16325r;
    private ArrayList<String> f16326s;
    private View f16327t;

    class C31541 implements FileFilter {
        final /* synthetic */ C6090a f9778a;

        C31541(C6090a c6090a) {
            this.f9778a = c6090a;
        }

        public final boolean accept(File file) {
            if (!file.isFile()) {
                return true;
            }
            return FileSelectorActivity.f23985m.containsKey(C2468a.m6711h(file.getAbsolutePath()).toLowerCase());
        }
    }

    class C31552 implements OnClickListener {
        final /* synthetic */ C6090a f9779a;

        C31552(C6090a c6090a) {
            this.f9779a = c6090a;
        }

        public final void onClick(View view) {
            this.f9779a.f16316i.mo3652h();
        }
    }

    public class C6832a extends AsyncTask<Object, List, List> {
        final /* synthetic */ C6090a f9780a;

        public C6832a(C6090a c6090a) {
            this.f9780a = c6090a;
        }

        private List m7636a(String str) {
            File file = new File(str);
            File[] listFiles = this.f9780a.f16317j != null ? file.listFiles(r1.f9780a.f16317j) : file.listFiles();
            List arrayList = new ArrayList();
            int i = 1;
            try {
                int length = listFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    File file2 = listFiles[i2];
                    if (file2.isDirectory()) {
                        if (!file2.isHidden()) {
                            int i3 = 0;
                            int i4 = 0;
                            for (File file3 : file2.listFiles()) {
                                if (!file3.isHidden()) {
                                    if (file3.isDirectory()) {
                                        i3++;
                                    } else if (r1.f9780a.f16317j.accept(file3)) {
                                        i4++;
                                    }
                                }
                            }
                            String str2 = "";
                            if (i3 + i4 > 0) {
                                StringBuilder stringBuilder;
                                if (i3 > 0) {
                                    if (i3 == i) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(str2);
                                        stringBuilder.append(i3);
                                        stringBuilder.append(" Folder");
                                    } else {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(str2);
                                        stringBuilder.append(i3);
                                        stringBuilder.append(" Folders");
                                    }
                                    str2 = stringBuilder.toString();
                                }
                                if (i3 > 0 && i4 > 0) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(str2);
                                    stringBuilder.append(", ");
                                    str2 = stringBuilder.toString();
                                }
                                if (i4 > 0) {
                                    if (i4 == i) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(str2);
                                        stringBuilder.append(i4);
                                        stringBuilder.append(" File");
                                    } else {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(str2);
                                        stringBuilder.append(i4);
                                        stringBuilder.append(" Files");
                                    }
                                    str2 = stringBuilder.toString();
                                }
                            } else {
                                str2 = "Empty";
                            }
                            arrayList.add(new C7325c(file2.getName(), file2.getAbsolutePath(), str2, i));
                        }
                    } else if (!file2.isHidden()) {
                        String absolutePath = file2.getAbsolutePath();
                        int i5 = R.drawable.ic_file_selection_file;
                        if (C2468a.m6704a(absolutePath)) {
                            i5 = R.drawable.ic_file_selection_image;
                        } else if (C2468a.m6705b(absolutePath)) {
                            i5 = R.drawable.ic_file_selection_movie;
                        } else if (C2468a.m6706c(absolutePath)) {
                            i5 = R.drawable.ic_file_selection_music;
                        } else if (C2468a.m6707d(absolutePath)) {
                            i5 = R.drawable.ic_file_selection_pdf;
                        } else if (C2468a.m6710g(absolutePath)) {
                            i5 = R.drawable.ic_file_selection_apk;
                        }
                        arrayList.add(new C7324b(file2.getName(), absolutePath, C2491i.m6770a(r1.f9780a.getActivity(), (float) ((int) file2.length())), i5, r1.f9780a.m13751d().containsKey(absolutePath)));
                    }
                    i2++;
                    i = 1;
                }
            } catch (Throwable e) {
                C2480b.m6738b(e);
            }
            Collections.sort(arrayList);
            List arrayList2 = new ArrayList();
            int i6 = 0;
            for (Object next : arrayList) {
                ((C7178a) next).k = i6;
                arrayList2.add(next);
                i6++;
            }
            return arrayList2;
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m7636a((String) objArr[0]);
        }

        protected final /* synthetic */ void onPostExecute(Object obj) {
            List list = (List) obj;
            super.onPostExecute(list);
            if (this.f9780a.getView() != null) {
                if (this.f9780a.f16309a == null) {
                    this.f9780a.f16309a = new C6833b(this.f9780a, this.f9780a.getActivity());
                }
                this.f9780a.f16309a.m13673a(list);
                if (list.size() > 0) {
                    this.f9780a.f16322o.setVisibility(8);
                    return;
                }
                this.f9780a.f16322o.setVisibility(0);
            }
        }
    }

    public interface C3157c {
        void mo3650a(String str);

        void mo3651a(String str, String str2, String str3);

        void mo3643g();

        boolean mo3652h();
    }

    public class C6833b extends C6074f {
        final /* synthetic */ C6090a f19521a;

        public C6833b(C6090a c6090a, Context context) {
            this.f19521a = c6090a;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            C6829g c6829g = (C6829g) this.c.get(i);
            if (c6073e.getItemViewType() == 1) {
                C7324b c7324b = (C7324b) c6829g;
                c7324b.f21100d = this.f19521a.m13751d().containsKey(c7324b.f21098b);
            }
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1:
                    return new C6832a(this.f19521a.getActivity(), this.f19521a, this.f16246b, viewGroup, this.f19521a);
                case 2:
                    return new mobi.mmdt.ott.view.components.fileselector.p406a.C6833b(this.f19521a.getActivity(), this.f19521a, this.f16246b, viewGroup);
                default:
                    return null;
            }
        }
    }

    private void m13749c(C7324b c7324b) {
        c7324b.f21100d = true;
        if (m13751d().size() >= this.f16320m) {
            c7324b.f21100d = false;
            Toast.makeText(getActivity(), String.format(C4522p.m8236a(R.string.format_string_can_not_share_more_than), new Object[]{Integer.valueOf(this.f16320m)}), 0).show();
        } else if (!m13751d().containsKey(c7324b.f21098b)) {
            m13751d().put(c7324b.f21098b, Boolean.valueOf(true));
        }
        m13756b();
        this.f16316i.mo3643g();
        this.f16309a.notifyDataSetChanged();
    }

    private LinkedHashMap<String, Boolean> m13751d() {
        return ((MyApplication) getActivity().getApplication()).f15914t;
    }

    private void m13752d(C7324b c7324b) {
        c7324b.f21100d = false;
        if (m13751d().size() > 0 && m13751d().containsKey(c7324b.f21098b)) {
            m13751d().remove(c7324b.f21098b);
        }
        this.f16316i.mo3643g();
        this.f16309a.notifyDataSetChanged();
    }

    public final void mo2263a(C7324b c7324b) {
        m13749c(c7324b);
    }

    public final boolean mo2264a() {
        return this.f16311c;
    }

    public final void m13756b() {
        if (!this.f16311c) {
            this.f16311c = true;
            if (this.f16309a != null) {
                this.f16309a.notifyDataSetChanged();
            }
        }
    }

    public final void mo2265b(C7324b c7324b) {
        m13752d(c7324b);
    }

    public final void mo2234c(int i) {
        C7178a c7178a = (C7178a) this.f16309a.m13671a(i);
        if (c7178a.f19503j == 1) {
            C7324b c7324b = (C7324b) c7178a;
            if (this.f16312e != 1) {
                if (this.f16312e == 2) {
                    this.f16316i.mo3651a(c7324b.f21098b, c7324b.f21097a, c7324b.f21099c);
                }
                return;
            } else if (!this.f16311c) {
                this.f16316i.mo3651a(c7324b.f21098b, c7324b.f21097a, c7324b.f21099c);
                return;
            } else if (c7324b.f21100d) {
                m13752d(c7324b);
                return;
            } else {
                m13749c(c7324b);
                return;
            }
        }
        if (c7178a.f19503j == 2) {
            this.f16316i.mo3650a(((C7325c) c7178a).f21103b);
        }
    }

    public final void mo2235d(int i) {
        if (this.f16312e == 1) {
            C7178a c7178a = (C7178a) this.f16309a.m13671a(i);
            if (c7178a.f19503j == 1) {
                C7324b c7324b = (C7324b) c7178a;
                if (c7324b.f21100d) {
                    m13752d(c7324b);
                    return;
                }
                m13749c(c7324b);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f16318k != null) {
            new C6832a(this).execute(new Object[]{this.f16318k});
            return;
        }
        List arrayList = new ArrayList();
        this.f16326s = new ArrayList();
        this.f16326s = C2482c.m6743a();
        Iterator it = this.f16326s.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            File file = new File(str);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i2 = 0;
                int i3 = i2;
                int i4 = i3;
                while (i2 < length) {
                    File file2 = listFiles[i2];
                    if (!file2.isHidden()) {
                        if (file2.isDirectory()) {
                            i3++;
                        } else if (this.f16317j.accept(file2)) {
                            i4++;
                        }
                    }
                    i2++;
                }
                String str2 = "";
                if (i3 + i4 > 0) {
                    StringBuilder stringBuilder;
                    if (i3 > 0) {
                        if (i3 == 1) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str2);
                            stringBuilder.append(i3);
                            str2 = " Folder";
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str2);
                            stringBuilder.append(i3);
                            str2 = " Folders";
                        }
                        stringBuilder.append(str2);
                        str2 = stringBuilder.toString();
                    }
                    if (i3 > 0 && i4 > 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str2);
                        stringBuilder.append(", ");
                        str2 = stringBuilder.toString();
                    }
                    if (i4 > 0) {
                        if (i4 == 1) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str2);
                            stringBuilder.append(i4);
                            str2 = " File";
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str2);
                            stringBuilder.append(i4);
                            str2 = " Files";
                        }
                        stringBuilder.append(str2);
                        str2 = stringBuilder.toString();
                    }
                } else {
                    str2 = "Empty";
                }
                String path = file.getPath();
                if (file.getPath().equalsIgnoreCase(Environment.getExternalStorageDirectory().getPath())) {
                    path = C4522p.m8236a(R.string.internal_device_storage);
                }
                i2 = i + 1;
                arrayList.add(new C7325c(path, str, str2, i));
                i = i2;
            }
        }
        if (this.f16309a == null) {
            this.f16309a = new C6833b(this, getActivity());
        }
        this.f16309a.m13673a(arrayList);
    }

    public final void onAttach(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.components.fileselector.C6090a.C3157c) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16316i = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnFileSelectorFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.fileselector.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            if (getArguments().containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
                this.f16319l = getArguments().getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION");
            }
            if (getArguments().containsKey("EXTRA_MAX_PHOTO_SELECT_COUNT")) {
                this.f16320m = getArguments().getInt("EXTRA_MAX_PHOTO_SELECT_COUNT");
            }
            if (getArguments().containsKey("EXTRA_SELECT_MODE")) {
                this.f16312e = getArguments().getInt("EXTRA_SELECT_MODE");
            }
        }
        this.f16317j = new C31541(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16327t = layoutInflater.inflate(R.layout.fragment_file_selector, viewGroup, false);
        return this.f16327t;
    }

    public final void onDestroyView() {
        if (this.f16315h != null) {
            this.f16315h.setItemAnimator(null);
            this.f16315h.setAdapter(null);
            this.f16315h = null;
        }
        this.f16309a = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        CharSequence charSequence;
        super.onViewCreated(view, bundle);
        if (m13751d().size() > 0) {
            this.f16311c = true;
        }
        if (getArguments() != null && getArguments().containsKey("KEY_FOLDER_PATH")) {
            this.f16318k = getArguments().getString("KEY_FOLDER_PATH");
        }
        this.f16313f = (RelativeLayout) this.f16327t.findViewById(R.id.navigator_relativeLayout);
        this.f16314g = (TextView) this.f16327t.findViewById(R.id.navigator_textView);
        this.f16324q = (ImageView) this.f16327t.findViewById(R.id.navigator_imageView);
        this.f16310b = new LinearLayoutManager(getActivity());
        this.f16315h = (RecyclerView) this.f16327t.findViewById(R.id.recycler_view);
        this.f16322o = (LinearLayout) this.f16327t.findViewById(R.id.empty_state_linearLayout);
        this.f16321n = (FrameLayout) this.f16327t.findViewById(R.id.empty_state_frameLayout_image);
        this.f16323p = this.f16327t.findViewById(R.id.divider_line);
        this.f16325r = (TextView) this.f16327t.findViewById(R.id.empty_state_textView);
        this.f16309a = new C6833b(this, getActivity());
        this.f16315h.setHasFixedSize(true);
        this.f16315h.setAdapter(this.f16309a);
        this.f16315h.setLayoutManager(this.f16310b);
        this.f16315h.scrollToPosition(this.f16319l);
        this.f16313f.setOnClickListener(new C31552(this));
        if (this.f16318k != null) {
            textView = this.f16314g;
            charSequence = this.f16318k;
        } else {
            textView = this.f16314g;
            charSequence = C4522p.m8236a(R.string.back);
        }
        textView.setText(charSequence);
        C2491i.m6786a(getActivity(), this.f16321n);
        C2491i.m6796a(this.f16323p, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f16314g, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6801a(this.f16324q, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6802a(this.f16325r, UIThemeManager.getmInstance().getText_primary_color());
    }
}
