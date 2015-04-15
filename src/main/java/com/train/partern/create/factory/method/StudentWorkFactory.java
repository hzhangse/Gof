package com.train.partern.create.factory.method;

public class StudentWorkFactory implements IWorkFactory{
	public Work getWork() {
        return new StudentWork();
    }

}
