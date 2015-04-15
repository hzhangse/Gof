package com.train.partern.behaviour.visit;

public class ConcreteVisitor implements Visitor {

	public ConcreteVisitor() {
		// TODO Auto-generated constructor stub
	}

	public void vistor(Subject obj) {
		System.out.println(obj.getSubject());
	}

	public void vistorMuti(Subject obj) {
		
		System.out.println(obj.getSubject());
	}

}
