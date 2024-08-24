public class Calculator {
    private double num1;
    private double num2;

    // Default constructor
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // Constructor with one parameter
    public Calculator(double num1) {
        this.num1 = num1;
        this.num2 = 0;
    }

    // Constructor with two parameters
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to perform addition (overloaded - no arguments)
    public double add() {
        return this.num1 + this.num2;
    }

    // Method to perform addition (overloaded - one argument)
    public double add(double num) {
        return this.num1 + num;
    }

    // Method to perform addition (overloaded - two arguments)
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Using the default constructor
        Calculator calc1 = new Calculator();
        System.out.println("Default constructor sum: " + calc1.add()); // Output: 0.0

       
        Calculator calc2 = new Calculator(5);
        System.out.println("One parameter constructor sum: " + calc2.add()); // Output: 5.0
        System.out.println("One parameter constructor with method overloading sum: " + calc2.add(10)); // Output: 15.0

        
        Calculator calc3 = new Calculator(10, 20);
        System.out.println("Two parameter constructor sum: " + calc3.add()); // Output: 30.0
        System.out.println("Method overloading with two arguments sum: " + calc3.add(5, 5)); // Output: 10.0
    }
}

