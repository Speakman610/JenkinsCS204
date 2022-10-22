import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("\n" +
                "╔╦╗┬ ┬┌─┐  ╔═╗┌─┐┬  ┌─┐┬ ┬┬  ┌─┐┌┬┐┌─┐┬─┐\n" +
                " ║ ├─┤├┤   ║  ├─┤│  │  │ ││  ├─┤ │ │ │├┬┘\n" +
                " ╩ ┴ ┴└─┘  ╚═╝┴ ┴┴─┘└─┘└─┘┴─┘┴ ┴ ┴ └─┘┴└─\n");
        System.out.println("Enter a command: ");
        Scanner scanner = new Scanner(System.in);
        int result;
        boolean exit = false;

        while (!exit) {
            String command = scanner.next();
            switch (command) {
                case "add":
                    result = calculator.add(scanner.nextInt(), scanner.nextInt());
                    System.out.println(result);
                    break;
                case "subtract":
                    result = calculator.subtract(scanner.nextInt(), scanner.nextInt());
                    System.out.println(result);
                    break;
                case "multiply":
                    result = calculator.multiply(scanner.nextInt(), scanner.nextInt());
                    System.out.println(result);
                    break;
                case "divide":
                    result = calculator.divide(scanner.nextInt(), scanner.nextInt());
                    System.out.println(result);
                    break;
                case "fibonacci":
                    result = calculator.fibonacciNumberFinder(scanner.nextInt());
                    System.out.println(result);
                    break;
                case "binary":
                    String resultStr = calculator.intToBinaryNumber(scanner.nextInt());
                    System.out.println(resultStr);
                    break;
                case "help":
                    System.out.println("add x y -> x+y");
                    System.out.println("subtract x y -> x-y");
                    System.out.println("multiply x y -> x*y");
                    System.out.println("divide x y -> x/y");
                    System.out.println("fibonacci x -> xth fibonacci number");
                    System.out.println("binary x -> x to binary");
                    System.out.println("exit -> close program");
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid command. Type 'help' for a list of valid commands.");
            }
        }

    }
}
