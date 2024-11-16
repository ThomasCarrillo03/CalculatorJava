import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Selecct what do you want: sume (+), rest (-), multiplicate(*), divide (/):");
        char operation = scanner.next().charAt(0);

        System.out.println("Give me your second number:");
        double num2 = scanner.nextDouble();

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Dividing by 0 is not possible.");
                    return;
                }
                break;
            default:
                System.out.println("Operation not valid.");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
