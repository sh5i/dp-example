package node;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class Directory extends Entry implements Iterable<Entry> {
    private final String name;

    private final List<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry e : entries) {
            size += e.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        entries.add(entry);
        return this;
    }

    @Override
    public Iterator<Entry> iterator() {
        return entries.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
