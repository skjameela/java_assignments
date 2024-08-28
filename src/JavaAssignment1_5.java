//5. Create a class with an inner class that has a non-default constructor (one that takes arguments).
// Create a second class with an inner class that inherits from the first inner class.

class Outer {
    class Inner {
        public int value;

        Inner(int value) {
            this.value = value;
        }

        void display() {
            System.out.println("Inner value: " + value);
        }
    }
}

class Second {
    class DerivedInner extends Outer.Inner {
        DerivedInner(Outer outer, int value) {
            outer.super(value);
        }

        void displayDerived() {
            System.out.println("Derived Inner value: " + value);
        }
    }
}

public class JavaAssignment1_5 {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner(10);
        inner.display();

        Second second = new Second();

        Second.DerivedInner derivedInner = second.new DerivedInner(outer, 20);
        derivedInner.display();
        derivedInner.displayDerived();
    }
}
