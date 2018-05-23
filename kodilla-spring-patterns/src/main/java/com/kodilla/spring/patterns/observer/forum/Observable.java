package com.kodilla.spring.patterns.observer.forum;

public interface Observable {
	void registerObserver(Observer observer);
	void notifyObservers();
	void removeObserver(Observer observer);
	
}
