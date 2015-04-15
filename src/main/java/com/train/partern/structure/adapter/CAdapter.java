package com.train.partern.structure.adapter;

public class CAdapter extends Adaptee implements Target {
	// 实现目标接口
	public void adapteeMethod() {
		super.adapteeMethod();
		System.out.println("Adaptee method!");
	}

	public void adapterMethod() {
		System.out.println("Adapter method!");
	}
}
