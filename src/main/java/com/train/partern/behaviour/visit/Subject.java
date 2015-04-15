package com.train.partern.behaviour.visit;
interface Subject{
	public void accept(Visitor visitor);
	 String getSubject();
}