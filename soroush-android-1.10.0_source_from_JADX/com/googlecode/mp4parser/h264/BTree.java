package com.googlecode.mp4parser.h264;

public class BTree {
    private BTree one;
    private Object value;
    private BTree zero;

    public void addString(String str, Object obj) {
        if (str.length() == 0) {
            this.value = obj;
            return;
        }
        BTree bTree;
        if (str.charAt(0) == '0') {
            if (this.zero == null) {
                this.zero = new BTree();
            }
            bTree = this.zero;
        } else {
            if (this.one == null) {
                this.one = new BTree();
            }
            bTree = this.one;
        }
        bTree.addString(str.substring(1), obj);
    }

    public BTree down(int i) {
        return i == 0 ? this.zero : this.one;
    }

    public Object getValue() {
        return this.value;
    }
}
