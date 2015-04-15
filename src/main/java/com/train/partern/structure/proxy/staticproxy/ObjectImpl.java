package com.train.partern.structure.proxy.staticproxy;

public class ObjectImpl implements Object {

	/*
	 * (non-Javadoc)
	 * @see com.train.proxy.staticproxy.Object#action()
	 */
    public void action() {
        System.out.println("========");
        System.out.println("========");
        System.out.println("这是被代理的类");
        System.out.println("========");
        System.out.println("========");
    }
}
