//2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method
// to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
// them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results.
// Downcast and call balance( ) and observe what happens.

class Cycle {
    void ride() {
        System.out.println("Riding a cycle.");
    }
}

class Unicycle extends Cycle {
    void balance() {
        System.out.println("Balancing on a unicycle.");
    }
}

class Bicycle extends Cycle {
    void balance() {
        System.out.println("Balancing on a bicycle.");
    }
}

class Tricycle extends Cycle {
    // Tricycle doesn't have a balance method
}

public class JavaAssignment1_2 {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for (Cycle cycle : cycles) {
            cycle.ride();

            if (cycle instanceof Unicycle) {
                ((Unicycle) cycle).balance();
            } else if (cycle instanceof Bicycle) {
                ((Bicycle) cycle).balance();
            } else {
                System.out.println("Cannot balance this cycle.");
            }
            System.out.println();
        }
    }
}

