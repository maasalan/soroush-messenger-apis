package ir.pec.mpl.pecpayment.view;

class C2379e implements Runnable {
    final /* synthetic */ ErrorMarkView f7926a;

    C2379e(ErrorMarkView errorMarkView) {
        this.f7926a = errorMarkView;
    }

    public void run() {
        this.f7926a.invalidate();
        this.f7926a.f7816b = this.f7926a.f7816b + this.f7926a.f7817c;
        this.f7926a.m6547c();
    }
}
