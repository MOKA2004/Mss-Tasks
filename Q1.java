
class Parent {
    void display() { System.out.println("Parent class"); }
}

class Child extends Parent {
    void show() { System.out.println("Child class"); }
}

class GrandParent {
    void greet() { System.out.println("Grandparent class"); }
}

class Parent2 extends GrandParent {
    void hello() { System.out.println("Parent class"); }
}

class Child2 extends Parent2 {
    void hi() { System.out.println("Child class"); }
}

class Cartype {
    void car() { System.out.println("Car type"); }
}

class Petrol extends Cartype {
    void gas() { System.out.println("Petrol car"); }
}

class Diesel extends Cartype {
    void fuel() { System.out.println("Diesel car"); }
}

public class Q1{
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();

        Child2 c2 = new Child2();
        c2.greet();
        c2.hello();
        c2.hi();

        Petrol p = new Petrol();
        p.car();
        p.gas();

        Diesel d = new Diesel();
        d.car();
        d.fuel();
    }
}
