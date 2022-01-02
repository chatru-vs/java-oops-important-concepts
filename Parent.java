package oops;

class A{

}

class B extends A{

}
// runtime polymorphism
// static polymorphism
public class Parent {
    //overridden method
    public A m1(){
        System.out.println("I am m1() of a parent" );
        return new A();
    }
}

class Child extends Parent{
    //overriding method
    //co-varient return types are allow
    public B m1(){
        System.out.println("i am m1 of child");
        return new B();
    }

}
