package ir.pec.mpl.pecpayment.view;

class C2376b implements Runnable {
    final /* synthetic */ CheckMarkView f7897a;

    C2376b(CheckMarkView checkMarkView) {
        this.f7897a = checkMarkView;
    }

    public void run() {
        this.f7897a.invalidate();
        this.f7897a.f7810b = this.f7897a.f7810b + this.f7897a.f7811c;
        this.f7897a.m6538c();
    }
}
