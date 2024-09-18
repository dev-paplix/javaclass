public class Person {

    private String name;
    private int gpaFirst = 3;
    private int gpaSecond = 4;
    private int gpaSum = gpaFirst + gpaSecond;
    

    public Person(String name, int gpaFirst, int gpaSecond, int gpaSum) {
        this.name = name;
        this.gpaFirst = gpaFirst;
        this.gpaSecond = gpaSecond;
        this.gpaSum =gpaSum;
    }

    public void dispalyDetails() {

        
        int maxInt = Integer.MAX_VALUE;
        long maxPlusOne = 2147483648L;
        boolean conditon = false;

        System.out.println(maxPlusOne);
        System.out.println(maxInt);
        System.out.println("Name is: " + name);
        System.out.println("The age is: " + gpaSum);
    }

    public static void main(String[] args){
        double gpaFirst = 3;
        int gpaSecond = 4;
        double gpaSum = (gpaFirst + gpaSecond)/2;
        System.out.println(gpaSum);
    }
    
}
