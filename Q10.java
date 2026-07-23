import java.io.*;

interface testInterface {
    final int a = 10;
    void display();
}

class TestClass implements testInterface {
    public void display(){ 
        System.out.println("Miracle Software Systems"); 
    }
}

class Q10 {
    public static void main(String[] args){
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}
