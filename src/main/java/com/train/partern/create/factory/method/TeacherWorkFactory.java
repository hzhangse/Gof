package com.train.partern.create.factory.method;

public class TeacherWorkFactory implements IWorkFactory{
	public Work getWork() {
        return new TeacherWork();
    }

}
