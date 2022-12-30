import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        double result;
        Scanner userInput = new Scanner(System.in);
        Calculation calc = new Calculation();
        do {
            try {
                System.out.println("=== Menu Program ===");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trapezoid");
                System.out.println("0. Exit");
                System.out.print("Select menu : ");

                int menu = userInput.nextInt();

                switch (menu) {
                    case 1: // Square
                        System.out.print("Enter the length of the side of the square : ");
                        double squareSide = userInput.nextDouble();
                        calc.setSquare(squareSide);
                        result = calc.getSquare();

                        calc.run();
                        System.out.println("The Calculation result : " + result);
                        break;
                    case 2: // Circle
                        System.out.print("Enter the radius of the circle : ");
                        double circleRadius = userInput.nextDouble();
                        calc.setCircle(circleRadius);
                        result = calc.getCircle();

                        calc.run();
                        System.out.println("The Calculation result : " + result);
                        break;
                    case 3:
                        System.out.print("Insert the side of the base of the trapezoid : ");
                        double baseSide = userInput.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double upperSide = userInput.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double height = userInput.nextDouble();
                        calc.setTrapezoid(upperSide, baseSide, height);
                        result = calc.getTrapezoid();

                        calc.run();
                        System.out.println("The Calculation result : " + result);
                        break;
                    case 0:
                        System.out.println("Program ended!");
                        break;
                    default:
                        System.out.println("Option not Available");

                        continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n====Error: Input must be a number====");
                userInput.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            repeat = false;

        } while (repeat);
        userInput.close();
    }
}
