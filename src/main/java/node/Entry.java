package node;

import java.util.Iterator;
import observer.Subject;

import visitor.Element;

public abstract class Entry extends Subject implements Element {

    public abstract String getName();

    public String getContent() {
    	throw new UnsupportedOperationException();
    }

    public void setContent(String content) {
    	throw new UnsupportedOperationException();
    }

    public abstract int getSize();

    public Entry add(Entry entry)  {
        throw new UnsupportedOperationException();
    }

    public Iterator<Entry> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
