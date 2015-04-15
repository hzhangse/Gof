package com.train.partern.structure.bridge;

public class Test {
    public static void main(String[] args) {
        
        Person man = new Man();
        
        Person lady = new Lady();
        
        Clothing jacket = new jacket();
        
        Clothing trouser = new Trouser();
        
//        jacket.personDressCloth(man);
//        trouser.personDressCloth(man);
//
//        jacket.personDressCloth(lady);
//        trouser.personDressCloth(lady);
        man.setClothing();
        lady.setClothing();
        man.dress();
        lady.dress();
    }

}
