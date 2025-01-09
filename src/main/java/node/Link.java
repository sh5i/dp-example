package node;

import visitor.Visitor;

public class Link extends Entry {

	private final File realSubject;
	
	public Link(File realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public String getContent() {
		return realSubject.getContent();
	}

	@Override
	public void setContent(String content) {
		realSubject.setContent(content);
	}

	@Override
	public String getName() {
		return realSubject.getName();
	}

	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String toString() {
        return getName() + " (0)";
	}
}
