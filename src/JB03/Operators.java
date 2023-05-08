package JB03;

public class Operators {
    int a = 10;
    int b = 15;
    int c = 30;

    public void comparisonOperators(){
        System.out.println(a + " is equals to "+ b + ": " + (a == b));
        System.out.println(a + " is not equals "+ b + ": " + (a != b));
        System.out.println(a + " is greater than "+ b + ": " + (a > b));
        System.out.println(a + " is less than "+ c + ": " + (a < c));
        System.out.println(a + " is greater than or equal to "+ c + ": " + (a >= c));
        System.out.println(a + " is less than or equal to "+ c + ": " + (a <= c));
    }
    public void logicalOperators(){
        System.out.println("Logical and: " + ((a > b) && (a > c)));
        System.out.println("Logical or: " + ((a > b) || (a <= c)));
        System.out.println("Logical not: " + !(a==b));
    }

public void classifyAge(int age){
        System.out.print("You are "+ age);
        if(age < 18){
            System.out.println(" => You are children!");
        }else if (age >= 18 && age < 65){
            System.out.println(" => You are adult!");
        }else if(age >= 65){
            System.out.println(" => You are senior!");
        }

}
    public static void main(String[] args) {
        Operators op = new Operators();
        op.comparisonOperators();
        op.logicalOperators();
        op.classifyAge(17);
        op.classifyAge(23);
        op.classifyAge(70);
    }
}
