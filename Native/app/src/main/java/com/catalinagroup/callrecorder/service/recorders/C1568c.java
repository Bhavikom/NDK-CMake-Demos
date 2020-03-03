package com.catalinagroup.callrecorder.service.recorders;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;

import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: com.catalinagroup.callrecorder.h.c */
class C1568c extends C1580f {

    /* renamed from: c */
    private File f4910c;

    /* renamed from: d */
    private final Context f4911d;

    C1568c(Context context, File file) {
        this.f4910c = file;
        this.f4911d = context;
    }

    /* renamed from: r */
    static String m7415r() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(File.separator);
        sb.append("CubeCallRecorder");
        return sb.toString();
    }

    /* renamed from: s */
    static boolean m7416s() {
        File file = new File(m7415r());
        boolean z = file.isDirectory() && file.canWrite();
        if (z) {
            m7417t();
        }
        return z;
    }

    /* renamed from: t */
    static void m7417t() {
        StringBuilder sb = new StringBuilder();
        sb.append(m7415r());
        sb.append(File.separator);
        sb.append("All");
        String sb2 = sb.toString();
        new File(sb2).mkdirs();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(File.separator);
        sb3.append(".nomedia");
        File file = new File(sb3.toString());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo6557a() {
        return this.f4910c.canWrite();
    }

    /* renamed from: b */
    public void mo6558b() {
        this.f4910c.mkdirs();
    }

    /* renamed from: c */
    public boolean mo6560c() {
        return this.f4910c.delete();
    }

    /* renamed from: d */
    public boolean mo6561d() {
        return this.f4910c.exists();
    }

    /* renamed from: f */
    public String mo6562f() {
        return this.f4910c.getName();
    }

    /* renamed from: h */
    public String mo6563h() {
        String absolutePath = this.f4910c.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(m7415r());
        sb.append(File.separator);
        String sb2 = sb.toString();
        return absolutePath.startsWith(sb2) ? absolutePath.substring(sb2.length()) : absolutePath;
    }

    /* renamed from: i */
    public Uri mo6564i() {
        if (VERSION.SDK_INT < 24) {
            return Uri.fromFile(this.f4910c);
        }
        Context context = this.f4911d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4911d.getApplicationContext().getPackageName());
        sb.append(".provider");
        return FileProvider.getUriForFile(context, sb.toString(), this.f4910c);
    }

    /* renamed from: j */
    public boolean mo6565j() {
        return this.f4910c.isDirectory();
    }

    /* renamed from: k */
    public boolean mo6566k() {
        return this.f4910c.isFile();
    }

    /* renamed from: l */
    public long mo6567l() {
        return this.f4910c.lastModified();
    }

    /* renamed from: m */
    public long mo6568m() {
        return this.f4910c.length();
    }

    /* renamed from: n */
    public C1580f[] mo6569n() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f4910c.listFiles();
        if (listFiles != null) {
            for (File cVar : listFiles) {
                arrayList.add(new C1568c(this.f4911d, cVar));
            }
        }
        return (C1580f[]) arrayList.toArray(new C1580f[arrayList.size()]);
    }

    /* renamed from: o */
    public InputStream mo6570o() {
        try {
            return new FileInputStream(this.f4910c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public C1580f mo6555a(String str) {
        Context context = this.f4911d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4910c.getAbsolutePath());
        sb.append(File.separator);
        sb.append(str);
        return new C1568c(context, new File(sb.toString()));
    }

    /* renamed from: c */
    public void mo6559c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4910c.getParent());
        sb.append(File.separator);
        sb.append(str);
        File file = new File(sb.toString());
        if (this.f4910c.renameTo(file)) {
            this.f4910c = file;
        }
    }

    /* renamed from: a */
    public OutputStream mo6556a(boolean z) {
        try {
            return new FileOutputStream(this.f4910c, z);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    static C1568c m7414a(Context context, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(m7415r());
        if (str.isEmpty()) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(File.separator);
            sb2.append(str);
            str2 = sb2.toString();
        }
        sb.append(str2);
        return new C1568c(context, new File(sb.toString()));
    }
}
