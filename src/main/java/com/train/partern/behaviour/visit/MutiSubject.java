package com.train.partern.behaviour.visit;

import java.util.ArrayList;
import java.util.List;

public class MutiSubject implements Subject {
	List<Subject> childlst = new ArrayList<Subject>();

	public MutiSubject() {

	}

	public void accept(Visitor visitor) {
		
		visitor.vistorMuti(this);

	}

	public void addChild(Subject obj){
		childlst.add(obj);
	}
	public String getSubject() {
		String result = "";
		for (Subject child:childlst){
			result = result + child.getSubject();
		}
		return result;
	}

}
