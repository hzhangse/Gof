package com.train.partern.create.builder;

public interface PersonBuilder {
    void buildHead();
    
    void buildBody();
    
    void buildFoot();

    Person buildPerson();

}
