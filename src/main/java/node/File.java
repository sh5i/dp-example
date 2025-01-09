package node;

import visitor.Visitor;

public class File extends Entry {
    private final String name;
    private int size;
    private String content;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void setSize(int size) {
    	this.size = size;
    	notifyObservers();
    }

    public void setContent(String content) {
    	this.content = content;
    }

    @Override
    public String getContent() {
    	return content;
    }
}
