public class Count {

    public static int staticCount = 0;
    public int count = 0;
    public String name; // only used to differentiate the two constructors and does not matter in this example.


    //non-static
    public Count() {

    }

    void incrementStaticCount() {
        staticCount++;
    }

    void incrementCount() {
        count++;
    }

    void display() {

        System.out.println("static count " + staticCount);
        System.out.println("count " + count);
        System.out.println();
    }

    //calculate cube of a number using static method
    static int calculateCube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        //static vs nonstatic for int variable and new object counter
        System.out.println("static example: 3 new objects created have value of 0 and are incremented by 1");
        Count count1 = new Count();
        count1.display();
        count1.incrementStaticCount();
        count1.incrementCount();
        count1.display();




        System.out.println("3 new objects created have the value of 0 set as static so the increments are not saved to memory");

        Count count2 = new Count();
        count2.display();
        System.out.println();


    }
}