package com.train.partern.behaviour.visit;

public class MySubject implements Subject{
	String name;
	public MySubject(String name) {
		this.name= name;
	}

	public void accept(Visitor visitor) {
		visitor.vistor(this);
		
	}

	public String getSubject() {
		return name;
		
	}

}
