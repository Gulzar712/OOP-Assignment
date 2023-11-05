import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Basic Calculator");
System.out.println("Supported operations: +, -, *, /");
System.out.print("Enter an expression (e.g., '5 + 10'): ");
String expression = input.nextLine();
String[] parts = expression.split(" ");
if (parts.length != 3) {
System.out.println("Invalid input. Please enter an expression like '5 + 10'.");
return;
}
double num1, num2, result;
try {
num1 = Double.parseDouble(parts[0]);
num2 = Double.parseDouble(parts[2]);
} catch (NumberFormatException e) {
System.out.println("Invalid numbers in the expression.");
return;
}
String operator = parts[1];
switch (operator) {
case "+":
result = num1 + num2;
break;
case "-":
result = num1 - num2;
break;
case "*":
result = num1 * num2;
break;
case "/":
if (num2 == 0) {
System.out.println("Division by zero is not allowed.");
return;
}
result = num1 / num2;
break;
default:
System.out.println("Invalid operator. Please use +, -, *, or /.");
return;
}
System.out.println("Result: " + expression + " = " + result);
}
}