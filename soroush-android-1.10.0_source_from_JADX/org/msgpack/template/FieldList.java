package org.msgpack.template;

import java.util.ArrayList;
import java.util.List;

public class FieldList {
    private ArrayList<Entry> list = new ArrayList();

    public static class Entry {
        private String name;
        private FieldOption option;

        public Entry() {
            this(null, FieldOption.IGNORE);
        }

        public Entry(String str, FieldOption fieldOption) {
            this.name = str;
            this.option = fieldOption;
        }

        public String getName() {
            return this.name;
        }

        public FieldOption getOption() {
            return this.option;
        }

        public boolean isAvailable() {
            return this.option != FieldOption.IGNORE;
        }
    }

    public void add(String str) {
        add(str, FieldOption.DEFAULT);
    }

    public void add(String str, FieldOption fieldOption) {
        this.list.add(new Entry(str, fieldOption));
    }

    public List<Entry> getList() {
        return this.list;
    }

    public void put(int i, String str) {
        put(i, str, FieldOption.DEFAULT);
    }

    public void put(int i, String str, FieldOption fieldOption) {
        if (this.list.size() < i) {
            do {
                this.list.add(new Entry());
            } while (this.list.size() < i);
            this.list.add(new Entry(str, fieldOption));
            return;
        }
        this.list.set(i, new Entry(str, fieldOption));
    }
}
