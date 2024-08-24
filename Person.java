 class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the name
    public void displayName() {
        System.out.println("Name: " + name);
    }

    // Method to display the age
    public void displayAge() {
        System.out.println("Age: " + age);
    }

    // Main method 
    public static void main(String[] args) {
       
        Person person1 = new Person("GAYATRI_GARJE_JAVA INTERN_XENOSIS_IT SOLUTIONS", 21);
        
        
        person1.displayName();  
        person1.displayAge();   
    }
}
