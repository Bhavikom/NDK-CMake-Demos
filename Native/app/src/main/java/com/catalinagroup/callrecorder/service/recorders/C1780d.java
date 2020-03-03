package com.catalinagroup.callrecorder.service.recorders;

/* renamed from: com.catalinagroup.callrecorder.j.d */
public abstract class C1780d<T> {

    /* renamed from: a */
    private volatile T f5380a = null;

    /* renamed from: com.catalinagroup.callrecorder.j.d$a */
    class C1781a implements Runnable {
        C1781a() {
        }

        public void run() {
            C1780d.this.m7994d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m7994d() {
        if (this.f5380a == null) {
            this.f5380a = mo6205a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo6205a();

    /* renamed from: b */
    public final T mo6920b() {
        if (this.f5380a != null) {
            return this.f5380a;
        }
        m7994d();
        return this.f5380a;
    }

    /* renamed from: c */
    public final void mo6921c() {
        if (this.f5380a == null) {
            C1827q.f5467b.execute(new C1781a());
        }
    }
}
