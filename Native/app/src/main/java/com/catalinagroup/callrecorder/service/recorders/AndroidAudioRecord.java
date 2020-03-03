package com.catalinagroup.callrecorder.service.recorders;

import android.content.Context;

/*import com.yasoka.cubecallrecord.C1414a;
import com.yasoka.cubecallrecord.p123j.C1801j;
import com.yasoka.cubecallrecord.p123j.C1827q;*/
/*import com.catalinagroup.callrecorder.C1414a;
import com.catalinagroup.callrecorder.C1414a.C1416b;
import com.catalinagroup.callrecorder.p123j.C1801j;
import com.catalinagroup.callrecorder.p123j.C1827q;*/

public class AndroidAudioRecord {
    private static volatile Boolean initResult_;
    private final int audioSourceFrom_;
    private long jniHandle_ = 0;
    private boolean started_;

    /* renamed from: com.catalinagroup.callrecorder.service.recorders.AndroidAudioRecord$a */
    static class C1873a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ Context f5563c;

        C1873a(Context context) {
            this.f5563c = context;
        }

        public void run() {
            AndroidAudioRecord.m8236c(this.f5563c);
        }
    }

    public AndroidAudioRecord(Context context, int i, int i2, int i3, int i4, int i5, int i6, byte b) {
        synchronized (this) {
            this.audioSourceFrom_ = i6;
            int a = m8232a(i2, i3, i4);
            if (a > 0) {
                nativeCreate(context, i, i2, i3, i4, a * i5, i6, b);
            }
        }
    }

    /* renamed from: b */
    public static void m8235b(Context context) {
        C1827q.f5466a.execute(new C1873a(context));
    }

    /* renamed from: d */
    public static boolean m8237d(Context context) {
        if (initResult_ != null) {
            return initResult_.booleanValue();
        }
        return m8236c(context);
    }

    private native int nativeCreate(Context context, int i, int i2, int i3, int i4, int i5, int i6, byte b);

    private static native int nativeGetInputBufferSize(int i, int i2, int i3);

    private static native boolean nativeInit(Context context);

    private native int nativeRead(byte[] bArr, int i);

    private native boolean nativeRelease();

    private static native int nativeSetAudioMode(int i);

    private native int nativeStart(int i, int i2);

    private native int nativeStop();

    /* renamed from: c */
    public void mo7011c() {
        synchronized (this) {
            if (this.started_) {
                nativeStop();
            }
            this.started_ = false;
        }
    }

    /* renamed from: a */
    public static int m8232a(int i, int i2, int i3) {
        return nativeGetInputBufferSize(i, i2, i3);
    }

    /* renamed from: b */
    public void mo7010b() {
        synchronized (this) {
            nativeRelease();
        }
    }

    /* renamed from: a */
    public static void m8233a(Context context, int i) {
        if (initResult_ == null) {
            m8236c(context);
        }
        nativeSetAudioMode(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static synchronized boolean m8236c(Context context) {
        boolean booleanValue;
        synchronized (AndroidAudioRecord.class) {
            if (initResult_ == null) {
                try {
                    System.loadLibrary("cubeacr");
                    initResult_ = Boolean.valueOf(nativeInit(context));
                } catch (Throwable unused) {
                    initResult_ = Boolean.valueOf(false);
                }
                if (!initResult_.booleanValue()) {
                    //C1414a.m6762a(C1414a.C1416b.SoftRecordNegative, C1801j.m8067b());
                }
            }
            booleanValue = initResult_.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    public int mo7007a(int i) {
        int nativeStart = nativeStart(this.audioSourceFrom_, i);
        if (nativeStart == 0) {
            this.started_ = true;
        }
        return nativeStart;
    }

    /* renamed from: a */
    public boolean mo7009a() {
        return this.started_;
    }

    /* renamed from: a */
    public int mo7008a(byte[] bArr, int i) {
        return nativeRead(bArr, i);
    }
}
