package observer;

import node.Entry;

public class SizeObserver implements Observer {
	@Override
	public void update(Entry entry) {
		System.out.println("file: " + entry.getName() +  ", size : " + entry.getSize());
	}
}
