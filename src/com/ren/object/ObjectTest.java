package com.ren.object;

public class ObjectTest {
    public static void main(String[] args){
        Son s1 = new Son();
        Son s2 = new Son();
    }
}
class  GradePar{
    public GradePar(){
        System.out.println("gradepar out");
    }
    {
        System.out.println("gradepar init");
    }
}
class  Parent extends GradePar{
    public Parent(){
        System.out.println("parent out");
    }
    {
        System.out.println("parent init");
    }
}
class Son extends Parent{
    public Son(){
        System.out.println("son out");
    }
    {
        System.out.println("son init");
    }
}