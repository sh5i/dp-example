package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private final List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this);
		}
	}

	public abstract int getSize();
	public abstract String getName();
}
