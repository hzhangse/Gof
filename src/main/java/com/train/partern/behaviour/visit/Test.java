package com.train.partern.behaviour.visit;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MutiSubject t = new MutiSubject();
		t.addChild(new MySubject("a"));
		t.addChild(new MySubject("b"));
		t.accept(new ConcreteVisitor());
	}

}
