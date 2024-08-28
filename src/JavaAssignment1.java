//1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that
// are common to all Rodents, and override these in the derived classes to perform different behaviors depending on
// the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
// your base-class methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes
// should have default constructors that print a message about that class.

interface RodentBehavior {
    void eat();
    void sleep();
    void run();
}

abstract class Rodent {
    Rodent() {
        System.out.println("This is a Rodent.");
    }

    abstract void display();
}

class Mouse extends Rodent implements RodentBehavior {
    Mouse() {
        super();
        System.out.println("This is a Mouse.");
    }

    @Override
    public void display() {
        System.out.println("This is a Mouse.");
    }

    @Override
    public void eat() {
        System.out.println("Mouse is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping.");
    }

    @Override
    public void run() {
        System.out.println("Mouse is running.");
    }
}

class Gerbil extends Rodent implements RodentBehavior {
    Gerbil() {
        super();
        System.out.println("This is a Gerbil.");
    }

    @Override
    public void display() {
        System.out.println("This is a Gerbil.");
    }

    @Override
    public void eat() {
        System.out.println("Gerbil is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Gerbil is sleeping.");
    }

    @Override
    public void run() {
        System.out.println("Gerbil is running.");
    }
}

class Hamster extends Rodent implements RodentBehavior {
    Hamster() {
        super();
        System.out.println("This is a Hamster.");
    }

    @Override
    public void display() {
        System.out.println("This is a Hamster.");
    }

    @Override
    public void eat() {
        System.out.println("Hamster is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping.");
    }

    @Override
    public void run() {
        System.out.println("Hamster is running.");
    }
}

public class JavaAssignment1 {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent rodent : rodents) {
            rodent.display();
            if (rodent instanceof RodentBehavior) {
                RodentBehavior behavior = (RodentBehavior) rodent;
                behavior.eat();
                behavior.sleep();
                behavior.run();
                System.out.println();
            }
        }
    }
}

