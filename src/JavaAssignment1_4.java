//4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories
// for each type of Cycle, and code that uses these factories.

interface Cyclee {
    void ride();
}

class Unicyclee implements Cyclee {
    @Override
    public void ride() {
        System.out.println("Riding a unicycle.");
    }
}

class Bicyclee implements Cyclee {
    @Override
    public void ride() {
        System.out.println("Riding a bicycle.");
    }
}

class Tricyclee implements Cyclee {
    @Override
    public void ride() {
        System.out.println("Riding a tricycle.");
    }
}

class UnicycleFactory {
    public Cyclee createCycle() {
        return new Unicyclee();
    }
}

class BicycleFactory {
    public Cyclee createCycle() {
        return new Bicyclee();
    }
}

class TricycleFactory {
    public Cyclee createCycle() {
        return new Tricyclee();
    }
}

public class JavaAssignment1_4 {
    public static void main(String[] args) {
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();

        Cyclee unicycle = unicycleFactory.createCycle();
        unicycle.ride();

        Cyclee bicycle = bicycleFactory.createCycle();
        bicycle.ride();

        Cyclee tricycle = tricycleFactory.createCycle();
        tricycle.ride();
    }
}
