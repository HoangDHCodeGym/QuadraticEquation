import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a b c: ");
        equation.setA(scanner.nextDouble());
        equation.setB(scanner.nextDouble());
        equation.setC(scanner.nextDouble());
        System.out.println(equation.toString());
    }
}
