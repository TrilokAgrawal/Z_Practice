package com.app.observer;

import java.util.Observable;

public class Subject extends Observable {
	
	private String message;
	
	public Subject() {
	}
	
	public void change(String msg) {
		message = msg;
		setChanged();
		notifyObservers(message);
	}
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		Candidate c = new Candidate();
		
		subject.addObserver(c);
		
		subject.change("trilok");
	}

}
