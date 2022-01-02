package oops;
//Inheritance
//super keyword refer to immediate parent
//super() use to call parent class constructor from inside child class constructor
public class Dog extends  Animal{

    public Dog(){
        super();
        System.out.println("This work");
    }
    int x =4;
    public  void speak(){
        super.eating();
        System.out.printf(String.valueOf(super.x));
        System.out.println(this.x);

    }
}
