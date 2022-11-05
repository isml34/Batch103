package day23inheritancepolymorphism;

import day23inheritancepolymorphism.Courses;

public class Math extends Courses {
    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){
        super("X");

        System.out.println("Constructor 1");
    }

    public Math(int a){
        this();
         // Ayni Class'in icinde diger Constructor'i kullan
        System.out.println("Constructor 2");
    }
}
