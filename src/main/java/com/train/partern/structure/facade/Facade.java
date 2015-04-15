package com.train.partern.structure.facade;

public class Facade {
    ServiceA sa;
    
    ServiceB sb;
    
    ServiceC sc;
    
    public Facade() {
        sa = new ServiceAImpl();
        sb = new ServiceBImpl();
        sc = new ServiceCImpl(); 
    }
    
    public void methodA() {
        sa.methodA();
        sb.methodB();
    }
    
    public void methodB() {
        sa.methodA();
        sc.methodC();
    }
    
    public void methodC() {
        sc.methodC();
        sa.methodA();
    }

}
