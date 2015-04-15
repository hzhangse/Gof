package com.train.partern.behaviour.strategy;

public class Context {
    Strategy stra;
    
    public Context(Strategy stra) {
        this.stra = stra;
    }
    
    public void doMethod() {
        stra.method();
    }

}
