package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {

    Child(){
        super();

        System.out.println("child class parametresiz con");
    }
    Child(int s){
        System.out.println("child class parametreli cons");

    }
    Child(int sayı1,int sayı2){
        super(sayı1,sayı1);
        System.out.println("child iki parametreli cons");
    }


    public static void main(String[] args) {
        Child child=new Child(5,8);
    }
}
