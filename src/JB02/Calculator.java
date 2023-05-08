package JB02;

public class Calculator {

    public int sumInt(int x, int y) {
        return x + y;
    }

    public double multipleDouble(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Sum of 10 and 5 equals: " + cal.sumInt(10, 5));
        System.out.println("Multiplication of 2.5 and 2.8 equals: " + cal.multipleDouble(2.5, 2.8));
    }
}
