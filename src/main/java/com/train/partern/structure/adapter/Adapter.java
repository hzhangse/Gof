package com.train.partern.structure.adapter;

public class Adapter implements Target {
	//引入被适配者
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	// 实现目标接口
	public void adapteeMethod() {
		adaptee.adapteeMethod();
	}

	public void adapterMethod() {
		System.out.println("Adapter method!");
	}

}
