package com.train.partern.behaviour.iterator;

public interface List {

    Iterator iterator();
    
    Object get(int index);
    
    int getSize();
    
    void add(Object obj);
}
