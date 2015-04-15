package com.train.partern.structure.bridge;

public class ClothingFactory {
	public static Clothing getClothing(){
		return new jacket();
	}
}
