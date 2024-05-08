//Create three new types of exceptions. Write a class with a method that throws all three. In main( ),
// call the method but only use a single catch clause that will catch all three types of exceptions.
// Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.

class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}

class CustomException2 extends Exception {
    public CustomException2(String message) {
        super(message);
    }
}

class CustomException3 extends Exception {
    public CustomException3(String message) {
        super(message);
    }
}

class ExceptionThrower {
    void throwExceptions() throws CustomException1, CustomException2, CustomException3 {
        throw new CustomException1("Exception 1 occurred.");

    }
}

public class JavaAssignment2 {
    public static void main(String[] args) {
        ExceptionThrower thrower = new ExceptionThrower();

        try {
            thrower.throwExceptions();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");

            String str = null;
            try {
                System.out.println("Length of string: " + str.length());
            } catch (NullPointerException npe) {
                System.out.println("NullPointerException caught: " + npe.getMessage());
            }
        }
    }
}


