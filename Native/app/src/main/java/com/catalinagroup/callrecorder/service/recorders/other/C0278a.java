package com.catalinagroup.callrecorder.service.recorders.other;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;

/* renamed from: a.k.a.a */
public abstract class C0278a {

    /* renamed from: a */
    private final C0278a f803a;

    C0278a(C0278a aVar) {
        this.f803a = aVar;
    }

    /* renamed from: a */
    /*public static C0278a m1303a(Context context, Uri uri) {
        if (VERSION.SDK_INT >= 21) {
            return new C0280c(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }*/

    /* renamed from: a */
    public abstract C0278a mo1142a(String str);

    /* renamed from: a */
    public abstract C0278a mo1143a(String str, String str2);

    /* renamed from: a */
    public abstract boolean mo1144a();

    /* renamed from: b */
    public C0278a mo1145b(String str) {
        C0278a[] k;
        for (C0278a aVar : mo1156k()) {
            if (str.equals(aVar.mo1149d())) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public abstract boolean mo1146b();

    /* renamed from: c */
    public abstract boolean mo1147c();

    /* renamed from: c */
    public abstract boolean mo1148c(String str);

    /* renamed from: d */
    public abstract String mo1149d();

    /* renamed from: e */
    public C0278a mo1150e() {
        return this.f803a;
    }

    /* renamed from: f */
    public abstract Uri mo1151f();

    /* renamed from: g */
    public abstract boolean mo1152g();

    /* renamed from: h */
    public abstract boolean mo1153h();

    /* renamed from: i */
    public abstract long mo1154i();

    /* renamed from: j */
    public abstract long mo1155j();

    /* renamed from: k */
    public abstract C0278a[] mo1156k();
}
