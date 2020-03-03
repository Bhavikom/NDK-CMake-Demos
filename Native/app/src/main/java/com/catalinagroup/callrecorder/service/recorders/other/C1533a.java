package com.catalinagroup.callrecorder.service.recorders.other;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;

import com.catalinagroup.callrecorder.service.recorders.R;
/*import com.catalinagroup.callrecorder.C1507c;
import com.catalinagroup.callrecorder.R;
import com.catalinagroup.callrecorder.database.C1517d;
import com.catalinagroup.callrecorder.iab.anjlab.BillingHistoryRecord;
import com.catalinagroup.callrecorder.iab.anjlab.C1769c;
import com.catalinagroup.callrecorder.iab.anjlab.C1769c.C1772c;
import com.catalinagroup.callrecorder.iab.anjlab.SkuDetails;*/

/* renamed from: com.catalinagroup.callrecorder.f.a */
public class C1533a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    //public final C1769c f4832a;

    /* renamed from: b */
    private final Context f4833b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1537d f4834c;

    /* renamed from: com.catalinagroup.callrecorder.f.a$a */
    class C1534a implements C1539f {

        /* renamed from: a */
        final /* synthetic */ C1541h f4835a;

        C1534a(C1541h hVar) {
            this.f4835a = hVar;
        }

        /* renamed from: a */
        public void mo6460a(String str, String str2, String str3) {
            long j = 0;
           /* if (!(str == null || str2 == null)) {
                try {
                    for (BillingHistoryRecord billingHistoryRecord : C1533a.this.f4832a.mo6902a(str2, (Bundle) null)) {
                        if (str.contentEquals(billingHistoryRecord.f5318c) && billingHistoryRecord.f5320e > j) {
                            j = billingHistoryRecord.f5320e;
                        }
                    }
                } catch (Throwable unused) {
                }
            }*/
            this.f4835a.f4841a = new C1540g(str3, j, null);
        }

        public void onFailure() {
        }
    }

    /* renamed from: com.catalinagroup.callrecorder.f.a$b */
    class C1535b implements C1539f {

        /* renamed from: a */
        final /* synthetic */ C1538e f4837a;

        C1535b(C1533a aVar, C1538e eVar) {
            this.f4837a = eVar;
        }

        /* renamed from: a */
        public void mo6460a(String str, String str2, String str3) {
            this.f4837a.onSuccess(str != null);
        }

        public void onFailure() {
            this.f4837a.onFailure();
        }
    }

    /* renamed from: com.catalinagroup.callrecorder.f.a$c */
    /*private class C1536c implements C1772c {
        private C1536c() {
        }

        *//* renamed from: a *//*
        public final void mo6462a() {
        }

        *//* JADX WARNING: Removed duplicated region for block: B:17:0x0037  *//*
        *//* JADX WARNING: Removed duplicated region for block: B:21:0x0050  *//*
        *//* JADX WARNING: Removed duplicated region for block: B:24:0x0061  *//*
        *//* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] *//*
        *//* renamed from: a *//*
        *//* Code decompiled incorrectly, please refer to instructions dump. *//*
        public final void mo6464a(String r4, com.catalinagroup.callrecorder.iab.anjlab.TransactionDetails r5) {
            *//*
                r3 = this;
                int r5 = r4.hashCode()
                r0 = -916046312(0xffffffffc9663e18, float:-943073.5)
                r1 = 2
                r2 = 1
                if (r5 == r0) goto L_0x002a
                r0 = -916046250(0xffffffffc9663e56, float:-943077.4)
                if (r5 == r0) goto L_0x0020
                r0 = 1594509081(0x5f0a4719, float:9.96396E18)
                if (r5 == r0) goto L_0x0016
                goto L_0x0034
            L_0x0016:
                java.lang.String r5 = "iap_premium_subscription_12b_1y"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0034
                r4 = 2
                goto L_0x0035
            L_0x0020:
                java.lang.String r5 = "iap_premium_subscription_2b_3m"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0034
                r4 = 0
                goto L_0x0035
            L_0x002a:
                java.lang.String r5 = "iap_premium_subscription_2b_1m"
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L_0x0034
                r4 = 1
                goto L_0x0035
            L_0x0034:
                r4 = -1
            L_0x0035:
                if (r4 == 0) goto L_0x0050
                if (r4 == r2) goto L_0x0046
                if (r4 == r1) goto L_0x003c
                goto L_0x0059
            L_0x003c:
                com.catalinagroup.callrecorder.a$b r4 = com.catalinagroup.callrecorder.C1414a.C1416b.SubscriptionPurchase12b1y
                java.lang.String r5 = com.catalinagroup.callrecorder.p123j.C1801j.m8067b()
                com.catalinagroup.callrecorder.C1414a.m6762a(r4, r5)
                goto L_0x0059
            L_0x0046:
                com.catalinagroup.callrecorder.a$b r4 = com.catalinagroup.callrecorder.C1414a.C1416b.SubscriptionPurchase2b1m
                java.lang.String r5 = com.catalinagroup.callrecorder.p123j.C1801j.m8067b()
                com.catalinagroup.callrecorder.C1414a.m6762a(r4, r5)
                goto L_0x0059
            L_0x0050:
                com.catalinagroup.callrecorder.a$b r4 = com.catalinagroup.callrecorder.C1414a.C1416b.SubscriptionPurchase
                java.lang.String r5 = com.catalinagroup.callrecorder.p123j.C1801j.m8067b()
                com.catalinagroup.callrecorder.C1414a.m6762a(r4, r5)
            L_0x0059:
                com.catalinagroup.callrecorder.f.a r4 = com.catalinagroup.callrecorder.p115f.C1533a.this
                com.catalinagroup.callrecorder.f.a$d r4 = r4.f4834c
                if (r4 == 0) goto L_0x0070
                com.catalinagroup.callrecorder.f.a r4 = com.catalinagroup.callrecorder.p115f.C1533a.this
                com.catalinagroup.callrecorder.f.a$d r4 = r4.f4834c
                r4.mo6466a()
                com.catalinagroup.callrecorder.f.a r4 = com.catalinagroup.callrecorder.p115f.C1533a.this
                r5 = 0
                r4.f4834c = r5
            L_0x0070:
                return
            *//*
            throw new UnsupportedOperationException("Method not decompiled: com.catalinagroup.callrecorder.p115f.C1533a.C1536c.mo6464a(java.lang.String, com.catalinagroup.callrecorder.iab.anjlab.TransactionDetails):void");
        }

        *//* renamed from: b *//*
        public void mo6465b() {
            C1533a.this.mo6459e();
        }

        *//* synthetic *//* C1536c(C1533a aVar, C1534a aVar2) {
            this();
        }

        *//* renamed from: a *//*
        public final void mo6463a(int i, Throwable th) {
            if (C1533a.this.f4834c != null) {
                C1533a.this.f4834c.mo6467b(null);
                C1533a.this.f4834c = null;
            }
        }
    }*/

    /* renamed from: com.catalinagroup.callrecorder.f.a$d */
    public interface C1537d {
        /* renamed from: a */
        void mo6466a();

        /* renamed from: b */
        void mo6467b(String str);
    }

    /* renamed from: com.catalinagroup.callrecorder.f.a$e */
    public interface C1538e {
        void onFailure();

        void onSuccess(boolean z);
    }

    /* renamed from: com.catalinagroup.callrecorder.f.a$f */
    private interface C1539f {
        /* renamed from: a */
        void mo6460a(String str, String str2, String str3);

        void onFailure();
    }

    /* renamed from: com.catalinagroup.callrecorder.f.a$g */
    public static class C1540g {

        /* renamed from: a */
        public final String f4839a;

        /* renamed from: b */
        public final long f4840b;

        /* synthetic */ C1540g(String str, long j, C1534a aVar) {
            this(str, j);
        }

        private C1540g(String str, long j) {
            this.f4839a = str;
            this.f4840b = j;
        }
    }

    /* renamed from: com.catalinagroup.callrecorder.f.a$h */
    private static class C1541h {

        /* renamed from: a */
        C1540g f4841a;

        private C1541h() {
            this.f4841a = null;
        }

        /* synthetic */ C1541h(C1534a aVar) {
            this();
        }
    }

    public C1533a(Context context) {
        this.f4833b = context;
        //this.f4832a = new C1769c(context, m7263f(), new C1536c(this, null));
    }

    /* renamed from: f */
    private String m7263f() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < 8) {
            switch (7 - i) {
                case 0:
                    str = "BAQADIwCf6KtJIIMgfzMfsfUYyxaRJK8FV70NUFRI6asOcl1b6+Az8mfggmo1R99dK";
                    break;
                case 1:
                    str = "t35Ipwb+iPF1k21KaJw17edzF81UXLG59pjGzQ9bUAq0lYE2WZMHl88KB8DNVOd";
                    break;
                case 2:
                    str = "ODM3bXNuZTRlVUc5Z0dQRkFYRzczN1oyVEZNN1BQMEZJTUNOWjRlSEt5V0VPb21ud3l5QXRzYg==";
                    break;
                case 3:
                    str = "SjQYjfT6YuqPoBnkx0C0c14NFDLHukmOkHUDwEZHCQfJ8xIz3k5";
                    break;
                case 4:
                    str = "zLm7eF5RZ4Aph34JpvcWD3WYDbvLnEvKFaxXAFbgj94SHBXCTOhc5HdmBCCer";
                    break;
                case 5:
                    str = "RXoyVzFTZTdTeXhRUWwza2kzVWczVmNl";
                    break;
                case 6:
                    str = "PVqAavDy07Ml";
                    break;
                case 7:
                    str = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjXx6XiXF4";
                    break;
                default:
                    str = "";
                    break;
            }
            int i2 = i + 1;
            if (i2 % 3 == 0) {
                str = new String(Base64.decode(str, 0));
            }
            if (i2 % 2 == 0) {
                str = new StringBuilder(str).reverse().toString();
            }
            if (i != 0) {
                sb.append("/");
            }
            sb.append(str);
            i = i2;
        }
        return sb.toString();
    }

    /* renamed from: c */
    /*public SkuDetails mo6457c() {
        return this.f4832a.mo6905b("iap_premium_subscription_12b_1y");
    }

    *//* renamed from: d *//*
    public final boolean mo6458d() {
        if (!C1769c.m7947a(this.f4833b)) {
            return false;
        }
        mo6452a();
        if (!this.f4832a.mo6907d() || !this.f4832a.mo6909e()) {
            return false;
        }
        return true;
    }*/

    /* renamed from: e */
    /*public final void mo6459e() {
        C1769c cVar = this.f4832a;
        if (cVar != null && cVar.mo6907d()) {
            this.f4832a.mo6911f();
        }
    }*/

    /* renamed from: b */
    public final C1540g mo6456b() {
        C1541h hVar = new C1541h(null);
        //m7261a((C1539f) new C1534a(hVar));
        return hVar.f4841a;
    }

    /* renamed from: a */
    /*public final boolean mo6455a(int i, int i2, Intent intent) {
        return this.f4832a.mo6903a(i, i2, intent);
    }

    *//* renamed from: a *//*
    public final void mo6452a() {
        if (!this.f4832a.mo6907d()) {
            this.f4832a.mo6899c();
        }
    }
*/
    /* renamed from: a */
    public final void mo6454a(C1538e eVar) {
       // m7261a((C1539f) new C1535b(this, eVar));
    }

    /* renamed from: a */
    /*public final void mo6453a(Activity activity, boolean z, C1537d dVar) {
        int i;
        if (C1769c.m7947a((Context) activity)) {
            mo6452a();
            if (!this.f4832a.mo6907d() || !this.f4832a.mo6909e()) {
                i = R.string.error_iap_unavailable;
            } else {
                this.f4834c = dVar;
                String str = z ? "iap_premium_subscription_12b_1y" : C1507c.m7117c() ? "iap_premium_subscription_2b_1m" : "iap_premium_subscription_2b_3m";
                this.f4832a.mo6904a(activity, str);
                i = -1;
            }
        } else {
            i = R.string.error_iap_unsupported;
        }
        if (i != -1) {
            dVar.mo6467b(activity.getString(i));
        }
    }*/

    /* renamed from: a */
   /* private void m7261a(C1539f fVar) {
        String str = "iap_premium_subscription_2b_1m";
        String str2 = "subs";
        if (this.f4832a.mo6910e(str)) {
            fVar.mo6460a(str, str2, "one month");
            return;
        }
        String str3 = "iap_premium_subscription_12b_1y";
        if (this.f4832a.mo6910e(str3)) {
            fVar.mo6460a(str3, str2, "one year");
            return;
        }
        String str4 = "iap_premium_subscription_2b_3m";
        if (this.f4832a.mo6910e(str4)) {
            fVar.mo6460a(str4, str2, "three months");
            return;
        }
        String str5 = "iap_premium_promo";
        if (this.f4832a.mo6908d(str5)) {
            fVar.mo6460a(str5, "inapp", "lifetime");
        } else if (C1517d.m7168c(this.f4833b)) {
            fVar.mo6460a(null, null, "video reward");
        } else {
            fVar.onFailure();
        }
    }*/
}
