interface Interface1 {
    void method1a();
    void method1b();
}

interface Interface2 {
    void method2a();
    void method2b();
}

interface Interface3 {
    void method3a();
    void method3b();
}

interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete method in ConcreteClass");
    }
}

class ImplementationClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void method1a() {
        System.out.println("Implementation of method1a");
    }

    @Override
    public void method1b() {
        System.out.println("Implementation of method1b");
    }

    @Override
    public void method2a() {
        System.out.println("Implementation of method2a");
    }

    @Override
    public void method2b() {
        System.out.println("Implementation of method2b");
    }

    @Override
    public void method3a() {
        System.out.println("Implementation of method3a");
    }

    @Override
    public void method3b() {
        System.out.println("Implementation of method3b");
    }

    @Override
    public void newMethod() {
        System.out.println("Implementation of newMethod");
    }
}

class Methods {
    static void method1(Interface1 obj) {
        System.out.println("Method 1 called");
        obj.method1a();
        obj.method1b();
    }

    static void method2(Interface2 obj) {
        System.out.println("Method 2 called");
        obj.method2a();
        obj.method2b();
    }

    static void method3(Interface3 obj) {
        System.out.println("Method 3 called");
        obj.method3a();
        obj.method3b();
    }

    static void method4(CombinedInterface obj) {
        System.out.println("Method 4 called");
        obj.newMethod();
    }
}

public class JavaAssignment1_3 {
    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();

        Methods.method1(obj);
        Methods.method2(obj);
        Methods.method3(obj);
        Methods.method4(obj);
    }
}
