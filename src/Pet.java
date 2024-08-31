public class Pet {
    public static String owner = "Camilla";
    public String petName;

    public Pet(String name) {
        this.petName = name;
    }

    //static method to change the static variable with an input
    static void changeOwner(String ownerName){
        owner = ownerName;
//        System.out.println("Species: " + species + "Name: " + name);  <===this will not work because a static method can not reference a non static data member
    }

    static void displayOwner(){
        System.out.println("Pet Owner: "+ owner);

    }

    public static void main(String[] args) {
        /**
         * Static Variable example:
         * a static property is shared to all objects
         * does not need an object, does not need a new instance of a class.
         * public static String name = "Isa";
         * call the object and then the variable name: Person.name
         */
        System.out.println("static example: does not need objects and is the same for all variables");
        System.out.println("Pet owner: " + Pet.owner);
        System.out.println();

        /**
         * Without static example:
         * the String name variable is nonstatic and needs an object.
         * create a constructor and add name as a variable to fulfill this new instance of Person named "Isabella"
         * public String name1;
         * create a new Person named person1, and call their name under variable name1
         */
        System.out.println("nonstatic example: needs a new instance of object and is assigned to that new object");
        Pet pet = new Pet("Minnie");
        Pet.displayOwner();

        Pet.changeOwner("Isabella");
        Pet.displayOwner();



        /**
         * Static methods
         *  static method belongs to the class (the template) rather than the object.
         *  a static method can be invoked and called without creating a new instance of a class.
         *  a static method can access a static data member and change its value.
         *  The static method can not use non static data member or call non-static method directly.
         *  this and super cannot be used in static context.
         */

    }

}






// Class representing a Person
//class Person {
//    private String name; // Name of the person
//    private int age; // Age of the person
//
//    // Constructor to initialize the person with name and age
//    public Person(String name, int age) {
//        this.name = name; // Set the name of the person
//        this.age = age; // Set the age of the person
//    }
//
//    // Getter method for the name
//    public String getName() {
//        return name; // Return the name of the person
//    }
//
//    // Getter method for the age
//    public int getAge() {
//        return age; // Return the age of the person
//    }
//
//    // Override the toString method to provide a string representation of the person
//    @Override
//    public String toString() {
//        // Return a string representation of the person including name and age
//        return "Person{name='" + name + "', age=" + age + "}";
//    }
//}