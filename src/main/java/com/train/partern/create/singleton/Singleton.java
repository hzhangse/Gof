package com.train.partern.create.singleton;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() {

	}

	public synchronized static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
	public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        
        System.out.println(sing);
        System.out.println(sing2);
    }
}
