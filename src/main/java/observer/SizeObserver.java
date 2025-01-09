package observer;

import node.Entry;

public class SizeObserver implements Observer {
	@Override
	public void update(Subject subject) {
		System.out.println("file: " + subject.getName() +  ", size : " + subject.getSize());
	}
}
